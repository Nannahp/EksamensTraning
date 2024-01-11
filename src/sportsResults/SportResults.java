package sportsResults;

import java.util.Random;

public class SportResults {
    private String team1;
    private String team2;
    private String result;

    public SportResults(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
        generateRandomResult();
    }
    public void generateRandomResult(){
        Random random = new Random();
        int result = random.nextInt(3);
        switch (result){
            case 0 -> this.result = team1;
            case 1 -> this.result = team2;
            case 2 -> this.result = "Tie";
        }

    }
    public String getResult(){
        return result;
    }

}
