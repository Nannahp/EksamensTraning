package tekst;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Tekst test = new Tekst();
        test.tilfoj("forste linje");
        test.tilfoj("anden linje");
        test.tilfoj("forste linje");

        System.out.println(test.findAntalUnikke());
    }



}
