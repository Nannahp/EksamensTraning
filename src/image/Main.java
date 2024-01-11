package image;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Image image1 = new Image("asdf.jpeg", 23, 56);
        System.out.println(image1.isKnownFileType());
        System.out.println(image1.isPortrait());
        System.out.println(image1.isLandscape());
    }
}
