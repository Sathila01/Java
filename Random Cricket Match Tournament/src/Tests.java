public class Tests {

    public Integer Toss(){
        int head = 0;
        int tail = 1;
        int toss = 0;

        if (toss==0){
            toss=head;
        }
        else if(toss==1){
            toss=tail;
        }
        return toss;
    }

    public Integer dotBall(){
        int randomDelivery = 0;
        int totalScore = 0;

        if (randomDelivery==0){
            totalScore=+0;
        }
        return totalScore;
    }

    public Integer run1(){
        int randomDelivery = 1;
        int totalScore = 0;

        if (randomDelivery==1){
            totalScore=+1;
        }
        return totalScore;
    }

    public Integer run2(){
        int randomDelivery = 2;
        int totalScore = 0;

        if (randomDelivery==2){
            totalScore=totalScore+2;
        }
        return totalScore;
    }

    public Integer run3(){
        int randomDelivery = 3;
        int totalScore = 0;

        if (randomDelivery==3){
            totalScore=totalScore+3;
        }
        return totalScore;
    }

    public Integer four(){
        int randomDelivery = 4;
        int totalScore = 0;

        if (randomDelivery==4){
            totalScore=totalScore+4;
        }
        return totalScore;
    }

    public Integer six(){
        int randomDelivery = 6;
        int totalScore = 0;

        if (randomDelivery==6){
            totalScore=totalScore+6;
        }
        return totalScore;
    }

    public Integer wide(){
        int randomDelivery = 7;
        int totalScore = 0;

        if (randomDelivery==7){
            totalScore=totalScore+1;
        }
        return totalScore;
    }

    public Integer noBall(){
        int randomDelivery = 8;
        int totalScore = 0;

        if (randomDelivery==8){
            totalScore=totalScore+1;
        }
        return totalScore;
    }

    public Integer wicket(){
        int randomDelivery = 5;
        int wickets = 0;

        if (randomDelivery==5){
            wickets=wickets+1;
        }
        return wickets;
    }

    public boolean matchResult(){
        int totalScore1 = 101;
        int totalScore2 = 100;
        boolean winTeam1 = true;

        if (totalScore1>totalScore2){
            System.out.println("Team 1 wins");
            winTeam1 = true;
        }
        else if (totalScore1<totalScore2){
            System.out.println("Team 2 wins");
            winTeam1 = false;
        }
        return winTeam1;
    }

    public Integer playerScore(){
        int playerScores[] = new int[10];
        int player1score = 15;
        int playerID = 0;

        if (playerID==0){
            playerScores[0]=player1score;
        }
        return playerScores[0];
    }
}
