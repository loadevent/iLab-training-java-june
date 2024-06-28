package Chapter7;

import java.io.*;
import java.util.Date;

public class ReadAndWriteToFile {
    static String filePath = "C:\\Users\\Kabelo Tlhape\\Videos\\iLABTraining.txt";
    public static void main(String[] args) {
            //writeToFile();
        readFromFile();
    }
    static void readFromFile(){

        try {

            File myFile = new File(filePath);//Instantiate the file object
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);
            String line = null;

            while ((line = read.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

    }
    static void writeToFile()  {
        Date dt = new Date();
        dt.toString();
        //File path
        try {

            File myFile = new File(filePath);//Instantiate the file object
            myFile.createNewFile();

            PrintStream pen = new PrintStream(myFile);
            pen.println("iLAB Training");
            pen.println("-------------------");
            pen.println("Java For Testers");
            pen.println("This is just an additional line");

            System.out.println("Name: " + myFile.getName());
            System.out.println("Parent: " + myFile.getParentFile());
            System.out.println("Path: " + myFile.getPath());
            System.out.println("Abs Path: " + myFile.getAbsolutePath());

            pen.close();
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

    }
}
