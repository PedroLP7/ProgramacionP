package pruebasui;

public class Client {
    private String user;
    private String password;

    public Client(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
