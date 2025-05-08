import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //make sure to use the entire filename and path (not just the filename)
        try { // reader
            File compressed2 = new File("data_compressed.txt");
            Scanner compressed = new Scanner(compressed2);
            while(compressed.hasNextLine()) {
                String newFileData = myScan2.nextLine();
                System.out.println(newFileData + " ");
            }
            compressed.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            File myRaw2 = new File("data_myRaw.txt");
            if (myRaw2.createNewFile()) {
                System.out.println("File created: " + myRaw2.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
/* tests


debuggs
Scanner


notes
I pretty much coppied off of w3schools but I did learn a lot from it helping me to grasp the concept better.

 */