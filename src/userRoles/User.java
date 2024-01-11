package userRoles;

public class User {
    private String username;
    private int userId;
    private Role role;
    private static int  nextId=1;
    //should have been in method in Users

    public User(String username, Role role){
        this.username = username;
        this.role = role;
        setUserId();
    }
    public void setUserId(){
        this.userId = nextId;
        nextId++;
    }
    public int getUserId(){
        return userId;
    }
    public Role getRole(){
        return role;
    }
    public String getUsername(){
        return username;
    }
}
