package Models;

import java.util.*;
/**
 *
 * @author Neal Nisbet B00380762
 */
public class TeamHash {

    Team Glasgow = new Team("Glasgow Clan", 48, 14, 26, 5, 3, 0.427, 41, 141, 181, 2.94, 3.77, 2926, 1424, 1560, 50.92, 2871, 15.00, 200, 72.02, 196);
    Team Sheffield = new Team("Sheffield Steelers", 49, 28, 17, 3, 1, 0.643, 63, 211, 154, 4.31, 3.14, 6610, 1702, 1514, 46.05, 2971, 22.03, 236, 80.80, 250);

//    public static void HashMap(){
//        HashMap<Integer, String> teamMap = new HashMap<>();
//        teamMap.put(1, "Glasgow");
//        teamMap.put(2, "Sheffield");
//    }
    public HashMap<Integer, Team> AllTeamsHash() {
        HashMap<Integer, Team> teamMap = new HashMap<>();
        teamMap.put(0, Glasgow);
        teamMap.put(1, Sheffield);

        return teamMap;
    }

    public Team[] AllTeamsArray() {
        Team teamArray[] = new Team[2];
        Arrays.fill(teamArray, Glasgow);
        Arrays.fill(teamArray, Sheffield);

        return teamArray;
    }
}
