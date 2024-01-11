package bmi;

public class BMI {
    private double height;
    private double weight;

    public double calcBMI(){
        return (weight/Math.pow(height,2));
    }
    public BMI(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public boolean isUnderWeight(){
        if( calcBMI()<18.5)
            return  true;
        else
            return  false;
    }
    public boolean isOverWeight(){
        if( calcBMI()>25)
            return  true;
        else
            return  false;
    }
    public boolean isNormalWeight(){
        if( calcBMI()>18.5 && calcBMI() <25)
            return  true;
        else
            return  false;
    }

}


