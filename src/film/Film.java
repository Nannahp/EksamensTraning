package film;

import java.time.LocalDate;

public class Film {
    private  String filmTitel;
    private  int udgivelsesAar;
    private Producer producer;

    public Film (String filmTitel, int udgivelsesAar){
        this.filmTitel = filmTitel;
        this.udgivelsesAar = udgivelsesAar;
    }
    public Film (String filmTitel){
        this.filmTitel = filmTitel;
        this.udgivelsesAar = LocalDate.now().getYear();
    }

    public void tilfojProducer(Producer producer){
        this.producer = producer;
    }

    @Override
    public String toString() {
        String producer = "Ingen Producer tilføjet";
        if (this.producer!=null){
            producer = this.producer.getName();}

        return "Film{" +
                "filmTitel='" + filmTitel + '\'' +
                ", udgivelsesAar=" + udgivelsesAar +
                ", producer=" + producer+
                '}';
    }
}
