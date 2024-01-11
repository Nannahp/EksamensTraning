package sportsResults;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        createFile("results");
        SportResults result1 = new SportResults("Danmark", "France");
        SportResults result2 = new SportResults("Germany", "UK");
        save("results", result1.getResult());
        save("results", result2.getResult());
        //could also be done with an arraylist of results and
        //then save all the results in one go.

    }
    //Needed to create the fiel first
    public void createFile(String fileName){
        try {
            File file = new File("src" + File.separator + fileName);
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void save(String fileName, String result){
        File file = new File("src" + File.separator + fileName);
        try{
            FileOutputStream fos = new FileOutputStream(file, true);
            //fos needed to append to file, instead of overwriting
            PrintStream ps = new PrintStream(fos);
            ps.append(result);
            ps.println();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
