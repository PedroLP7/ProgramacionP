package pruebasui;

public class Admin {
    private  String user="admin";
    private   String password="admin";


    public Admin() {
    }

    public Admin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return this.user;
    }



    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
