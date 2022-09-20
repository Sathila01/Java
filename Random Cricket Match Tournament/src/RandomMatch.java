import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomMatch {

    private String batsmanOnStrike;
    private int totalScore;
    private int totalScore2;
    private int wickets;
    private int batsmanScore;

    public String getBatsmanOnStrike() {
        return batsmanOnStrike;
    }

    public void setBatsmanOnStrike(String batsmanOnStrike) {
        this.batsmanOnStrike = batsmanOnStrike;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalScore2() {
        return totalScore2;
    }

    public void setTotalScore2(int totalScore2) {
        this.totalScore2 = totalScore2;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getBatsmanScore() {
        return batsmanScore;
    }

    public void setBatsmanScore(int batsmanScore) {
        this.batsmanScore = batsmanScore;
    }

    public void main() throws IOException {

        EditPlayers object = new EditPlayers();
        object.askForEditing();

        Batsman bat = new Batsman();
        Bowler bowl = new Bowler();

        TournamentStandings stand = new TournamentStandings();
        while (true) {

            Team match = new Team();
            match.playingTeams();

            Toss toss1 = new Toss();
            toss1.toss();

            System.out.println(match.getTeam1() + " won the toss and elected to bat first");


            String[] playersT1;
            String[] playersT2;


            FileToArray arr = new FileToArray();

            if (match.getTeam1() == "Sri Lanka") {
                playersT1 = arr.SriLankanPlayers();
            } else if (match.getTeam1() == "India") {
                playersT1 = arr.IndianPlayers();
            } else if (match.getTeam1() == "Pakistan") {
                playersT1 = arr.PakistanPlayers();
            } else if (match.getTeam1() == "Australia") {
                playersT1 = arr.AustralianPlayers();
            } else if (match.getTeam1() == "England") {
                playersT1 = arr.EnglandPlayers();
            } else if (match.getTeam1() == "South Africa") {
                playersT1 = arr.SouthAfricanPlayers();
            } else if (match.getTeam1() == "New Zealand") {
                playersT1 = arr.NewZealandPlayers();
            } else {
                playersT1 = arr.WestIndianPlayers();
            }

            if (match.getTeam2() == "Sri Lanka") {
                playersT2 = arr.SriLankanPlayers();
            } else if (match.getTeam2() == "India") {
                playersT2 = arr.IndianPlayers();
            } else if (match.getTeam2() == "Pakistan") {
                playersT2 = arr.PakistanPlayers();
            } else if (match.getTeam2() == "Australia") {
                playersT2 = arr.AustralianPlayers();
            } else if (match.getTeam2() == "England") {
                playersT2 = arr.EnglandPlayers();
            } else if (match.getTeam2() == "New Zealand") {
                playersT2 = arr.NewZealandPlayers();
            } else if (match.getTeam2() == "South Africa") {
                playersT2 = arr.SouthAfricanPlayers();
            } else {
                playersT2 = arr.WestIndianPlayers();
            }


            Random r = new Random();


            System.out.println();

            totalScore = 0;
            batsmanScore = 0;
            wickets = 0;

            int e = 0, w = 0, nb = 0, o = 10;
            Extras m1 = new Extras(e);
            Wides w1 = new Wides(w);
            NoBalls nb1 = new NoBalls(nb);

            FileWriter battingSummary = new FileWriter("Batting Summary.txt");
            battingSummary.write(match.getTeam1() + " -Batting\n\n");

            FileWriter bowlingSummary = new FileWriter("Bowling Summary.txt");
            bowlingSummary.write(match.getTeam2() + " -Bowling\n\n");


            int[] delivery = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};

            int n = 0;
            setBatsmanOnStrike(playersT1[n]);

            int overs;
            for (overs = 0; overs < 20; overs++) {
                if (wickets == 10) {
                    System.out.println("All Out");
                    break;
                }
                int randomBowler = r.nextInt(playersT2.length);

                System.out.println("\nOver " + (overs + 1) + " by " + playersT2[randomBowler]);

                int balls = 0;
                int overScore = 0;

                while (balls < 6) {

                    int randomDelivery = r.nextInt(delivery.length);

                    if (randomDelivery == 1) {
                        System.out.println("1 run");
                        totalScore += 1;
                        batsmanScore += 1;
                    } else if (randomDelivery == 2) {
                        System.out.println("2 runs");
                        totalScore += 2;
                        batsmanScore += 2;
                    } else if (randomDelivery == 4) {
                        System.out.println("4 runs");
                        totalScore += 4;
                        batsmanScore += 4;
                    } else if (randomDelivery == 6) {
                        System.out.println("6 runs");
                        totalScore += 6;
                        batsmanScore += 6;
                    } else if (randomDelivery == 3) {
                        System.out.println("3 runs");
                        totalScore += 3;
                        batsmanScore += 3;
                    } else if (randomDelivery == 5) {
                        System.out.println(getBatsmanOnStrike() + " Out! for " + getBatsmanScore());

                        int numW = r.nextInt(3);
                        battingSummary.write(getBatsmanOnStrike() + " " + getBatsmanScore() + "\n");
                        bowlingSummary.write(playersT2[o--] + " " + numW + "\n");

                        if (batsmanOnStrike==playersT1[0]){
                            bat.setRunsPlayer0T1(getBatsmanScore());
                            bat.setBatsman0T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[1]){
                            bat.setRunsPlayer1T1(getBatsmanScore());
                            bat.setBatsman1T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[2]){
                            bat.setRunsPlayer2T1(getBatsmanScore());
                            bat.setBatsman2T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[3]){
                            bat.setRunsPlayer3T1(getBatsmanScore());
                            bat.setBatsman3T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[4]){
                            bat.setRunsPlayer4T1(getBatsmanScore());
                            bat.setBatsman4T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[5]){
                            bat.setRunsPlayer5T1(getBatsmanScore());
                            bat.setBatsman5T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[6]){
                            bat.setRunsPlayer6T1(getBatsmanScore());
                            bat.setBatsman6T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[7]){
                            bat.setRunsPlayer7T1(getBatsmanScore());
                            bat.setBatsman7T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[8]){
                            bat.setRunsPlayer8T1(getBatsmanScore());
                            bat.setBatsman8T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[9]){
                            bat.setRunsPlayer9T1(getBatsmanScore());
                            bat.setBatsman9T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT1[10]){
                            bat.setRunsPlayer10T1(getBatsmanScore());
                            bat.setBatsman10T1(getBatsmanOnStrike());
                        }

                        if (playersT2[randomBowler]==playersT2[0]){
                            bowl.setWicketsPlayer0T2(numW);
                            bowl.setBatsman0T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[1]){
                            bowl.setWicketsPlayer1T2(numW);
                            bowl.setBatsman1T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[2]){
                            bowl.setWicketsPlayer2T2(numW);
                            bowl.setBatsman2T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[3]){
                            bowl.setWicketsPlayer3T2(numW);
                            bowl.setBatsman3T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[4]){
                            bowl.setWicketsPlayer4T2(numW);
                            bowl.setBatsman4T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[5]){
                            bowl.setWicketsPlayer5T2(numW);
                            bowl.setBatsman5T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[6]){
                            bowl.setWicketsPlayer6T2(numW);
                            bowl.setBatsman6T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[7]){
                            bowl.setWicketsPlayer7T2(numW);
                            bowl.setBatsman7T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[8]){
                            bowl.setWicketsPlayer8T2(numW);
                            bowl.setBatsman8T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[9]){
                            bowl.setWicketsPlayer9T2(numW);
                            bowl.setBatsman9T2(playersT2[randomBowler]);
                        }
                        else if (playersT2[randomBowler]==playersT2[10]){
                            bowl.setWicketsPlayer10T2(numW);
                            bowl.setBatsman10T2(playersT2[randomBowler]);
                        }


                        wickets += 1;
                        setBatsmanScore(0);
                        n += 1;
                        setBatsmanOnStrike(playersT1[n]);

                    } else if (randomDelivery == 7) {
                        System.out.println("Wide ball");
                        totalScore += 1;
                        m1.setExtras(++e);

                        w1.setWides(++w);
                    } else if (randomDelivery == 8) {
                        System.out.println("No ball");
                        totalScore += 1;
                        m1.setExtras(++e);
                        nb1.setNoBalls(++nb);
                    } else {
                        System.out.println("Dot ball");
                    }

                    balls++;

                    if (wickets == 10) {
                        break;
                    }

                }
                if (wickets == 10) {
                    System.out.println(match.getTeam1()+" All Out.");
                    break;
                }

            }

            battingSummary.write("Extras " + m1.getExtras() + " (Wides " + w1.getWides() + ", No Balls " + nb1.getNoBalls() + ")\n" + "Total - " + getTotalScore() + "/" + getWickets() + "\n\n");

            System.out.println("\n" + match.getTeam1()+" Total - " + getTotalScore() + "/" + getWickets() + "\nExtras " + m1.getExtras() + " (Wides " + w1.getWides() + ", No Balls " + nb1.getNoBalls() + ")");


            System.out.println();

            totalScore2 = 0;
            batsmanScore = 0;
            wickets = 0;

            e = 0;
            w = 0;
            nb = 0;
            o = 10;
            Extras m2 = new Extras(e);
            Wides w2 = new Wides(w);
            NoBalls nb2 = new NoBalls(nb);


            battingSummary.write(match.getTeam2() + " -Batting\n\n");
            bowlingSummary.write("\n" + match.getTeam1() + " -Bowling\n\n");

            //BowlSummary sum1 = new BowlSummary();

            n = 0;
            setBatsmanOnStrike(playersT2[n]);

            for (overs = 0; overs < 20; overs++) {
                if (wickets == 10) {
                    System.out.println("All Out");
                    break;
                }
                int randomBowler = r.nextInt(playersT1.length);

                System.out.println("\nOver " + (overs + 1) + " by " + playersT1[randomBowler]);

                int balls = 0;
                int overScore = 0;

                while (balls < 6) {

                    int randomDelivery = r.nextInt(delivery.length);

                    if (randomDelivery == 1) {
                        System.out.println("1 run");
                        totalScore2 += 1;
                        batsmanScore += 1;
                    } else if (randomDelivery == 2) {
                        System.out.println("2 runs");
                        totalScore2 += 2;
                        batsmanScore += 2;
                    } else if (randomDelivery == 4) {
                        System.out.println("4 runs");
                        totalScore2 += 4;
                        batsmanScore += 4;
                    } else if (randomDelivery == 6) {
                        System.out.println("6 runs");
                        totalScore2 += 6;
                        batsmanScore += 6;
                    } else if (randomDelivery == 3) {
                        System.out.println("3 runs");
                        totalScore2 += 3;
                        batsmanScore += 3;
                    } else if (randomDelivery == 5) {
                        System.out.println(getBatsmanOnStrike() + " Out! for " + getBatsmanScore());

                        int numW = r.nextInt(3);
                        battingSummary.write(getBatsmanOnStrike() + " " + getBatsmanScore() + "\n");
                        bowlingSummary.write(playersT1[o--] + " " + r.nextInt(3) + "\n");

                        if (batsmanOnStrike==playersT2[0]){
                            bat.setRunsPlayer0T1(getBatsmanScore());
                            bat.setBatsman0T1(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[1]){
                            bat.setRunsPlayer1T2(getBatsmanScore());
                            bat.setBatsman1T2(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[2]){
                            bat.setRunsPlayer2T2(getBatsmanScore());
                            bat.setBatsman2T2(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[3]){
                            bat.setRunsPlayer3T2(getBatsmanScore());
                            bat.setBatsman3T2(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[4]){
                            bat.setRunsPlayer4T2(getBatsmanScore());
                            bat.setBatsman4T2(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[5]){
                            bat.setRunsPlayer5T2(getBatsmanScore());
                            bat.setBatsman5T2(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[6]){
                            bat.setRunsPlayer6T2(getBatsmanScore());
                            bat.setBatsman6T2(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[7]){
                            bat.setRunsPlayer7T2(getBatsmanScore());
                            bat.setBatsman7T2(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[8]){
                            bat.setRunsPlayer8T2(getBatsmanScore());
                            bat.setBatsman8T2(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[9]){
                            bat.setRunsPlayer9T2(getBatsmanScore());
                            bat.setBatsman9T2(getBatsmanOnStrike());
                        }
                        else if (batsmanOnStrike==playersT2[10]){
                            bat.setRunsPlayer10T2(getBatsmanScore());
                            bat.setBatsman10T2(getBatsmanOnStrike());
                        }

                        if (playersT1[randomBowler]==playersT1[0]){
                            bowl.setWicketsPlayer0T1(numW);
                            bowl.setBatsman0T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[1]){
                            bowl.setWicketsPlayer1T1(numW);
                            bowl.setBatsman1T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[2]){
                            bowl.setWicketsPlayer2T1(numW);
                            bowl.setBatsman2T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[3]){
                            bowl.setWicketsPlayer3T1(numW);
                            bowl.setBatsman3T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[4]){
                            bowl.setWicketsPlayer4T1(numW);
                            bowl.setBatsman4T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[5]){
                            bowl.setWicketsPlayer5T1(numW);
                            bowl.setBatsman5T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[6]){
                            bowl.setWicketsPlayer6T1(numW);
                            bowl.setBatsman6T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[7]){
                            bowl.setWicketsPlayer7T1(numW);
                            bowl.setBatsman7T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[8]){
                            bowl.setWicketsPlayer7T1(numW);
                            bowl.setBatsman8T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[9]){
                            bowl.setWicketsPlayer9T1(numW);
                            bowl.setBatsman9T1(playersT1[randomBowler]);
                        }
                        else if (playersT1[randomBowler]==playersT1[10]){
                            bowl.setWicketsPlayer10T1(numW);
                            bowl.setBatsman10T1(playersT1[randomBowler]);
                        }

                        wickets += 1;
                        setBatsmanScore(0);
                        n += 1;
                        setBatsmanOnStrike(playersT2[n]);
                    } else if (randomDelivery == 7) {
                        System.out.println("Wide ball");
                        totalScore2 += 1;
                        m2.setExtras(++e);
                        w2.setWides(++w);
                    } else if (randomDelivery == 8) {
                        System.out.println("No ball");
                        totalScore2 += 1;
                        m2.setExtras(++e);
                        nb2.setNoBalls(++nb);
                    } else {
                        System.out.println("No run");
                    }

                    balls++;

                    if (wickets == 10) {
                        break;
                    }

                }
                if (wickets == 10) {
                    System.out.println(match.getTeam2()+" All Out.");
                    break;
                }

            }

            battingSummary.write("Extras " + m2.getExtras() + " (Wides " + w2.getWides() + ", No Balls " + nb2.getNoBalls() + ")\n" + "Total - " + getTotalScore2() + "/" + getWickets() + "\n\n");
            battingSummary.close();
            bowlingSummary.close();
            System.out.println("\n" + match.getTeam2()+" Total - " + getTotalScore2() + "/" + getWickets() + "\nExtras " + m2.getExtras() + " (Wides " + w2.getWides() + ", No Balls " + nb2.getNoBalls() + ")\n");


            MatchSummary sum = new MatchSummary();
            sum.summary();

            Match matchResult = new Match(1);
            if (getTotalScore2() > getTotalScore()) {
                matchResult.setWinningTeam(match.getTeam2());
            } else {
                matchResult.setWinningTeam(match.getTeam1());
            }

            System.out.println("\n"+matchResult.getWinningTeam() + " Won!\n");



            if (matchResult.getWinningTeam()=="Sri Lanka"){
                stand.setPointsSL(stand.getPointsSL()+2);
            }
            else if (matchResult.getWinningTeam()=="India"){
                stand.setPointsInd(stand.getPointsInd()+2);
            }
            else if (matchResult.getWinningTeam()=="Pakistan"){
                stand.setPointsPak(stand.getPointsPak()+2);
            }
            else if (matchResult.getWinningTeam()=="Australia"){
                stand.setPointsAus(stand.getPointsAus()+2);
            }
            else if (matchResult.getWinningTeam()=="England"){
                stand.setPointsEng(stand.getPointsEng()+2);
            }
            else if (matchResult.getWinningTeam()=="New Zealand"){
                stand.setPointsNZ(stand.getPointsNZ()+2);
            }
            else if (matchResult.getWinningTeam()=="South Africa"){
                stand.setPointsSA(stand.getPointsSA()+2);
            }
            else if (matchResult.getWinningTeam()=="West Indies"){
                stand.setPointsWI(stand.getPointsWI()+2);
            }



            Scanner askForAnother = new Scanner(System.in);
            System.out.println("\nEnter 1 to play the next match. Enter 0 to exit. ");
            int input = askForAnother.nextInt();
            if (input == 1) {
                continue;
            }
            else if (input == 0){
                break;
            }
        }

        bat.topBatsmen();
        bowl.topBowler();

        stand.showStandingsGroupA();
        stand.showStandingsGroupB();
    }
}

class ThreadSleep {

    public void timeOut() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
    }

}
