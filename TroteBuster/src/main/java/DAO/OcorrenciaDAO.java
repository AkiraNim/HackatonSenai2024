package DAO;

import DTO.OcorrenciaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class OcorrenciaDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
   
    public void criarOcorrencia(OcorrenciaDTO ocorrencia){
        String sql = "INSERT INTO ocorrencias_trote(telefone_id, usuario_id, descricao) VALUES(?, ?, ?)";
        
        conn = new ConnectionDAO().connectDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, ocorrencia.getId_tel());
            pstm.setInt(2, ocorrencia.getId_user());
            pstm.setString(3, ocorrencia.getOcorrencia());
            
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException e) {
            
        }
    }
    public ArrayList<OcorrenciaDTO> listar(){
        ArrayList<OcorrenciaDTO> ocorrencias = new ArrayList<>();
        
        String sql = "SELECT * FROM ocorrencias_trote";
        
        conn = new ConnectionDAO().connectDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                OcorrenciaDTO ocorrencia = new OcorrenciaDTO(
                rs.getInt("id"),
                rs.getString("descricao"),
                rs.getInt("usuario_id"),
                rs.getInt("telefone_id"));
                
                ocorrencias.add(ocorrencia);
            }
        } catch (SQLException e) {
        }
        
        return ocorrencias;
    }
    public ArrayList<OcorrenciaDTO> buscarTelefone(String telefone){
        String sql = "CALL buscar_ocorrencias_por_telefone(?)";
        
        conn = new ConnectionDAO().connectDB();
        
       ArrayList<OcorrenciaDTO> ocorrencias = new ArrayList<>();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, telefone);
            
            pstm.execute();
            pstm.close();
            
            ResultSet executeQuery = pstm.executeQuery();
            while(executeQuery.next()){
                OcorrenciaDTO ocorrencia = new OcorrenciaDTO(
                rs.getString("numero"),
                rs.getString("descricao"),
                rs.getDate("dt"),
                rs.getTime("tp"));
                
                ocorrencias.add(ocorrencia);
                
                return ocorrencias;
            }
        } catch (SQLException e) {
        }
        return null;
    }
    public static void main(String[] args) {
        OcorrenciaDAO ocorrencia = new OcorrenciaDAO();
        
        System.out.println(ocorrencia.buscarTelefone("9919"));
        
    }
}
