package users;

import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    public User(String fullName){
        this.fullName = fullName;
        createUserID();
    }

    public String getUserID(){
        return userID;
    }
    public void createUserID(){
        String firstName = fullName.split(" ")[0];
        String lastName = fullName.split(" ")[1];
        int number = 0;
        Random random = new Random();
        for(int i=0; i<4; i++){
            number+= random.nextInt(10);
        }
        this.userID = firstName.substring(0,2)
                + lastName.substring(0,2)
                +number;

    }


}
