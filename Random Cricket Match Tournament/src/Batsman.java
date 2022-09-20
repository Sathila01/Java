import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Batsman {

    private int runsPlayer0T1;
    private int runsPlayer1T1;
    private int runsPlayer2T1;
    private int runsPlayer3T1;
    private int runsPlayer4T1;
    private int runsPlayer5T1;
    private int runsPlayer6T1;
    private int runsPlayer7T1;
    private int runsPlayer8T1;
    private int runsPlayer9T1;
    private int runsPlayer10T1;

    private int runsPlayer0T2;
    private int runsPlayer1T2;
    private int runsPlayer2T2;
    private int runsPlayer3T2;
    private int runsPlayer4T2;
    private int runsPlayer5T2;
    private int runsPlayer6T2;
    private int runsPlayer7T2;
    private int runsPlayer8T2;
    private int runsPlayer9T2;
    private int runsPlayer10T2;

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

    public int getRunsPlayer0T1() {
        return runsPlayer0T1;
    }

    public void setRunsPlayer0T1(int runsPlayer0T1) {
        this.runsPlayer0T1 = runsPlayer0T1;
    }

    public int getRunsPlayer1T1() {
        return runsPlayer1T1;
    }

    public void setRunsPlayer1T1(int runsPlayer1T1) {
        this.runsPlayer1T1 = runsPlayer1T1;
    }

    public int getRunsPlayer2T1() {
        return runsPlayer2T1;
    }

    public void setRunsPlayer2T1(int runsPlayer2T1) {
        this.runsPlayer2T1 = runsPlayer2T1;
    }

    public int getRunsPlayer3T1() {
        return runsPlayer3T1;
    }

    public void setRunsPlayer3T1(int runsPlayer3T1) {
        this.runsPlayer3T1 = runsPlayer3T1;
    }

    public int getRunsPlayer4T1() {
        return runsPlayer4T1;
    }

    public void setRunsPlayer4T1(int runsPlayer4T1) {
        this.runsPlayer4T1 = runsPlayer4T1;
    }

    public int getRunsPlayer5T1() {
        return runsPlayer5T1;
    }

    public void setRunsPlayer5T1(int runsPlayer5T1) {
        this.runsPlayer5T1 = runsPlayer5T1;
    }

    public int getRunsPlayer6T1() {
        return runsPlayer6T1;
    }

    public void setRunsPlayer6T1(int runsPlayer6T1) {
        this.runsPlayer6T1 = runsPlayer6T1;
    }

    public int getRunsPlayer7T1() {
        return runsPlayer7T1;
    }

    public void setRunsPlayer7T1(int runsPlayer7T1) {
        this.runsPlayer7T1 = runsPlayer7T1;
    }

    public int getRunsPlayer8T1() {
        return runsPlayer8T1;
    }

    public void setRunsPlayer8T1(int runsPlayer8T1) {
        this.runsPlayer8T1 = runsPlayer8T1;
    }

    public int getRunsPlayer9T1() {
        return runsPlayer9T1;
    }

    public void setRunsPlayer9T1(int runsPlayer9T1) {
        this.runsPlayer9T1 = runsPlayer9T1;
    }

    public int getRunsPlayer10T1() {
        return runsPlayer10T1;
    }

    public void setRunsPlayer10T1(int runsPlayer10T1) {
        this.runsPlayer10T1 = runsPlayer10T1;
    }

    public int getRunsPlayer0T2() {
        return runsPlayer0T2;
    }

    public void setRunsPlayer0T2(int runsPlayer0T2) {
        this.runsPlayer0T2 = runsPlayer0T2;
    }

    public int getRunsPlayer1T2() {
        return runsPlayer1T2;
    }

    public void setRunsPlayer1T2(int runsPlayer1T2) {
        this.runsPlayer1T2 = runsPlayer1T2;
    }

    public int getRunsPlayer2T2() {
        return runsPlayer2T2;
    }

    public void setRunsPlayer2T2(int runsPlayer2T2) {
        this.runsPlayer2T2 = runsPlayer2T2;
    }

    public int getRunsPlayer3T2() {
        return runsPlayer3T2;
    }

    public void setRunsPlayer3T2(int runsPlayer3T2) {
        this.runsPlayer3T2 = runsPlayer3T2;
    }

    public int getRunsPlayer4T2() {
        return runsPlayer4T2;
    }

    public void setRunsPlayer4T2(int runsPlayer4T2) {
        this.runsPlayer4T2 = runsPlayer4T2;
    }

    public int getRunsPlayer5T2() {
        return runsPlayer5T2;
    }

    public void setRunsPlayer5T2(int runsPlayer5T2) {
        this.runsPlayer5T2 = runsPlayer5T2;
    }

    public int getRunsPlayer6T2() {
        return runsPlayer6T2;
    }

    public void setRunsPlayer6T2(int runsPlayer6T2) {
        this.runsPlayer6T2 = runsPlayer6T2;
    }

    public int getRunsPlayer7T2() {
        return runsPlayer7T2;
    }

    public void setRunsPlayer7T2(int runsPlayer7T2) {
        this.runsPlayer7T2 = runsPlayer7T2;
    }

    public int getRunsPlayer8T2() {
        return runsPlayer8T2;
    }

    public void setRunsPlayer8T2(int runsPlayer8T2) {
        this.runsPlayer8T2 = runsPlayer8T2;
    }

    public int getRunsPlayer9T2() {
        return runsPlayer9T2;
    }

    public void setRunsPlayer9T2(int runsPlayer9T2) {
        this.runsPlayer9T2 = runsPlayer9T2;
    }

    public int getRunsPlayer10T2() {
        return runsPlayer10T2;
    }

    public void setRunsPlayer10T2(int runsPlayer10T2) {
        this.runsPlayer10T2 = runsPlayer10T2;
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

    public void topBatsmen(){

        Map<String, Integer> table = new HashMap<String, Integer>();

        System.out.println("\nMost Runs\n");


        table.put(getBatsman0T1(), getRunsPlayer0T1());
        table.put(getBatsman1T1(), getRunsPlayer1T1());
        table.put(getBatsman2T1(), getRunsPlayer2T1());
        table.put(getBatsman3T1(), getRunsPlayer3T1());
        table.put(getBatsman4T1(), getRunsPlayer4T1());
        table.put(getBatsman5T1(), getRunsPlayer5T1());
        table.put(getBatsman6T1(), getRunsPlayer6T1());
        table.put(getBatsman7T1(), getRunsPlayer7T1());
        table.put(getBatsman8T1(), getRunsPlayer8T1());
        table.put(getBatsman9T1(), getRunsPlayer9T1());

        table.put(getBatsman0T2(), getRunsPlayer0T2());
        table.put(getBatsman1T2(), getRunsPlayer1T2());
        table.put(getBatsman2T2(), getRunsPlayer2T1());
        table.put(getBatsman3T2(), getRunsPlayer3T1());
        table.put(getBatsman4T2(), getRunsPlayer4T2());
        table.put(getBatsman5T2(), getRunsPlayer5T2());
        table.put(getBatsman6T2(), getRunsPlayer6T2());
        table.put(getBatsman7T2(), getRunsPlayer7T2());
        table.put(getBatsman8T2(), getRunsPlayer8T2());
        table.put(getBatsman9T2(), getRunsPlayer9T2());

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
