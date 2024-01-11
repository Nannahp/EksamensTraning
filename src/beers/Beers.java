package beers;

public class Beers {
    private String name;
    private int alcoholPercentage;
    private int price;

    public Beers(String name, int alcoholPercentage, int price){
        this.name = name;
        setPrice(price);
        setAlcoholPercentage(alcoholPercentage);
    }
    public int getPrice(){
        return price;
    }
    public void setAlcoholPercentage(int percentage){
        if(percentage>0 && percentage <101){
            this.alcoholPercentage = percentage;}
        else throw  new IllegalArgumentException("Invalid percentage");
    }
    public void setPrice(int price){
        if(price>0){
            this.price = price;
        }
        else  throw new IllegalArgumentException("Price must positive");
    }

}
