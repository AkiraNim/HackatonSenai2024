package DTO;

public class UsuarioDTO {
    private int id;
    private String name, user, passcode;

    public UsuarioDTO(int id, String name, String user, String passcode) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.passcode = passcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
}
