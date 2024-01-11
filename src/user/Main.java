package user;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        User user1 = new User("Nanna Petersen");
        user1.createUserID();
        System.out.println(user1.getUserID());
        System.out.println(user1.validUserID());
    }
}
