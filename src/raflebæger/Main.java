package raflebæger;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Raflebager bager1 = new Raflebager(4);
        int ryst1 = bager1.ryst();
        System.out.println(ryst1);
        bager1.se();
    }
}
