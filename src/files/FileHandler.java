package files;

import article.Main;

import java.io.*;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
        new FileHandler().run();
    }

    /* Errors

  Unchecked, errors, should never happen, don't try to catch them.
  CANNOT BE RECOVERED

  Exceptions are abnormal conditions that we can catch.
  Use try-catch when you want to handle exceptions locally within a method or code block.
  Use throws when you want to declare that a method may throw certain exceptions,
  and the responsibility of handling those exceptions is delegated to the calling code.

  Checked
  - Exceptions that must be handled, fx IO-exception. Declared by throws
  Unchecked
  - Exceptions that doesn't need to be handled. Fx index out of range, or
  string in int input.

  IOException is a general exception class that represents input/output (I/O) related issues.
  I/O operations involve reading from or writing to various sources, such as files, streams,
  sockets, etc. Instances of IOException are typically thrown when something goes wrong during these operations.


  */
    private void run(){
        createFile("test");
        writeToFile("test");
        appendToFile("test");
        readFile("test");
        //updateTokensInFile("test");
        System.out.println(readTokensInFile("test"));

    }
    //Create a file
    public void createFile(String fileName){
        try{
            File newFile = new File("src" + File.separator + fileName);
            //Separator helps find the correct path in both mac and pc
            if (newFile.createNewFile()){
                System.out.println("File created");
            } else System.out.println("File exists");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
    //Append to file FOS
    public void appendToFile(String fileName){
        File file = new File("src" + File.separator + fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            //True angiver appending, false vil overwrite filen
            //Fos writes binary data to a file
            //serialized objects, tokens
            //ps writes to fos, or just writes text to file
            PrintStream ps = new PrintStream(fos);
            ps.append("testing" + "=" + "test");
            ps.close();
            fos.close();
        }catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
    //Write to file
    public void writeToFile(String fileName){
        File file = new File("src" + File.separator +fileName);
        try{
            PrintStream ps = new PrintStream(file);
            ps.println("Hello");
            ps.println("goodbye");
            ps.close();
        } catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
    //Tokens
    //update tokens in file
    public void updateTokensInFile(String fileName){
        File file = new File("src" + File.separator + fileName);
        try{
            Scanner scanner = new Scanner(file);
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintStream ps = new PrintStream(fos);
            while(scanner.hasNextLine()){
                Scanner tokenReader = new Scanner(scanner.nextLine()).useDelimiter("=");
                    String key = tokenReader.next();
                    String value = tokenReader.hasNext() ? tokenReader.next().trim() : "";
                    switch (key){
                        case "testing" -> value = "done";
                    }
                    ps.flush();
                    ps.print(key + "=" + value);
                }

            fos.close();
            ps.close();
            scanner.close();
        }  catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
    //read tokens in file
    public String readTokensInFile(String fileName){
         String value ="";
         File file = new File("src" + File.separator + fileName);
         try{
             Scanner reader = new Scanner(file);
             while(reader.hasNextLine()){
                 Scanner tokenReader = new Scanner(reader.nextLine()).useDelimiter("=");
                 String key = tokenReader.next();
                 switch (key){
                     case "testing" -> value = tokenReader.next().trim();
                 }
             }
             reader.close();
         }                  catch (FileNotFoundException e){
             System.out.println("something went wrong");
         }
         return value;
    }
    
    //Print file
    public  void readFile(String fileName){
        File file = new File("src" + File.separator + fileName);
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }catch (IOException e){
            System.out.println("Something went wrong");
        }
    }

}
