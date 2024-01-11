package athletes;

import java.util.ArrayList;

public class Athlete {
    private String name;
    private boolean isActive;
    private ArrayList<Integer> points = new ArrayList<>();

    public ArrayList<Integer> getPoints(){
        return points;
    }
    public boolean getIsActive(){
        return isActive;
    }
}
