import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("Sri Lankan Team.txt");
            myWriter.write("Pathum Nissanka\n" +
                    "Kusal Perera\n" +
                    "Charith Asalanka\n" +
                    "Avishka Fernando\n" +
                    "Bhanuka Rajapaksa\n" +
                    "Dasun Shanaka\n" +
                    "Wanindu Hasaranga\n" +
                    "Chamika Karunaratna\n" +
                    "Dushmantha Chameera\n" +
                    "Praveen Jayawickrama\n" +
                    "Maheesh Theekshana\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("Indian Team.txt");
            myWriter.write("KL Rahul\n" +
                    "Rohit Sharma\n" +
                    "Virat Kohli\n" +
                    "Suryakumar Yadev\n" +
                    "Rishbah Pant\n" +
                    "Hardik Pandya\n" +
                    "Ravendra Jadeja\n" +
                    "Ravichandran Ashvin\n" +
                    "Mohommad Shami\n" +
                    "Bhuneshwar Kumar\n" +
                    "Jasprit Bumrah\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("Pakistan Team.txt");
            myWriter.write("Mohommad Rizwan\n" +
                    "Babar Azam\n" +
                    "Farkar Zaman\n" +
                    "Asan Ali\n" +
                    "Shoaib Malik\n" +
                    "Mohommad Hafeez\n" +
                    "Imad Wasim\n" +
                    "Shadab Khan\n" +
                    "Hasan Ali\n" +
                    "Shaheen Afridi\n" +
                    "Haris Rauf\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("Australian Team.txt");
            myWriter.write("David Warner\n" +
                    "Aron Finch\n" +
                    "Mitchell Marsh\n" +
                    "Steve Smith\n" +
                    "Matthew Wade\n" +
                    "Glen Maxwell\n" +
                    "Marcus Stoinis\n" +
                    "Pat Cummins\n" +
                    "Mitchell Starc\n" +
                    "Adam Zampa\n" +
                    "Nathan Lyon\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("England Team.txt");
            myWriter.write("Jason Roy\n" +
                    "Joss Buttler\n" +
                    "David malan\n" +
                    "Jonny Bairstow\n" +
                    "Eoin Morgan\n" +
                    "Liam Livingstone\n" +
                    "Moeen Ali\n" +
                    "Chris Woakes\n" +
                    "Chris Jordan\n" +
                    "Adil Rashid\n" +
                    "Tymal Mills\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("South African Team.txt");
            myWriter.write("Quinton de Cock\n" +
                    "Reeza Hendricks\n" +
                    "R van der Dussen\n" +
                    "Temba Bavuma\n" +
                    "David Miller\n" +
                    "Aidan Markram\n" +
                    "Dwaine Pretorius\n" +
                    "Kagiso Rabada\n" +
                    "Keshav Maharaj\n" +
                    "Anrich Nortje\n" +
                    "Tabraiz Shamsi\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("New Zealand Team.txt");
            myWriter.write("Martin Guptil\n" +
                    "Daryl Mitchell\n" +
                    "Kane Williamson\n" +
                    "Devon Convay\n" +
                    "Glenn Philips\n" +
                    "James Neesham\n" +
                    "Mitchell Santner\n" +
                    "Adam Milne\n" +
                    "Tim Southee\n" +
                    "Ish Sodhi\n" +
                    "Trent Boult\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("West Indian Team.txt");
            myWriter.write("Lendle Simmons\n" +
                    "Evin Lewis\n" +
                    "Nicholas pooran\n" +
                    "Chris Gayle\n" +
                    "Shimron Hetmyer\n" +
                    "Andre Russel\n" +
                    "Keieron Pollard\n" +
                    "Jason Holdar\n" +
                    "Dwayne Bravo\n" +
                    "Akeal Hosein\n" +
                    "Ravi Rampaul\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
