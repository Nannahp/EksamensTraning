package motherboard;

public class MotherBoard {
    private SataDrive[] drives = new SataDrive[4];

    public void printDrives(){
        for(SataDrive drive: drives){
            System.out.println(drive);
        }
    }
    public void addDrive(SataDrive drive){
        boolean placed = false;
            for(int i =0; i< drives.length && !placed; i ++) {
                if (drives[i] == null) {
                    drives[i] = drive;
                    placed = true;
                    System.out.println("Placed");
                }
            }
           if(!placed){
               System.out.println("Not enough room");
    }
    }

}
