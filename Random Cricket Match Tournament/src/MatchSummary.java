import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatchSummary {

    private static int matchNo;

    public MatchSummary() {
        matchNo+=1;
    }

    public static int getMatchNo() {
        return matchNo;
    }

    public void summary(){

        System.out.println("\nSUMMARY\n");

        try {
            File myObj = new File("Batting Summary.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }

        try {
            File myObj = new File("Bowling Summary.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }
}
