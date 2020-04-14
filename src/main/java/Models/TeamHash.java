package Models;

import java.util.*;
/**
 *
 * @author Neal Nisbet B00380762
 */
public class TeamHash {

    Team Glasgow = new Team("Glasgow Clan", 48, 14, 26, 5, 3, 0.427, 41, 141, 181, 2.94, 3.77, 2926, 1424, 1560, 50.92, 2871, 15.00, 200, 72.02, 196);
    Team Sheffield = new Team("Sheffield Steelers", 49, 28, 17, 3, 1, 0.643, 63, 211, 154, 4.31, 3.14, 6610, 1702, 1514, 46.05, 2971, 22.03, 236, 80.80, 250);

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
    
    public TreeMap<Integer, TreeMap> AllTeamsTree() {
        TreeMap<Integer, TreeMap> teamTree = new TreeMap<>();
        teamTree.put(0, GlasgowClan());
        teamTree.put(1, SheffieldSteelers());

        return teamTree;
    }

    public TreeMap<Integer, String> GlasgowClan() {
        TreeMap<Integer, String> glasgowClan = new TreeMap<>();
        glasgowClan.put(0, "Glasgow Clan");
        glasgowClan.put(1, "48");
        glasgowClan.put(2, "14");
        glasgowClan.put(3, "26");
        glasgowClan.put(4, "5");
        glasgowClan.put(5, "3");
        glasgowClan.put(6, "0.427");
        glasgowClan.put(7, "41");
        glasgowClan.put(8, "141");
        glasgowClan.put(9, "181");
        glasgowClan.put(10, "2.94");
        glasgowClan.put(11, "3.77");
        glasgowClan.put(12, "2926");
        glasgowClan.put(13, "1424");
        glasgowClan.put(14, "1560");
        glasgowClan.put(15, "50.92");
        glasgowClan.put(16, "2871");
        glasgowClan.put(17, "15.00");
        glasgowClan.put(18, "200");
        glasgowClan.put(19, "72.02");
        glasgowClan.put(20, "196");

        return glasgowClan;
    }

    public TreeMap<Integer, String> SheffieldSteelers() {
        TreeMap<Integer, String> sheffieldSteelers = new TreeMap<>();
        sheffieldSteelers.put(0, "Sheffield Steelers");
        sheffieldSteelers.put(1, "49");
        sheffieldSteelers.put(2, "28");
        sheffieldSteelers.put(3, "17");
        sheffieldSteelers.put(4, "3");
        sheffieldSteelers.put(5, "1");
        sheffieldSteelers.put(6, "0.643");
        sheffieldSteelers.put(7, "63");
        sheffieldSteelers.put(8, "211");
        sheffieldSteelers.put(9, "154");
        sheffieldSteelers.put(10, "4.31");
        sheffieldSteelers.put(11, "3.14");
        sheffieldSteelers.put(12, "6610");
        sheffieldSteelers.put(13, "1702");
        sheffieldSteelers.put(14, "1514");
        sheffieldSteelers.put(15, "46.05");
        sheffieldSteelers.put(16, "2971");
        sheffieldSteelers.put(17, "22.03");
        sheffieldSteelers.put(18, "236");
        sheffieldSteelers.put(19, "80.80");
        sheffieldSteelers.put(20, "250");

        return sheffieldSteelers;
    }
}