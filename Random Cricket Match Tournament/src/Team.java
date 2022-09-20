import java.util.Random;

public class Team {
    private String team1;
    private String team2;


    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public void playingTeams(){

        Random rand = new Random();
        Group grp = new Group();
        if (grp.groupSelection()==0){

            if (grp.matchSelection()==0){
                setTeam1("Sri Lanka");
                setTeam2("India");
            }
            else if (grp.matchSelection()==1){
                setTeam1("Sri Lanka");
                setTeam2("Pakistan");
            }
            else if (grp.matchSelection()==2){
                setTeam1("Sri Lanka");
                setTeam2("Australia");
            }
            else if (grp.matchSelection()==3){
                setTeam1("India");
                setTeam2("Pakistan");
            }
            else if (grp.matchSelection()==4){
                setTeam1("India");
                setTeam2("Australia");
            }
            else {
                setTeam1("Pakistan");
                setTeam2("Australia");
            }

        }else {

            if (grp.matchSelection()==0){
                setTeam1("England");
                setTeam2("New Zealand");
            }
            else if (grp.matchSelection()==1){
                setTeam1("England");
                setTeam2("West Indies");
            }
            else if (grp.matchSelection()==2){
                setTeam1("England");
                setTeam2("South Africa");
            }
            else if (grp.matchSelection()==3){
                setTeam1("New Zealand");
                setTeam2("West Indies");
            }
            else if (grp.matchSelection()==4){
                setTeam1("New Zealand");
                setTeam2("South Africa");
            }
            else {
                setTeam1("West Indies");
                setTeam2("South Africa");
            }
        }

        System.out.println(getTeam1()+" vs "+getTeam2());
        System.out.println();
    }
}
