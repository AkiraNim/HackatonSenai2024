package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDAO {
    public Connection connectDB(){
        Connection conn = null;

        try {
                String url = "jdbc:mysql://10.102.50.38:3306/trotebuster?user=admins_projeto&password=GarotosdeP";

                conn = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "Conexão estabelecida");
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;	
    }
    
    public static void main(String[] args) {
        ConnectionDAO conn = new ConnectionDAO();
        conn.connectDB();
    }
}
