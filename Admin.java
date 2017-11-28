package resultmanagement;

public class Admin{
    private int id;
    private String username;
    private String password;

    public Admin(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public void manageRegister(){
        //here
    }
    public void margeResult(){
        //here
    }
    public void publishResult(){
        //here
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}