package keyword;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Keyword stop = new Keyword("Stop", "The act of finishing a process");
        Keyword start = new Keyword("Start", "The process of beginning something",stop
        );
        System.out.println(start.matches("start"));
        System.out.println(start.matches("stop"));
        System.out.println(start.toString());

    }
}
