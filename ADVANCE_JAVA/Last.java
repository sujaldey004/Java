package ADVANCE_JAVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Last {
    public static void main(String[] args) {
        /*
        // Creating a file
            File myfile = new File("demoFile.txt");
            try{
            myfile.createNewFile();   
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Writing in a file
        try{
            FileWriter myfilewrite = new FileWriter("demoFile.txt");
            myfilewrite.write("This is how we create a file in java.\nNext we are going to see how we can delete a file by java code.");
            myfilewrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a file
        File myFile = new File("demoFile.txt");
        try (Scanner sc = new Scanner(myFile)) {
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */

        // Deleting a file
        File myfile = new File("demoFile.txt");
        if(myfile.delete()){
            System.out.println("the file deleted : "+ myfile.getName());
        }
        else{
            System.out.println("Some error occured during deleting the file : " + myfile.getName());
        }
    }
}
