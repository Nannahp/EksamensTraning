package tekst;

import java.util.ArrayList;

public class Tekst {
    private ArrayList<String> tekstLinjer = new ArrayList<>();


    public void tilfoj(String tekst){
        this.tekstLinjer.add(tekst);
    }

    public int findAntalUnikke(){
        ArrayList<String> unikkeLinjer = new ArrayList<>();
        for (String tekst: this.tekstLinjer){
            if (!unikkeLinjer.contains(tekst)){
                unikkeLinjer.add(tekst);
            }
        }
        return unikkeLinjer.size();
    }
}
