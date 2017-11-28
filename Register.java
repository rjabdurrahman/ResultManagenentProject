package resultmanagement;

public class Register{
    private int id;
    private String username;
    private String password;

    public Register(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public void addCourses(){
        //here
    }
    public void addStudent(){
        //here
    }
    public void addTeacher(){
        //here
    }
    public void regStudentCourses(){
        //here
    }
    public void regTeacherCourses(){
        //here
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}