package athletes;

public class AmateurAthlete extends Athlete{


    public boolean hasPaidFee(){
        if(getIsActive()){
            return true;
        }
        else return  false;
    }
}
//What is has paid fee based on?
//Assumed that the fee is paid
//if the member is active.
//Could be based on other assumptions.

