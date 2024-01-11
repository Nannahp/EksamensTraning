package beers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        ArrayList<Beers> beers  = new ArrayList<>();
        beers.add(new Beers("Guiness", 8,24));
        beers.add(new Beers("Tuborg", 10, 30));

        int sum=0;
        for(Beers beer: beers){
            sum+= beer.getPrice();
        }
        int average = sum/beers.size();
        System.out.println(average);
    }   //note that all numbers are int, so
        //the average will round down.
        //alternative: doubles
}
