package raflebæger;

import java.util.ArrayList;
import java.util.Random;

public class Raflebager {
    private int terninger;
    private ArrayList<Integer> listeAfOjne = new ArrayList<>();
    private Random random  = new Random();

    public Raflebager(int terninger){
        this.terninger = terninger;
    }
    public int ryst(){
        listeAfOjne.clear();
        int ojne = 0;
        for(int i=1; i <=this.terninger; i++){
            int resultat = random.nextInt(1,7);
            listeAfOjne.add(resultat);
            ojne += resultat;
        }
    return  ojne;}

    public void se(){
        for (int terning: listeAfOjne){
            System.out.println(terning);
        }
    }
}
