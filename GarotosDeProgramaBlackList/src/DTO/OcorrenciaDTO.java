package DTO;

public class OcorrenciaDTO {
    private String ocorrencia;
    private int id, id_user, id_tel;

    public OcorrenciaDTO(int id, String ocorrencia, int id_user, int id_tel) {
        this.id = id;
        this.ocorrencia = ocorrencia;
        this.id_user = id_user;
        this.id_tel = id_tel;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_tel() {
        return id_tel;
    }

    public void setId_tel(int id_tel) {
        this.id_tel = id_tel;
    }
}
