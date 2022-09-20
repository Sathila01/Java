import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileToArray {

    public String[] IndianPlayers()
            throws IOException
    {
        List<String> listOfStrings
                = new ArrayList<String>();

        listOfStrings
                = Files.readAllLines(Paths.get("Indian Team.txt"));

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }

    public String[] SriLankanPlayers()
            throws IOException
    {
        List<String> listOfStrings
                = new ArrayList<String>();

        listOfStrings
                = Files.readAllLines(Paths.get("Sri Lankan Team.txt"));

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }

    public String[] PakistanPlayers()
            throws IOException
    {
        List<String> listOfStrings
                = new ArrayList<String>();

        listOfStrings
                = Files.readAllLines(Paths.get("Pakistan Team.txt"));

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }

    public String[] AustralianPlayers()
            throws IOException
    {
        List<String> listOfStrings
                = new ArrayList<String>();

        listOfStrings
                = Files.readAllLines(Paths.get("Australian Team.txt"));

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }

    public String[] EnglandPlayers()
            throws IOException
    {
        List<String> listOfStrings
                = new ArrayList<String>();

        listOfStrings
                = Files.readAllLines(Paths.get("England Team.txt"));

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }

    public String[] NewZealandPlayers()
            throws IOException
    {
        List<String> listOfStrings
                = new ArrayList<String>();

        listOfStrings
                = Files.readAllLines(Paths.get("New Zealand Team.txt"));

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }

    public String[] SouthAfricanPlayers()
            throws IOException
    {
        List<String> listOfStrings
                = new ArrayList<String>();

        listOfStrings
                = Files.readAllLines(Paths.get("South African Team.txt"));

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }

    public String[] WestIndianPlayers()
            throws IOException
    {
        List<String> listOfStrings
                = new ArrayList<String>();

        listOfStrings
                = Files.readAllLines(Paths.get("West Indian Team.txt"));

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }
}