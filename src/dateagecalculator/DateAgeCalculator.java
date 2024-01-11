package dateagecalculator;

public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge){
        this.yourAge = yourAge;
    }
    private int calculateLowestAge(){
        return (int)(yourAge/2) +7;
    }
    public boolean calcValidDateAge(int dateAge){
        if (dateAge>= calculateLowestAge()){
            return  true;}
        else return false;
    }



}
