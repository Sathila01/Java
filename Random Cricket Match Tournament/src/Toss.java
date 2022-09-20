import java.util.List;
import java.util.Random;

public class Toss {
    public void toss(){

        System.out.println("Welcome to the toss..");

        int[] coin = {0, 1};

        Random r = new Random();
        int randomToss = r.nextInt(coin.length);
        if (randomToss==0){
            System.out.println("It's Head");
        }
        else {
            System.out.println("It's Tail");
        }
    }
}
