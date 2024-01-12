package prove2;

import java.util.Random;

public class User {
    private String fullName;
    private String userId;

    public User(String fullName) {
        this.fullName = fullName;
        this.userId = createUserId(fullName);
    }

    public String getUserId() {
        return userId;
    }

    public String createUserId(String fullName) {
        String userId;
        String[] wholeName = fullName.split(" ");
        String firstName = wholeName[0].substring(0,2);
        String lastName = wholeName[1].substring(0,2);

        userId = firstName + lastName;

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int randomNum = random.nextInt(10);
            userId += randomNum;
        }

        return userId;
    }
}
