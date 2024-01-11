package motherboard;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        SataDrive drive1 = new SataDrive();
        SataDrive drive2 = new SataDrive();
        SataDrive drive3 = new SataDrive();
        SataDrive drive4 = new SataDrive();
        SataDrive drive5 = new SataDrive();
        MotherBoard board = new MotherBoard();

        board.addDrive(drive1);
        board.addDrive(drive2);
        board.addDrive(drive3);
        board.addDrive(drive4);
        board.addDrive(drive5);
        board.printDrives();
    }
}
