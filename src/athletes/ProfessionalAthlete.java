package athletes;

public class ProfessionalAthlete extends Athlete{

    public int getNumberOfWins(){
        return getPoints().size();
    }

}
