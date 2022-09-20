import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Bowler {

    private int wicketsPlayer0T1;
    private int wicketsPlayer1T1;
    private int wicketsPlayer2T1;
    private int wicketsPlayer3T1;
    private int wicketsPlayer4T1;
    private int wicketsPlayer5T1;
    private int wicketsPlayer6T1;
    private int wicketsPlayer7T1;
    private int wicketsPlayer8T1;
    private int wicketsPlayer9T1;
    private int wicketsPlayer10T1;

    private int wicketsPlayer0T2;
    private int wicketsPlayer1T2;
    private int wicketsPlayer2T2;
    private int wicketsPlayer3T2;
    private int wicketsPlayer4T2;
    private int wicketsPlayer5T2;
    private int wicketsPlayer6T2;
    private int wicketsPlayer7T2;
    private int wicketsPlayer8T2;
    private int wicketsPlayer9T2;
    private int wicketsPlayer10T2;

    private String batsman0T1;
    private String batsman1T1;
    private String batsman2T1;
    private String batsman3T1;
    private String batsman4T1;
    private String batsman5T1;
    private String batsman6T1;
    private String batsman7T1;
    private String batsman8T1;
    private String batsman9T1;
    private String batsman10T1;

    private String batsman0T2;
    private String batsman1T2;
    private String batsman2T2;
    private String batsman3T2;
    private String batsman4T2;
    private String batsman5T2;
    private String batsman6T2;
    private String batsman7T2;
    private String batsman8T2;
    private String batsman9T2;
    private String batsman10T2;

    public int getWicketsPlayer0T1() {
        return wicketsPlayer0T1;
    }

    public void setWicketsPlayer0T1(int wicketsPlayer0T1) {
        this.wicketsPlayer0T1 = wicketsPlayer0T1;
    }

    public int getWicketsPlayer1T1() {
        return wicketsPlayer1T1;
    }

    public void setWicketsPlayer1T1(int wicketsPlayer1T1) {
        this.wicketsPlayer1T1 = wicketsPlayer1T1;
    }

    public int getWicketsPlayer2T1() {
        return wicketsPlayer2T1;
    }

    public void setWicketsPlayer2T1(int wicketsPlayer2T1) {
        this.wicketsPlayer2T1 = wicketsPlayer2T1;
    }

    public int getWicketsPlayer3T1() {
        return wicketsPlayer3T1;
    }

    public void setWicketsPlayer3T1(int wicketsPlayer3T1) {
        this.wicketsPlayer3T1 = wicketsPlayer3T1;
    }

    public int getWicketsPlayer4T1() {
        return wicketsPlayer4T1;
    }

    public void setWicketsPlayer4T1(int wicketsPlayer4T1) {
        this.wicketsPlayer4T1 = wicketsPlayer4T1;
    }

    public int getWicketsPlayer5T1() {
        return wicketsPlayer5T1;
    }

    public void setWicketsPlayer5T1(int wicketsPlayer5T1) {
        this.wicketsPlayer5T1 = wicketsPlayer5T1;
    }

    public int getWicketsPlayer6T1() {
        return wicketsPlayer6T1;
    }

    public void setWicketsPlayer6T1(int wicketsPlayer6T1) {
        this.wicketsPlayer6T1 = wicketsPlayer6T1;
    }

    public int getWicketsPlayer7T1() {
        return wicketsPlayer7T1;
    }

    public void setWicketsPlayer7T1(int wicketsPlayer7T1) {
        this.wicketsPlayer7T1 = wicketsPlayer7T1;
    }

    public int getWicketsPlayer8T1() {
        return wicketsPlayer8T1;
    }

    public void setWicketsPlayer8T1(int wicketsPlayer8T1) {
        this.wicketsPlayer8T1 = wicketsPlayer8T1;
    }

    public int getWicketsPlayer9T1() {
        return wicketsPlayer9T1;
    }

    public void setWicketsPlayer9T1(int wicketsPlayer9T1) {
        this.wicketsPlayer9T1 = wicketsPlayer9T1;
    }

    public int getWicketsPlayer10T1() {
        return wicketsPlayer10T1;
    }

    public void setWicketsPlayer10T1(int wicketsPlayer10T1) {
        this.wicketsPlayer10T1 = wicketsPlayer10T1;
    }

    public int getWicketsPlayer0T2() {
        return wicketsPlayer0T2;
    }

    public void setWicketsPlayer0T2(int wicketsPlayer0T2) {
        this.wicketsPlayer0T2 = wicketsPlayer0T2;
    }

    public int getWicketsPlayer1T2() {
        return wicketsPlayer1T2;
    }

    public void setWicketsPlayer1T2(int wicketsPlayer1T2) {
        this.wicketsPlayer1T2 = wicketsPlayer1T2;
    }

    public int getWicketsPlayer2T2() {
        return wicketsPlayer2T2;
    }

    public void setWicketsPlayer2T2(int wicketsPlayer2T2) {
        this.wicketsPlayer2T2 = wicketsPlayer2T2;
    }

    public int getWicketsPlayer3T2() {
        return wicketsPlayer3T2;
    }

    public void setWicketsPlayer3T2(int wicketsPlayer3T2) {
        this.wicketsPlayer3T2 = wicketsPlayer3T2;
    }

    public int getWicketsPlayer4T2() {
        return wicketsPlayer4T2;
    }

    public void setWicketsPlayer4T2(int wicketsPlayer4T2) {
        this.wicketsPlayer4T2 = wicketsPlayer4T2;
    }

    public int getWicketsPlayer5T2() {
        return wicketsPlayer5T2;
    }

    public void setWicketsPlayer5T2(int wicketsPlayer5T2) {
        this.wicketsPlayer5T2 = wicketsPlayer5T2;
    }

    public int getWicketsPlayer6T2() {
        return wicketsPlayer6T2;
    }

    public void setWicketsPlayer6T2(int wicketsPlayer6T2) {
        this.wicketsPlayer6T2 = wicketsPlayer6T2;
    }

    public int getWicketsPlayer7T2() {
        return wicketsPlayer7T2;
    }

    public void setWicketsPlayer7T2(int wicketsPlayer7T2) {
        this.wicketsPlayer7T2 = wicketsPlayer7T2;
    }

    public int getWicketsPlayer8T2() {
        return wicketsPlayer8T2;
    }

    public void setWicketsPlayer8T2(int wicketsPlayer8T2) {
        this.wicketsPlayer8T2 = wicketsPlayer8T2;
    }

    public int getWicketsPlayer9T2() {
        return wicketsPlayer9T2;
    }

    public void setWicketsPlayer9T2(int wicketsPlayer9T2) {
        this.wicketsPlayer9T2 = wicketsPlayer9T2;
    }

    public int getWicketsPlayer10T2() {
        return wicketsPlayer10T2;
    }

    public void setWicketsPlayer10T2(int wicketsPlayer10T2) {
        this.wicketsPlayer10T2 = wicketsPlayer10T2;
    }

    public String getBatsman0T1() {
        return batsman0T1;
    }

    public void setBatsman0T1(String batsman0T1) {
        this.batsman0T1 = batsman0T1;
    }

    public String getBatsman1T1() {
        return batsman1T1;
    }

    public void setBatsman1T1(String batsman1T1) {
        this.batsman1T1 = batsman1T1;
    }

    public String getBatsman2T1() {
        return batsman2T1;
    }

    public void setBatsman2T1(String batsman2T1) {
        this.batsman2T1 = batsman2T1;
    }

    public String getBatsman3T1() {
        return batsman3T1;
    }

    public void setBatsman3T1(String batsman3T1) {
        this.batsman3T1 = batsman3T1;
    }

    public String getBatsman4T1() {
        return batsman4T1;
    }

    public void setBatsman4T1(String batsman4T1) {
        this.batsman4T1 = batsman4T1;
    }

    public String getBatsman5T1() {
        return batsman5T1;
    }

    public void setBatsman5T1(String batsman5T1) {
        this.batsman5T1 = batsman5T1;
    }

    public String getBatsman6T1() {
        return batsman6T1;
    }

    public void setBatsman6T1(String batsman6T1) {
        this.batsman6T1 = batsman6T1;
    }

    public String getBatsman7T1() {
        return batsman7T1;
    }

    public void setBatsman7T1(String batsman7T1) {
        this.batsman7T1 = batsman7T1;
    }

    public String getBatsman8T1() {
        return batsman8T1;
    }

    public void setBatsman8T1(String batsman8T1) {
        this.batsman8T1 = batsman8T1;
    }

    public String getBatsman9T1() {
        return batsman9T1;
    }

    public void setBatsman9T1(String batsman9T1) {
        this.batsman9T1 = batsman9T1;
    }

    public String getBatsman10T1() {
        return batsman10T1;
    }

    public void setBatsman10T1(String batsman10T1) {
        this.batsman10T1 = batsman10T1;
    }

    public String getBatsman0T2() {
        return batsman0T2;
    }

    public void setBatsman0T2(String batsman0T2) {
        this.batsman0T2 = batsman0T2;
    }

    public String getBatsman1T2() {
        return batsman1T2;
    }

    public void setBatsman1T2(String batsman1T2) {
        this.batsman1T2 = batsman1T2;
    }

    public String getBatsman2T2() {
        return batsman2T2;
    }

    public void setBatsman2T2(String batsman2T2) {
        this.batsman2T2 = batsman2T2;
    }

    public String getBatsman3T2() {
        return batsman3T2;
    }

    public void setBatsman3T2(String batsman3T2) {
        this.batsman3T2 = batsman3T2;
    }

    public String getBatsman4T2() {
        return batsman4T2;
    }

    public void setBatsman4T2(String batsman4T2) {
        this.batsman4T2 = batsman4T2;
    }

    public String getBatsman5T2() {
        return batsman5T2;
    }

    public void setBatsman5T2(String batsman5T2) {
        this.batsman5T2 = batsman5T2;
    }

    public String getBatsman6T2() {
        return batsman6T2;
    }

    public void setBatsman6T2(String batsman6T2) {
        this.batsman6T2 = batsman6T2;
    }

    public String getBatsman7T2() {
        return batsman7T2;
    }

    public void setBatsman7T2(String batsman7T2) {
        this.batsman7T2 = batsman7T2;
    }

    public String getBatsman8T2() {
        return batsman8T2;
    }

    public void setBatsman8T2(String batsman8T2) {
        this.batsman8T2 = batsman8T2;
    }

    public String getBatsman9T2() {
        return batsman9T2;
    }

    public void setBatsman9T2(String batsman9T2) {
        this.batsman9T2 = batsman9T2;
    }

    public String getBatsman10T2() {
        return batsman10T2;
    }

    public void setBatsman10T2(String batsman10T2) {
        this.batsman10T2 = batsman10T2;
    }

    public void topBowler(){

        Map<String, Integer> table = new HashMap<String, Integer>();

        System.out.println("\nMost Wickets\n");


        table.put(getBatsman0T1(), getWicketsPlayer0T1());
        table.put(getBatsman1T1(), getWicketsPlayer1T1());
        table.put(getBatsman2T1(), getWicketsPlayer2T1());
        table.put(getBatsman3T1(), getWicketsPlayer3T1());
        table.put(getBatsman4T1(), getWicketsPlayer4T1());
        table.put(getBatsman5T1(), getWicketsPlayer5T1());
        table.put(getBatsman6T1(), getWicketsPlayer6T1());
        table.put(getBatsman7T1(), getWicketsPlayer7T1());
        table.put(getBatsman8T1(), getWicketsPlayer8T1());
        table.put(getBatsman9T1(), getWicketsPlayer9T1());
        table.put(getBatsman10T1(), getWicketsPlayer10T1());

        table.put(getBatsman0T2(), getWicketsPlayer0T2());
        table.put(getBatsman1T2(), getWicketsPlayer1T2());
        table.put(getBatsman2T2(), getWicketsPlayer2T1());
        table.put(getBatsman3T2(), getWicketsPlayer3T1());
        table.put(getBatsman4T2(), getWicketsPlayer4T2());
        table.put(getBatsman5T2(), getWicketsPlayer5T2());
        table.put(getBatsman6T2(), getWicketsPlayer6T2());
        table.put(getBatsman7T2(), getWicketsPlayer7T2());
        table.put(getBatsman8T2(), getWicketsPlayer8T2());
        table.put(getBatsman9T2(), getWicketsPlayer9T2());
        table.put(getBatsman10T2(), getWicketsPlayer10T2());

        Map<String,Integer>  sortedMapReverseOrder =  table.entrySet().
                stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int count=0;
        for (String i : sortedMapReverseOrder.keySet()) {
            if (count<5){
                System.out.println(i + "  " + table.get(i));
            }
            else{
                break;
            }
            count++;
        }
    }
}