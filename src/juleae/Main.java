package juleae;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        JuleGave gave1 = new JuleGave();
        JuleGave gave2 = new JuleGave();
        System.out.println(gave1.getIsSoft());
        System.out.println(gave1.getIsRectangular());
        System.out.println(gave1.getDoesRattle());
        System.out.println(gave1.couldBeLego());
        System.out.println();
        System.out.println(gave2.getIsSoft());
        System.out.println(gave2.getIsRectangular());
        System.out.println(gave2.getDoesRattle());
        System.out.println(gave2.couldBeLego());
    }
}
