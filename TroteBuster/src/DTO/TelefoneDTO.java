package DTO;

public class TelefoneDTO {
    private int id_tel;
    private String tel, ddd;

    public TelefoneDTO(int id_tel, String tel, String ddd) {
        this.id_tel = id_tel;
        this.tel = tel;
        this.ddd = ddd;
    }

    public int getId_tel() {
        return id_tel;
    }

    public void setId_tel(int id_tel) {
        this.id_tel = id_tel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}
