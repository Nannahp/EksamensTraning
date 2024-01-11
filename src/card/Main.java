package card;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card1.beats(card2));
    }
}
