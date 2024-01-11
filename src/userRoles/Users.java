package userRoles;

import java.util.ArrayList;

public class Users {
    public static void main(String[] args) {
        new Users().run();
    }
    ArrayList<User> users = new ArrayList<>();
    private void run() {
        createUser("meme", Role.ADMIN);
        createUser("blabla", Role.READER);
        createUser("lulu", Role.READER);

        for (User user : getSpecificUsers(Role.READER)){
            System.out.println(user.getUsername() + ": " + user.getUserId());
        }
    }

    public void createUser(String name, Role role){
        User user = new User(name, role);
        users.add(user);
    }
    public void printUsers(){
        for(User user: users){
            System.out.println(user.getUserId());
        }
    }
    public ArrayList<User> getSpecificUsers(Role role){
       ArrayList<User> usersWithRole = new ArrayList<>();
        for(User user: users){
            if(user.getRole().equals(role)){
                usersWithRole.add(user);
            }
        }
   return usersWithRole; }


}
