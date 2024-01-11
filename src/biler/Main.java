package biler;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Bil bil1 = new Bil(2000);
        Trailer trailer1 = new Trailer(1100);
        bil1.setTrailer(trailer1);
        System.out.println(bil1.getTotalVægt(trailer1) );

    }
}
