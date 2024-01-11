package biler;

public class Bil {
    private Trailer trailer;
    private double vægt;

    public Bil(double vægt){
        this.vægt = vægt;
    }

    public void setTrailer(Trailer trailer){
        if(getTotalVægt(trailer)<3500){
        this.trailer = trailer;}
    }

    public double getTotalVægt(Trailer trailer){
            return trailer.getVægt()+this.vægt;
    }
    public double getVægt(){
        return vægt;
    }

}
