import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("------- Welcome to ICC T20 Cricket World Cup 2022 ! -------\n");
        System.out.println("You are allowed to change team and player profiles before the start of the tournament!\n");

        RandomMatch newTournament = new RandomMatch();
        newTournament.main();
    }
}
