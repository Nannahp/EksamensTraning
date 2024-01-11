package users;

import java.util.ArrayList;

public class Users {
    public static void main(String[] args) {
        new Users().run();
    }

    private void run() {
        User user1 = new User("Nanna Petersen");
        User user2 = new User("Nicoline Hofgård");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        for(User user: users){
            System.out.println(user.getUserID());
        }
    }
}

