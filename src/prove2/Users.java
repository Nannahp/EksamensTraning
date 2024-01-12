package prove2;

import java.util.ArrayList;

public class Users {
    private ArrayList<User> users;

    User user1 = new User("Emma Pasquer");
    User user2 = new User("Nanna Petersen");

    public static void main(String[] args) {
        new Users().run();
    }

    public void run() {
        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        for (User user : users) {
            System.out.println(user.getUserId());
        }
    }

}
