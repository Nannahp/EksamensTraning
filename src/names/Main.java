package names;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Names name1 = new Names("Annie Baily Connors");
        Names name2 = new Names("Dodie Editor");

        System.out.println(name1.toString());
        System.out.println(name2.toString());

    }
}
