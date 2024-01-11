package hogwartsStudents;

import java.util.ArrayList;
import java.util.List;

public class HogwartsStudent implements  Comparable<HogwartsStudent>{
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setHouse(String house) {
        ArrayList<String> houses = new ArrayList<>(List.of("gryffindor", "hufflepuff", "ravenclaw", "slytherin"));
        if (houses.contains(house.toLowerCase())) {
            this.house = house;
        } else {
            throw new IllegalArgumentException("Invalid house");
        }
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public int compareTo(HogwartsStudent o) {
        return this.lastName.compareTo(o.getLastName());
    }
}
