package film;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Film film1 = new Film("Harry Potter", 2011 );
        film1.tilfojProducer(new Producer("David Heymann"));
        Film film2 = new Film("Barbie");

        System.out.println(film1.toString());
        System.out.println(film2.toString());
    }
}
