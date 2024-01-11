package user;

import java.util.ArrayList;
import java.util.Random;

public class User {
    private String fullName;
    private String userID;
    private Random random = new Random();

    public User (String fullName){
        this.fullName = fullName;
    }
    public boolean validUserID(){
        boolean validId = true;
        if( userID.length()==8){
        String letters = userID.substring(0,4);
        String numbers = userID.substring(4,8);
        if(letters.contains("\\d+")){
            validId = false;
        }
        if (numbers.contains("[a-zA-Z]")){
            validId = false;}
        }
        else validId = false;

    return validId;}

    private void setUserID(String id){
        this.userID = id;
    }
    public String getUserID(){
        return userID;
    }
    public void createUserID(){
        String firstLetters = fullName.split(" ")[0].substring(0,2);
        String lastLetters = fullName.split(" ")[1].substring(0,2);
        String numbers = "";
        for(int i =0; i<4; i++){
            numbers += String.valueOf(random.nextInt(10));
        }

        setUserID(firstLetters+lastLetters+numbers);

    }
}
