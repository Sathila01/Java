import java.security.SecureRandom;
import java.util.Random;
import java.util.Arrays;

public class Group {

    private String[] groupATeams = {"Sri Lanka", "India", "Pakistan", "Australia"};
    private String[] groupBTeams = {"England", "South Africa", "New Zealand", "West Indies"};
    private String group;

    public String[] getGroupATeams() {
        return groupATeams;
    }

    public String[] getGroupBTeams() {
        return groupBTeams;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int groupSelection(){

        int[] group = {0, 1};

        Random r = new Random();
        int randomGroup = r.nextInt(group.length);
        if (randomGroup==0){
            setGroup("Group A");
            System.out.println("Group A\n");
            for (String j : getGroupATeams()) {
                System.out.println(j);
            }
        }
        else {
            setGroup("Group B");
            System.out.println("Group B\n");
            for (String j : getGroupBTeams()) {
                System.out.println(j);
            }
        }
        System.out.println();

        return randomGroup;
    }

    public int matchSelection(){

        String[] matches;


        if (group=="Group A"){
            matches = new String[]{"SL vs Ind", "SL, vs Pak", "SL vs Aus", "Ind vs Pak", "Ind vs Aus", "Pak vs Aus"};
        }
        else {
            matches = new String[]{"Eng vs NZ", "Eng vs WI", "Eng vs SA", "NZ vs WI", "NZ vs SA", "WI vs SA"};
        }

        int[] matchArray = {0, 1, 2, 3, 4, 5};

        Random r = new Random();
        int randomMatch = r.nextInt(matchArray.length);

        return randomMatch;
    }
}
