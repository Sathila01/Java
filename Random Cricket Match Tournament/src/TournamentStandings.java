import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TournamentStandings {

    private int pointsSL;
    private int pointsInd;
    private int pointsPak;
    private int pointsAus;
    private int pointsEng;
    private int pointsSA;
    private int pointsNZ;
    private int pointsWI;

    public TournamentStandings() {
    }

    public int getPointsSL() {
        return pointsSL;
    }

    public void setPointsSL(int pointsSL) {
        this.pointsSL = pointsSL;
    }

    public int getPointsInd() {
        return pointsInd;
    }

    public void setPointsInd(int pointsInd) {
        this.pointsInd = pointsInd;
    }

    public int getPointsPak() {
        return pointsPak;
    }

    public void setPointsPak(int pointsPak) {
        this.pointsPak = pointsPak;
    }

    public int getPointsAus() {
        return pointsAus;
    }

    public void setPointsAus(int pointsAus) {
        this.pointsAus = pointsAus;
    }

    public int getPointsEng() {
        return pointsEng;
    }

    public void setPointsEng(int pointsEng) {
        this.pointsEng = pointsEng;
    }

    public int getPointsSA() {
        return pointsSA;
    }

    public void setPointsSA(int pointsSA) {
        this.pointsSA = pointsSA;
    }

    public int getPointsNZ() {
        return pointsNZ;
    }

    public void setPointsNZ(int pointsNZ) {
        this.pointsNZ = pointsNZ;
    }

    public int getPointsWI() {
        return pointsWI;
    }

    public void setPointsWI(int pointsWI) {
        this.pointsWI = pointsWI;
    }

    public void showStandingsGroupA(){


        Map<String, Integer> tableA = new HashMap<String, Integer>();

        System.out.println("\nGroup A Points Table\n");


        tableA.put("SL", getPointsSL());
        tableA.put("Ind", getPointsInd());
        tableA.put("Pak", getPointsPak());
        tableA.put("Aus", getPointsAus());

        Map<String,Integer>  sortedMapReverseOrder =  tableA.entrySet().
                stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String i : sortedMapReverseOrder.keySet()) {
            System.out.println(i + "  " + tableA.get(i));
        }
    }

    public void showStandingsGroupB(){


        Map<String, Integer> tableB = new HashMap<String, Integer>();

        System.out.println("\nGroup B Points Table\n");

        tableB.put("Eng", getPointsEng());
        tableB.put("NZ", getPointsNZ());
        tableB.put("SA", getPointsSA());
        tableB.put("WI", getPointsWI());

        Map<String,Integer>  sortedMapReverseOrder =  tableB.entrySet().
                stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String i : sortedMapReverseOrder.keySet()) {
            System.out.println(i + "  " + tableB.get(i));
        }
    }

//    public static void main(String[] args){
//
//        TournamentStandings bb = new TournamentStandings();
//        bb.showStandingsGroupA();
//        bb.showStandingsGroupB();
//    }
}
