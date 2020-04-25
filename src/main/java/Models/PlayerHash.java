package Models;

import java.util.*;
/**
 *
 * @author Neal Nisbet B00380762
 */
public class PlayerHash {
    // <editor-fold desc="create Glasgow players">
    Player LaPorte16 = new Player(37, "Nolan LaPorte", "Glasgow Clan", "FW", 47, 16, 23, 39, 41, 3, 0, 182, 282, 44, 36);
    Player Bjerrum16 = new Player(16, "Rasmus Bjerrum", "Glasgow Clan", "FW", 48, 20, 17, 37, 24, 4, 2, 135, 202, 13, 20);
    Player Rau5 = new Player(5, "Chad Rau", "Glasgow Clan", "FW", 43, 12, 24, 36, 10, 2, 0, 79, 118, 338, 268);
    Player Pitt61 = new Player(61, "Scott Pitt", "Glasgow Clan", "FW", 45, 9, 21, 30, 48, 3, 0, 82, 138, 349, 355);
    Player Beca26 = new Player(26, "Matt Beca", "Glasgow Clan","FW", 39, 13, 15, 28, 40, 4, 0, 80, 141, 4, 10);
    Player Pufahl44 = new Player(44, "Matt Pufahl", "Glasgow Clan", "D ", 47, 6, 20, 26, 34, 0, 0, 88, 156, 1, 0);
    Player Roy15 = new Player(15, "Mathieu Roy", "Glasgow Clan", "FW", 35, 14, 10, 24, 16, 5, 1, 87, 149, 18, 19);
    Player Ehrhardt2 = new Player(2, "Travis Ehrhardt", "Glasgow Clan", "D ", 44, 6, 18, 24, 42, 1, 0, 138, 231, 0, 0);
    Player Lidhammar21 = new Player(21, "Mikael Lidhammar", "Glasgow Clan", "FW", 45, 5, 18, 23, 54, 0, 0, 72, 113, 10, 17);
    Player Heywood17 = new Player(17, "Jordan Heywood", "Glasgow Clan", "D ", 35, 6, 14, 20, 26, 1, 0, 66, 123, 0, 0);
    Player Peacock71 = new Player(71, "Craig Peacock", "Glasgow Clan", "FW", 44, 7, 12, 19, 31, 5, 0, 72, 116, 412, 289);
    Player Springer27 = new Player(27, "Linden Springer", "Glasgow Clan", "D ", 47, 5, 12, 17, 101, 0, 0, 64, 116, 0, 0);
    Player Stanisz58 = new Player(58, "Matt Stanisz", "Glasgow Clan", "D ", 40, 2, 14, 16, 45, 1, 0, 69, 120, 0, 1);
    Player Haywood11 = new Player(11, "Matthew Haywood", "Glasgow Clan", "FW", 48, 6, 8, 14, 28, 0, 1, 51, 65, 114, 209);
    Player Tanski41 = new Player(41, "Scott Tanski", "Glasgow Clan", "FW", 29, 5, 6, 11, 16, 0, 1, 44, 67, 60, 78);
    Player Jonsson33 = new Player(33, "Marcus Jonsson", "Glasgow Clan", "FW", 15, 3, 4, 7, 4, 0, 0, 24, 29, 5, 9);
    Player Howlett20 = new Player(20, "Mac Howlett", "Glasgow Clan", "FW", 46, 3, 1, 4, 0 ,0, 0, 25, 34, 18, 23);
    Player Musil24 = new Player(24, "Jack Musil", "Glasgow Clan", "FW", 25, 1, 3, 4, 6, 0, 0, 15, 24, 18, 24);
    Player Jacklin54 = new Player(54, "Scott Jacklin", "Glasgow Clan", "FW", 11, 1, 2, 3, 8, 0, 0, 22, 31, 58, 51);
    Player Moore29 = new Player(29, "Craig Moore", "Glasgow Clan", "D ", 31, 1, 2, 3, 10, 0, 0, 15, 32, 0, 0);
    Player Robertson22 = new Player(22, "Sean Robertson", "Glasgow Clan", "D ", 9, 0, 3, 3, 0, 0, 0, 6, 8, 0, 0);
    Player Stenton10 = new Player(10, "Liam Stenton", "Glasgow Clan", "D ", 10, 0, 2, 2, 0, 0, 0, 1, 3, 0, 0);
    Player Fitzgerald13 = new Player(13, "Zack Fitzgerald", "Glasgow Clan", "D ", 4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0);
    Player Henderson89 = new Player(89, "Scott Henderson", "Glasgow Clan", "FW", 5, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0);
    Player Smith19 = new Player(19, "Chad Smith", "Glasgow Clan", "FW", 26, 0, 0, 0, 6, 0, 0, 6, 14, 0, 0);

    //create Glasgow goalies
    Player Killeen32 = new Player(32, "Patrick Killeen", "Glasgow Clan", "GK",	43, 18, 25, 1, 1377, 152, 2497, 3.65, 88.96);
    Player McLaughlin88 = new Player(88, "Jordan McLaughlin", "Glasgow Clan", "GK", 9, 1, 4, 0, 170, 24, 370, 3.89, 85.88);
    // </editor-fold>
    
    // <editor-fold desc="create Sheffield players">
    Player Connolly63 = new Player(63, "Brendan Connolly", "Sheffield Steelers", "FW", 48, 26, 29, 55, 86, 11, 2, 128, 208, 381, 471);
    Player Vallerand88 = new Player(88, "Marc-Olivier Vallerand", "Sheffield Steelers", "FW", 40, 26, 25, 51, 47, 11, 1, 158, 282, 1, 4);
    Player DeLuca15 = new Player(15, "Anthony DeLuca", "Sheffield Steelers", "FW", 42, 26, 21, 47, 61, 8, 0, 159, 252, 9, 8);
    Player Eberle10 = new Player(10, "Tanner Eberle", "Sheffield Steelers", "FW", 49, 21, 23, 44, 58, 5, 1, 138, 217, 164, 238);
    Player Lemtyugov52 = new Player(52, "Nikolai Lemtyugov", "Sheffield Steelers", "FW", 49, 15, 27, 42, 56, 3, 0, 108, 197, 0, 4);
    Player Troncinsky8 = new Player(8, "Marek Troncinsky", "Sheffield Steelers", "D ", 43, 12, 30, 42, 40, 5, 1, 114, 209, 0, 0);
    Player Armstrong90 = new Player(90, "John Armstrong", "Sheffield Steelers", "C ", 45, 12, 28, 40, 28, 1, 1, 103, 173, 496, 418);
    Player Davies19 = new Player(19, "Michael Davies", "Sheffield Steelers", "FW", 41, 13, 26, 39, 28, 6, 0, 110, 170, 138, 245);
    Player Brocklehurst2 = new Player(2, "Aaron Brocklehurst", "Sheffield Steelers", "D ", 47, 2, 32, 34, 74, 0, 0, 75, 160, 0, 1);
    Player OConnor81 = new Player(81, "Ben O'Connor", "Sheffield Steelers", "D ", 44, 3, 29, 32, 43, 0, 0, 109, 198, 0, 0);
    Player Sandström28 = new Player(28, "Lucas Sandström", "Sheffield Steelers", "FW", 44, 12, 19, 31, 23, 2, 0, 74, 108, 2, 2);
    Player Dowd75 = new Player(75, "Robert Dowd", "Sheffield Steelers", "FW", 24, 13, 11, 24, 23, 3, 0, 85, 122, 2, 3);
    Player Meland14 = new Player(14, "Eric Meland", "Sheffield Steelers", "FW", 35, 7, 11, 18, 12, 0, 2, 63, 108, 49, 66);
    Player Phillips20 = new Player(20, "Jonathan Phillips", "Sheffield Steelers", "FW", 49, 7, 8, 15, 14, 0, 2, 70, 106, 64, 99);
    Player Phillips13 = new Player(13, "David Phillips", "Sheffield Steelers", "D ", 49, 3, 11, 14, 16, 0, 0, 48, 97, 0, 2);
    Player Hrabal97 = new Player(97, "Josef Hrabal", "Sheffield Steelers", "D ", 19, 3, 8, 11, 10, 0, 0, 11, 27, 0, 0);
    Player Bettauer42 = new Player(42, "James Bettauer", "Sheffield Steelers", "D ", 27, 4, 3, 7, 12, 1, 0, 57, 90, 0, 0);
    Player Johnson53 = new Player(53, "Aaron Johnson", "Sheffield Steelers", "D ", 17, 1, 5, 6, 20, 0, 0, 17, 37, 0, 0);
    Player Kolehmainen55 = new Player(55, "Janne Kolehmainen", "Sheffield Steelers", "FW", 23, 2, 1, 3, 10, 0, 0, 27, 52, 5, 8);
    Player Liwing23 = new Player(23, "Jonas Liwing", "Sheffield Steelers", "D ", 17, 1, 2, 3, 2, 0, 0, 10, 13, 0, 0);
    Player Kuukka91 = new Player(91, "Mikko Kuukka", "Sheffield Steelers", "D ", 18, 0, 3, 3, 10, 0, 0, 9, 22, 0, 0);
    Player StPierre39 = new Player(39, "Martin St. Pierre", "Sheffield Steelers", "FW", 5, 1, 1, 2, 4, 0, 0, 6, 10, 52, 30);
    Player Graham21 = new Player(21, "Alex Graham", "Sheffield Steelers", "FW", 8, 1, 0, 1, 0, 0, 0, 1, 4, 0, 0);
    Player Shudra27 = new Player(27, "Cole Shudra", "Sheffield Steelers", "FW", 49, 0, 0, 0, 10, 0, 0, 22, 32, 5, 4);
    Player Brown12 = new Player(12, "Kieran Brown", "Sheffield Steelers", "FW", 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

    //create Sheffield goalies
    Player Duba70 = new Player(70, "Tomáš Duba", "Sheffield Steelers", "GK", 48, 31, 16, 2, 1464, 142, 2789, 3.05, 90.3);
    Player Kantor41 = new Player(41, "Pavel Kantor", "Sheffield Steelers", "GK", 2, 0, 2, 0, 38, 6, 103, 3.5, 84.21);
    Player Kerlin31 = new Player(31, "William Kerlin", "Sheffield Steelers", "GK", 3, 0, 0, 0, 7, 2, 13, 9.23, 71.43);
    Player Warburton34 = new Player(34, "Curtis Warburton", "Sheffield Steelers", "GK", 1, 0, 0, 0, 0, 0, 2, 0, 0);
    // </editor-fold>

    public HashMap<Integer, Player> AllPLayersHash(){
        HashMap<Integer, Player> playerMap = new HashMap<>();
        // <editor-fold desc="add all players to hashtable">
        playerMap.put(0, LaPorte16);
        playerMap.put(1, Bjerrum16);
        playerMap.put(2, Rau5);
        playerMap.put(3, Pitt61);
        playerMap.put(4, Beca26);
        playerMap.put(5, Pufahl44);
        playerMap.put(6, Roy15);
        playerMap.put(7, Ehrhardt2);
        playerMap.put(8, Lidhammar21);
        playerMap.put(9, Heywood17);
        playerMap.put(10, Peacock71);
        playerMap.put(11, Springer27);
        playerMap.put(12, Stanisz58);
        playerMap.put(13, Haywood11);
        playerMap.put(14, Tanski41);
        playerMap.put(15, Jonsson33);
        playerMap.put(16, Howlett20);
        playerMap.put(17, Musil24);
        playerMap.put(18, Jacklin54);
        playerMap.put(19, Moore29);
        playerMap.put(20, Robertson22);
        playerMap.put(21, Stenton10);
        playerMap.put(22, Fitzgerald13);
        playerMap.put(23, Henderson89);
        playerMap.put(24, Smith19);
        playerMap.put(25, Killeen32);
        playerMap.put(26, McLaughlin88);
        
        playerMap.put(27, Connolly63);
        playerMap.put(29, Vallerand88);
        playerMap.put(30, DeLuca15);
        playerMap.put(31, Eberle10);
        playerMap.put(32, Lemtyugov52);
        playerMap.put(33, Troncinsky8);
        playerMap.put(34, Armstrong90);
        playerMap.put(35, Davies19);
        playerMap.put(36, Brocklehurst2);
        playerMap.put(37, OConnor81);
        playerMap.put(38, Sandström28);
        playerMap.put(39, Dowd75);
        playerMap.put(40, Meland14);
        playerMap.put(41, Phillips20);
        playerMap.put(42, Phillips13);
        playerMap.put(43, Hrabal97);
        playerMap.put(44, Bettauer42);
        playerMap.put(45, Johnson53);
        playerMap.put(46, Kolehmainen55);
        playerMap.put(47, Liwing23);
        playerMap.put(48, Kuukka91);
        playerMap.put(49, StPierre39);
        playerMap.put(50, Graham21);
        playerMap.put(51, Shudra27);
        playerMap.put(52, Brown12);
        playerMap.put(53, Duba70);
        playerMap.put(54, Kantor41);
        playerMap.put(55, Kerlin31);
        playerMap.put(56, Warburton34);
        // </editor-fold>
        
        return playerMap;
    }
    
    public Player[] AllPlayersArray(){
        Player playerArray[] = new Player[56];
        // <editor-fold desc="add all players to array">
        Arrays.fill(playerArray, LaPorte16);
        Arrays.fill(playerArray, Bjerrum16);
        Arrays.fill(playerArray, Rau5);
        Arrays.fill(playerArray, Pitt61);
        Arrays.fill(playerArray, Beca26);
        Arrays.fill(playerArray, Pufahl44);
        Arrays.fill(playerArray, Roy15);
        Arrays.fill(playerArray, Ehrhardt2);
        Arrays.fill(playerArray, Lidhammar21);
        Arrays.fill(playerArray, Heywood17);
        Arrays.fill(playerArray, Peacock71);
        Arrays.fill(playerArray, Springer27);
        Arrays.fill(playerArray, Stanisz58);
        Arrays.fill(playerArray, Haywood11);
        Arrays.fill(playerArray, Tanski41);
        Arrays.fill(playerArray, Jonsson33);
        Arrays.fill(playerArray, Howlett20);
        Arrays.fill(playerArray, Musil24);
        Arrays.fill(playerArray, Jacklin54);
        Arrays.fill(playerArray, Moore29);
        Arrays.fill(playerArray, Robertson22);
        Arrays.fill(playerArray, Stenton10);
        Arrays.fill(playerArray, Fitzgerald13);
        Arrays.fill(playerArray, Henderson89);
        Arrays.fill(playerArray, Smith19);
        Arrays.fill(playerArray, Killeen32);
        Arrays.fill(playerArray, McLaughlin88);
        
        Arrays.fill(playerArray, Connolly63);
        Arrays.fill(playerArray, Vallerand88);
        Arrays.fill(playerArray, DeLuca15);
        Arrays.fill(playerArray, Eberle10);
        Arrays.fill(playerArray, Lemtyugov52);
        Arrays.fill(playerArray, Troncinsky8);
        Arrays.fill(playerArray, Armstrong90);
        Arrays.fill(playerArray, Davies19);
        Arrays.fill(playerArray, Brocklehurst2);
        Arrays.fill(playerArray, OConnor81);
        Arrays.fill(playerArray, Sandström28);
        Arrays.fill(playerArray, Dowd75);
        Arrays.fill(playerArray, Meland14);
        Arrays.fill(playerArray, Phillips20);
        Arrays.fill(playerArray, Phillips13);
        Arrays.fill(playerArray, Hrabal97);
        Arrays.fill(playerArray, Bettauer42);
        Arrays.fill(playerArray, Johnson53);
        Arrays.fill(playerArray, Kolehmainen55);
        Arrays.fill(playerArray, Liwing23);
        Arrays.fill(playerArray, Kuukka91);
        Arrays.fill(playerArray, StPierre39);
        Arrays.fill(playerArray, Graham21);
        Arrays.fill(playerArray, Shudra27);
        Arrays.fill(playerArray, Brown12);
        Arrays.fill(playerArray, Duba70);
        Arrays.fill(playerArray, Kantor41);
        Arrays.fill(playerArray, Kerlin31);
        Arrays.fill(playerArray, Warburton34);
        // </editor-fold>
        
        return playerArray;
    }
    
    public TreeMap<Integer, TreeMap> AllPlayersTree() {
        TreeMap<Integer, TreeMap> playerTree = new TreeMap<>();
        // <editor-fold desc="put Glasgow players">
        playerTree.put(0, LaPorte16());
        playerTree.put(1, Bjerrum16());
        playerTree.put(2, Rau5());
        playerTree.put(3, Pitt61());
        playerTree.put(4, Beca26());
        playerTree.put(5, Pufahl44());
        playerTree.put(6, Roy15());
        playerTree.put(7, Ehrhardt2());
        playerTree.put(8, Lidhammar21());
        playerTree.put(9, Heywood17());
        playerTree.put(10, Peacock71());
        playerTree.put(11, Springer27());
        playerTree.put(12, Stanisz58());
        playerTree.put(13, Haywood11());
        playerTree.put(14, Tanski41());
        playerTree.put(15, Jonsson33());
        playerTree.put(16, Howlett20());
        playerTree.put(17, Musil24());
        playerTree.put(18, Jacklin54());
        playerTree.put(19, Moore29());
        playerTree.put(20, Robertson22());
        playerTree.put(21, Stenton10());
        playerTree.put(22, Fitzgerald13());
        playerTree.put(23, Henderson89());
        playerTree.put(24, Smith19());

        //put Glasgow goalies
        playerTree.put(25, Killeen32());
        playerTree.put(26, McLaughlin88());
        // </editor-fold>

        // <editor-fold desc="put Sheffield players">
        playerTree.put(27, Connolly63());
        playerTree.put(28, Vallerand88());
        playerTree.put(29, DeLuca15());
        playerTree.put(30, Eberle10());
        playerTree.put(31, Lemtyugov52());
        playerTree.put(32, Troncinsky8());
        playerTree.put(33, Armstrong90());
        playerTree.put(34, Davies19());
        playerTree.put(35, Brocklehurst2());
        playerTree.put(37, OConnor81());
        playerTree.put(38, Sandström28());
        playerTree.put(39, Dowd75());
        playerTree.put(40, Meland14());
        playerTree.put(41, Phillips20());
        playerTree.put(42, Phillips13());
        playerTree.put(43, Hrabal97());
        playerTree.put(44, Bettauer42());
        playerTree.put(45, Johnson53());
        playerTree.put(46, Kolehmainen55());
        playerTree.put(47, Liwing23());
        playerTree.put(48, Kuukka91());
        playerTree.put(49, StPierre39());
        playerTree.put(50, Graham21());
        playerTree.put(51, Shudra27());
        playerTree.put(52, Brown12());

        //put Sheffield goalies
        playerTree.put(53, Duba70());
        playerTree.put(54, Kantor41());
        playerTree.put(55, Kerlin31());
        playerTree.put(56, Warburton34());
        // </editor-fold>

        return playerTree;
    }

    // <editor-fold desc="create Glasgow players Tree">
    public TreeMap<Integer, String> LaPorte16() {
        TreeMap<Integer, String> laPorte16 = new TreeMap<>();
        laPorte16.put(0, "37");
        laPorte16.put(1, "Nolan LaPorte");
        laPorte16.put(2, "Glasgow Clan");
        laPorte16.put(3, "FW");
        laPorte16.put(4, "47");
        laPorte16.put(5, "16");
        laPorte16.put(6, "23");
        laPorte16.put(7, "39");
        laPorte16.put(8, "41");
        laPorte16.put(9, "3");
        laPorte16.put(10, "0");
        laPorte16.put(11, "182");
        laPorte16.put(12, "282");
        laPorte16.put(13, "44");
        laPorte16.put(14, "36");

        return laPorte16;
    }
    
    public TreeMap<Integer, String> Bjerrum16() {
        TreeMap<Integer, String> bjerrum16 = new TreeMap<>();
        bjerrum16.put(0, "16");
        bjerrum16.put(1, "Rasmus Bjerrum");
        bjerrum16.put(2, "Glasgow Clan");
        bjerrum16.put(3, "FW");
        bjerrum16.put(4, "48");
        bjerrum16.put(5, "20");
        bjerrum16.put(6, "17");
        bjerrum16.put(7, "37");
        bjerrum16.put(8, "24");
        bjerrum16.put(9, "4");
        bjerrum16.put(10, "2");
        bjerrum16.put(11, "135");
        bjerrum16.put(12, "202");
        bjerrum16.put(13, "13");
        bjerrum16.put(14, "20");

        return bjerrum16;
    }

    public TreeMap<Integer, String> Rau5() {
        TreeMap<Integer, String> rau5 = new TreeMap<>();
        rau5.put(0, "5");
        rau5.put(1, "Chad Rau");
        rau5.put(2, "Glasgow Clan");
        rau5.put(3, "FW");
        rau5.put(4, "43");
        rau5.put(5, "12");
        rau5.put(6, "24");
        rau5.put(7, "36");
        rau5.put(8, "10");
        rau5.put(9, "2");
        rau5.put(10, "0");
        rau5.put(11, "79");
        rau5.put(12, "118");
        rau5.put(13, "228");
        rau5.put(14, "268");

        return rau5;
    }
    
    public TreeMap<Integer, String> Pitt61() {
        TreeMap<Integer, String> pitt61 = new TreeMap<>();
        pitt61.put(0, "61");
        pitt61.put(1, "Scott Pitt");
        pitt61.put(2, "Glasgow Clan");
        pitt61.put(3, "FW");
        pitt61.put(4, "45");
        pitt61.put(5, "9");
        pitt61.put(6, "21");
        pitt61.put(7, "30");
        pitt61.put(8, "48");
        pitt61.put(9, "3");
        pitt61.put(10, "0");
        pitt61.put(11, "82");
        pitt61.put(12, "138");
        pitt61.put(13, "349");
        pitt61.put(14, "335");

        return pitt61;
    }
    
    public TreeMap<Integer, String> Beca26() {
        TreeMap<Integer, String> beca26 = new TreeMap<>();
        beca26.put(0, "26");
        beca26.put(1, "Matt Beca");
        beca26.put(2, "Glasgow Clan");
        beca26.put(3, "FW");
        beca26.put(4, "39");
        beca26.put(5, "13");
        beca26.put(6, "15");
        beca26.put(7, "28");
        beca26.put(8, "40");
        beca26.put(9, "4");
        beca26.put(10, "0");
        beca26.put(11, "80");
        beca26.put(12, "141");
        beca26.put(13, "4");
        beca26.put(14, "10");

        return beca26;
    }
    
    public TreeMap<Integer, String> Pufahl44() {
        TreeMap<Integer, String> pufahl44 = new TreeMap<>();
        pufahl44.put(0, "44");
        pufahl44.put(1, "Matt Pufahl");
        pufahl44.put(2, "Glasgow Clan");
        pufahl44.put(3, "D ");
        pufahl44.put(4, "47");
        pufahl44.put(5, "6");
        pufahl44.put(6, "20");
        pufahl44.put(7, "26");
        pufahl44.put(8, "34");
        pufahl44.put(9, "0");
        pufahl44.put(10, "0");
        pufahl44.put(11, "88");
        pufahl44.put(12, "156");
        pufahl44.put(13, "1");
        pufahl44.put(14, "0");

        return pufahl44;
    }
    
    public TreeMap<Integer, String> Roy15() {
        TreeMap<Integer, String> roy15 = new TreeMap<>();
        roy15.put(0, "15");
        roy15.put(1, "Mathieu Roy");
        roy15.put(2, "Glasgow Clan");
        roy15.put(3, "FW");
        roy15.put(4, "35");
        roy15.put(5, "14");
        roy15.put(6, "10");
        roy15.put(7, "24");
        roy15.put(8, "16");
        roy15.put(9, "5");
        roy15.put(10, "1");
        roy15.put(11, "87");
        roy15.put(12, "149");
        roy15.put(13, "18");
        roy15.put(14, "19");

        return roy15;
    }    
    
    public TreeMap<Integer, String> Ehrhardt2() {
        TreeMap<Integer, String> ehrhardt2 = new TreeMap<>();
        ehrhardt2.put(0, "2");
        ehrhardt2.put(1, "Travis Ehrhardt");
        ehrhardt2.put(2, "Glasgow Clan");
        ehrhardt2.put(3, "D ");
        ehrhardt2.put(4, "44");
        ehrhardt2.put(5, "6");
        ehrhardt2.put(6, "18");
        ehrhardt2.put(7, "24");
        ehrhardt2.put(8, "42");
        ehrhardt2.put(9, "1");
        ehrhardt2.put(10, "0");
        ehrhardt2.put(11, "138");
        ehrhardt2.put(12, "231");
        ehrhardt2.put(13, "0");
        ehrhardt2.put(14, "0");

        return ehrhardt2;
    }       
    
    public TreeMap<Integer, String> Lidhammar21() {
        TreeMap<Integer, String> lidhammar21 = new TreeMap<>();
        lidhammar21.put(0, "21");
        lidhammar21.put(1, "Mikael Lidhammar");
        lidhammar21.put(2, "Glasgow Clan");
        lidhammar21.put(3, "FW");
        lidhammar21.put(4, "45");
        lidhammar21.put(5, "5");
        lidhammar21.put(6, "18");
        lidhammar21.put(7, "23");
        lidhammar21.put(8, "54");
        lidhammar21.put(9, "0");
        lidhammar21.put(10, "0");
        lidhammar21.put(11, "72");
        lidhammar21.put(12, "113");
        lidhammar21.put(13, "10");
        lidhammar21.put(14, "17");

        return lidhammar21;
    }    
    
    public TreeMap<Integer, String> Heywood17() {
        TreeMap<Integer, String> heywood17 = new TreeMap<>();
        heywood17.put(0, "17");
        heywood17.put(1, "Jordan Heywood");
        heywood17.put(2, "Glasgow Clan");
        heywood17.put(3, "D ");
        heywood17.put(4, "35");
        heywood17.put(5, "6");
        heywood17.put(6, "14");
        heywood17.put(7, "20");
        heywood17.put(8, "26");
        heywood17.put(9, "1");
        heywood17.put(10, "0");
        heywood17.put(11, "66");
        heywood17.put(12, "123");
        heywood17.put(13, "0");
        heywood17.put(14, "0");

        return heywood17;
    }     
    
    public TreeMap<Integer, String> Peacock71() {
        TreeMap<Integer, String> peacock71 = new TreeMap<>();
        peacock71.put(0, "71");
        peacock71.put(1, "Craig Peacock");
        peacock71.put(2, "Glasgow Clan");
        peacock71.put(3, "FW");
        peacock71.put(4, "44");
        peacock71.put(5, "7");
        peacock71.put(6, "12");
        peacock71.put(7, "19");
        peacock71.put(8, "31");
        peacock71.put(9, "5");
        peacock71.put(10, "0");
        peacock71.put(11, "72");
        peacock71.put(12, "116");
        peacock71.put(13, "412");
        peacock71.put(14, "289");

        return peacock71;
    }     
    
    public TreeMap<Integer, String> Springer27() {
        TreeMap<Integer, String> springer27 = new TreeMap<>();
        springer27.put(0, "27");
        springer27.put(1, "Linden Springer");
        springer27.put(2, "Glasgow Clan");
        springer27.put(3, "D ");
        springer27.put(4, "47");
        springer27.put(5, "5");
        springer27.put(6, "12");
        springer27.put(7, "17");
        springer27.put(8, "101");
        springer27.put(9, "0");
        springer27.put(10, "0");
        springer27.put(11, "64");
        springer27.put(12, "116");
        springer27.put(13, "0");
        springer27.put(14, "0");

        return springer27;
    }     
    
    public TreeMap<Integer, String> Stanisz58() {
        TreeMap<Integer, String> stanisz58 = new TreeMap<>();
        stanisz58.put(0, "58");
        stanisz58.put(1, "Matt Stanisz");
        stanisz58.put(2, "Glasgow Clan");
        stanisz58.put(3, "D ");
        stanisz58.put(4, "40");
        stanisz58.put(5, "2");
        stanisz58.put(6, "14");
        stanisz58.put(7, "16");
        stanisz58.put(8, "45");
        stanisz58.put(9, "1");
        stanisz58.put(10, "0");
        stanisz58.put(11, "69");
        stanisz58.put(12, "120");
        stanisz58.put(13, "0");
        stanisz58.put(14, "1");

        return stanisz58;
    }  
    
    public TreeMap<Integer, String> Haywood11() {
        TreeMap<Integer, String> haywood11 = new TreeMap<>();
        haywood11.put(0, "11");
        haywood11.put(1, "Matthew Haywood");
        haywood11.put(2, "Glasgow Clan");
        haywood11.put(3, "FW");
        haywood11.put(4, "48");
        haywood11.put(5, "6");
        haywood11.put(6, "8");
        haywood11.put(7, "14");
        haywood11.put(8, "28");
        haywood11.put(9, "0");
        haywood11.put(10, "1");
        haywood11.put(11, "51");
        haywood11.put(12, "65");
        haywood11.put(13, "114");
        haywood11.put(14, "209");

        return haywood11;
    }
    
    public TreeMap<Integer, String> Tanski41() {
        TreeMap<Integer, String> tanski41 = new TreeMap<>();
        tanski41.put(0, "41");
        tanski41.put(1, "Scott Tanski");
        tanski41.put(2, "Glasgow Clan");
        tanski41.put(3, "FW");
        tanski41.put(4, "29");
        tanski41.put(5, "5");
        tanski41.put(6, "6");
        tanski41.put(7, "11");
        tanski41.put(8, "16");
        tanski41.put(9, "0");
        tanski41.put(10, "1");
        tanski41.put(11, "44");
        tanski41.put(12, "67");
        tanski41.put(13, "60");
        tanski41.put(14, "78");

        return tanski41;
    }  
    
    public TreeMap<Integer, String> Jonsson33() {
        TreeMap<Integer, String> jonsson33 = new TreeMap<>();
        jonsson33.put(0, "33");
        jonsson33.put(1, "Marcus Jonsson");
        jonsson33.put(2, "Glasgow Clan");
        jonsson33.put(3, "FW");
        jonsson33.put(4, "15");
        jonsson33.put(5, "3");
        jonsson33.put(6, "4");
        jonsson33.put(7, "7");
        jonsson33.put(8, "4");
        jonsson33.put(9, "0");
        jonsson33.put(10, "0");
        jonsson33.put(11, "24");
        jonsson33.put(12, "29");
        jonsson33.put(13, "5");
        jonsson33.put(14, "9");

        return jonsson33;
    } 
    
    public TreeMap<Integer, String> Howlett20() {
        TreeMap<Integer, String> howlett20 = new TreeMap<>();
        howlett20.put(0, "20");
        howlett20.put(1, "Mac Howlett");
        howlett20.put(2, "Glasgow Clan");
        howlett20.put(3, "FW");
        howlett20.put(4, "46");
        howlett20.put(5, "3");
        howlett20.put(6, "1");
        howlett20.put(7, "4");
        howlett20.put(8, "0");
        howlett20.put(9, "0");
        howlett20.put(10, "0");
        howlett20.put(11, "25");
        howlett20.put(12, "34");
        howlett20.put(13, "18");
        howlett20.put(14, "23");

        return howlett20;
    } 
    
    public TreeMap<Integer, String> Musil24() {
        TreeMap<Integer, String> musil24 = new TreeMap<>();
        musil24.put(0, "24");
        musil24.put(1, "Jack Musil");
        musil24.put(2, "Glasgow Clan");
        musil24.put(3, "FW");
        musil24.put(4, "25");
        musil24.put(5, "1");
        musil24.put(6, "3");
        musil24.put(7, "4");
        musil24.put(8, "6");
        musil24.put(9, "0");
        musil24.put(10, "0");
        musil24.put(11, "15");
        musil24.put(12, "24");
        musil24.put(13, "18");
        musil24.put(14, "24");

        return musil24;
    } 
    
    public TreeMap<Integer, String> Jacklin54() {
        TreeMap<Integer, String> jacklin54 = new TreeMap<>();
        jacklin54.put(0, "54");
        jacklin54.put(1, "Scott Jacklin");
        jacklin54.put(2, "Glasgow Clan");
        jacklin54.put(3, "FW");
        jacklin54.put(4, "11");
        jacklin54.put(5, "1");
        jacklin54.put(6, "2");
        jacklin54.put(7, "3");
        jacklin54.put(8, "8");
        jacklin54.put(9, "0");
        jacklin54.put(10, "0");
        jacklin54.put(11, "22");
        jacklin54.put(12, "31");
        jacklin54.put(13, "58");
        jacklin54.put(14, "51");

        return jacklin54;
    }
    
    public TreeMap<Integer, String> Moore29() {
        TreeMap<Integer, String> moore29 = new TreeMap<>();
        moore29.put(0, "29");
        moore29.put(1, "Craig Moore");
        moore29.put(2, "Glasgow Clan");
        moore29.put(3, "D ");
        moore29.put(4, "31");
        moore29.put(5, "1");
        moore29.put(6, "2");
        moore29.put(7, "3");
        moore29.put(8, "10");
        moore29.put(9, "0");
        moore29.put(10, "0");
        moore29.put(11, "15");
        moore29.put(12, "32");
        moore29.put(13, "0");
        moore29.put(14, "0");

        return moore29;
    }
    
    public TreeMap<Integer, String> Robertson22() {
        TreeMap<Integer, String> robertson22 = new TreeMap<>();
        robertson22.put(0, "22");
        robertson22.put(1, "Sean Robertson");
        robertson22.put(2, "Glasgow Clan");
        robertson22.put(3, "D ");
        robertson22.put(4, "9");
        robertson22.put(5, "0");
        robertson22.put(6, "3");
        robertson22.put(7, "3");
        robertson22.put(8, "0");
        robertson22.put(9, "0");
        robertson22.put(10, "0");
        robertson22.put(11, "6");
        robertson22.put(12, "8");
        robertson22.put(13, "0");
        robertson22.put(14, "0");

        return robertson22;
    }
    
    public TreeMap<Integer, String> Stenton10() {
        TreeMap<Integer, String> stenton10 = new TreeMap<>();
        stenton10.put(0, "10");
        stenton10.put(1, "Liam Stenton");
        stenton10.put(2, "Glasgow Clan");
        stenton10.put(3, "D ");
        stenton10.put(4, "10");
        stenton10.put(5, "0");
        stenton10.put(6, "2");
        stenton10.put(7, "2");
        stenton10.put(8, "0");
        stenton10.put(9, "0");
        stenton10.put(10, "0");
        stenton10.put(11, "1");
        stenton10.put(12, "2");
        stenton10.put(13, "0");
        stenton10.put(14, "0");

        return stenton10;
    }
    
    public TreeMap<Integer, String> Fitzgerald13() {
        TreeMap<Integer, String> fitzgerald13 = new TreeMap<>();
        fitzgerald13.put(0, "13");
        fitzgerald13.put(1, "Zack Fitzgerald");
        fitzgerald13.put(2, "Glasgow Clan");
        fitzgerald13.put(3, "D ");
        fitzgerald13.put(4, "4");
        fitzgerald13.put(5, "0");
        fitzgerald13.put(6, "0");
        fitzgerald13.put(7, "0");
        fitzgerald13.put(8, "0");
        fitzgerald13.put(9, "0");
        fitzgerald13.put(10, "0");
        fitzgerald13.put(11, "0");
        fitzgerald13.put(12, "1");
        fitzgerald13.put(13, "0");
        fitzgerald13.put(14, "0");

        return fitzgerald13;
    }
    
    public TreeMap<Integer, String> Henderson89() {
        TreeMap<Integer, String> henderson89 = new TreeMap<>();
        henderson89.put(0, "89");
        henderson89.put(1, "Scott Henderson");
        henderson89.put(2, "Glasgow Clan");
        henderson89.put(3, "FW");
        henderson89.put(4, "5");
        henderson89.put(5, "0");
        henderson89.put(6, "0");
        henderson89.put(7, "0");
        henderson89.put(8, "0");
        henderson89.put(9, "0");
        henderson89.put(10, "0");
        henderson89.put(11, "1");
        henderson89.put(12, "2");
        henderson89.put(13, "0");
        henderson89.put(14, "0");

        return henderson89;
    }
    
    public TreeMap<Integer, String> Smith19() {
        TreeMap<Integer, String> smith19 = new TreeMap<>();
        smith19.put(0, "19");
        smith19.put(1, "Chad Smith");
        smith19.put(2, "Glasgow Clan");
        smith19.put(3, "FW");
        smith19.put(4, "26");
        smith19.put(5, "0");
        smith19.put(6, "0");
        smith19.put(7, "0");
        smith19.put(8, "6");
        smith19.put(9, "0");
        smith19.put(10, "0");
        smith19.put(11, "6");
        smith19.put(12, "14");
        smith19.put(13, "0");
        smith19.put(14, "0");

        return smith19;
    }
    
    public TreeMap<Integer, String> Killeen32() {
        TreeMap<Integer, String> killeen32 = new TreeMap<>();
        killeen32.put(0, "32");
        killeen32.put(1, "Patrick Killeen");
        killeen32.put(2, "Glasgow Clan");
        killeen32.put(3, "GK");
        killeen32.put(4, "43");
        killeen32.put(5, "18");
        killeen32.put(6, "25");
        killeen32.put(7, "1");
        killeen32.put(8, "1377");
        killeen32.put(9, "152");
        killeen32.put(10, "2497");
        killeen32.put(11, "3.65");
        killeen32.put(12, "88.96");

        return killeen32;
    }   
    
    public TreeMap<Integer, String> McLaughlin88() {
        TreeMap<Integer, String> mcLaughlin88 = new TreeMap<>();
        mcLaughlin88.put(0, "32");
        mcLaughlin88.put(1, "Patrick Killeen");
        mcLaughlin88.put(2, "Glasgow Clan");
        mcLaughlin88.put(3, "GK");
        mcLaughlin88.put(4, "43");
        mcLaughlin88.put(5, "18");
        mcLaughlin88.put(6, "25");
        mcLaughlin88.put(7, "1");
        mcLaughlin88.put(8, "1377");
        mcLaughlin88.put(9, "152");
        mcLaughlin88.put(10, "2497");
        mcLaughlin88.put(11, "3.65");
        mcLaughlin88.put(12, "88.96");

        return mcLaughlin88;
    }
    // </editor-fold>
    
    // <editor-fold desc="create Sheffield players tree">
    public TreeMap<Integer, String> Connolly63() {
        TreeMap<Integer, String> connolly63 = new TreeMap<>();
        connolly63.put(0, "63");
        connolly63.put(1, "Brendan Connolly");
        connolly63.put(2, "Sheffield Steelers");
        connolly63.put(3, "FW");
        connolly63.put(4, "48");
        connolly63.put(5, "26");
        connolly63.put(6, "29");
        connolly63.put(7, "55");
        connolly63.put(8, "86");
        connolly63.put(9, "11");
        connolly63.put(10, "2");
        connolly63.put(11, "128");
        connolly63.put(12, "208");
        connolly63.put(13, "381");
        connolly63.put(14, "471");

        return connolly63;
    }
    
    public TreeMap<Integer, String> Vallerand88() {
        TreeMap<Integer, String> vallerand88 = new TreeMap<>();
        vallerand88.put(0, "88");
        vallerand88.put(1, "Marc-Olivier Vallerand");
        vallerand88.put(2, "Sheffield Steelers");
        vallerand88.put(3, "FW");
        vallerand88.put(4, "40");
        vallerand88.put(5, "26");
        vallerand88.put(6, "25");
        vallerand88.put(7, "51");
        vallerand88.put(8, "47");
        vallerand88.put(9, "11");
        vallerand88.put(10, "1");
        vallerand88.put(11, "158");
        vallerand88.put(12, "282");
        vallerand88.put(13, "1");
        vallerand88.put(14, "4");

        return vallerand88;
    }
    
    public TreeMap<Integer, String> DeLuca15() {
        TreeMap<Integer, String> deLuca15 = new TreeMap<>();
        deLuca15.put(0, "15");
        deLuca15.put(1, "Anthony DeLuca");
        deLuca15.put(2, "Sheffield Steelers");
        deLuca15.put(3, "FW");
        deLuca15.put(4, "42");
        deLuca15.put(5, "26");
        deLuca15.put(6, "21");
        deLuca15.put(7, "47");
        deLuca15.put(8, "61");
        deLuca15.put(9, "8");
        deLuca15.put(10, "0");
        deLuca15.put(11, "159");
        deLuca15.put(12, "252");
        deLuca15.put(13, "9");
        deLuca15.put(14, "8");

        return deLuca15;
    }    
    
    public TreeMap<Integer, String> Eberle10() {
        TreeMap<Integer, String> eberle10 = new TreeMap<>();
        eberle10.put(0, "10");
        eberle10.put(1, "Tanner Eberle");
        eberle10.put(2, "Sheffield Steelers");
        eberle10.put(3, "FW");
        eberle10.put(4, "49");
        eberle10.put(5, "21");
        eberle10.put(6, "23");
        eberle10.put(7, "44");
        eberle10.put(8, "58");
        eberle10.put(9, "5");
        eberle10.put(10, "1");
        eberle10.put(11, "138");
        eberle10.put(12, "217");
        eberle10.put(13, "164");
        eberle10.put(14, "238");

        return eberle10;
    }    
    
    public TreeMap<Integer, String> Lemtyugov52() {
        TreeMap<Integer, String> lemtyugov52 = new TreeMap<>();
        lemtyugov52.put(0, "52");
        lemtyugov52.put(1, "Nikolai Lemtyugov");
        lemtyugov52.put(2, "Sheffield Steelers");
        lemtyugov52.put(3, "FW");
        lemtyugov52.put(4, "49");
        lemtyugov52.put(5, "15");
        lemtyugov52.put(6, "27");
        lemtyugov52.put(7, "42");
        lemtyugov52.put(8, "56");
        lemtyugov52.put(9, "3");
        lemtyugov52.put(10, "0");
        lemtyugov52.put(11, "108");
        lemtyugov52.put(12, "197");
        lemtyugov52.put(13, "0");
        lemtyugov52.put(14, "4");

        return lemtyugov52;
    } 
    
    public TreeMap<Integer, String> Troncinsky8() {
        TreeMap<Integer, String> troncinsky8 = new TreeMap<>();
        troncinsky8.put(0, "8");
        troncinsky8.put(1, "Marek Troncinsky");
        troncinsky8.put(2, "Sheffield Steelers");
        troncinsky8.put(3, "D ");
        troncinsky8.put(4, "43");
        troncinsky8.put(5, "12");
        troncinsky8.put(6, "30");
        troncinsky8.put(7, "42");
        troncinsky8.put(8, "40");
        troncinsky8.put(9, "5");
        troncinsky8.put(10, "1");
        troncinsky8.put(11, "114");
        troncinsky8.put(12, "209");
        troncinsky8.put(13, "0");
        troncinsky8.put(14, "0");

        return troncinsky8;
    }
    
    public TreeMap<Integer, String> Armstrong90() {
        TreeMap<Integer, String> armstrong90 = new TreeMap<>();
        armstrong90.put(0, "90");
        armstrong90.put(1, "John Armstrong");
        armstrong90.put(2, "Sheffield Steelers");
        armstrong90.put(3, "C ");
        armstrong90.put(4, "45");
        armstrong90.put(5, "12");
        armstrong90.put(6, "28");
        armstrong90.put(7, "40");
        armstrong90.put(8, "28");
        armstrong90.put(9, "1");
        armstrong90.put(10, "1");
        armstrong90.put(11, "103");
        armstrong90.put(12, "173");
        armstrong90.put(13, "496");
        armstrong90.put(14, "418");

        return armstrong90;
    }
    
    public TreeMap<Integer, String> Davies19() {
        TreeMap<Integer, String> davies19 = new TreeMap<>();
        davies19.put(0, "19");
        davies19.put(1, "Michael Davies");
        davies19.put(2, "Sheffield Steelers");
        davies19.put(3, "FW");
        davies19.put(4, "41");
        davies19.put(5, "13");
        davies19.put(6, "26");
        davies19.put(7, "39");
        davies19.put(8, "28");
        davies19.put(9, "6");
        davies19.put(10, "0");
        davies19.put(11, "110");
        davies19.put(12, "170");
        davies19.put(13, "138");
        davies19.put(14, "245");

        return davies19;
    }
    
    public TreeMap<Integer, String> Brocklehurst2() {
        TreeMap<Integer, String> brocklehurst2 = new TreeMap<>();
        brocklehurst2.put(0, "2");
        brocklehurst2.put(1, "Aaron Brocklehurst");
        brocklehurst2.put(2, "Sheffield Steelers");
        brocklehurst2.put(3, "D ");
        brocklehurst2.put(4, "47");
        brocklehurst2.put(5, "2");
        brocklehurst2.put(6, "32");
        brocklehurst2.put(7, "34");
        brocklehurst2.put(8, "74");
        brocklehurst2.put(9, "0");
        brocklehurst2.put(10, "0");
        brocklehurst2.put(11, "75");
        brocklehurst2.put(12, "160");
        brocklehurst2.put(13, "0");
        brocklehurst2.put(14, "1");

        return brocklehurst2;
    }

    public TreeMap<Integer, String> OConnor81() {
        TreeMap<Integer, String> oConnor81 = new TreeMap<>();
        oConnor81.put(0, "81");
        oConnor81.put(1, "Ben O'Connor");
        oConnor81.put(2, "Sheffield Steelers");
        oConnor81.put(3, "D ");
        oConnor81.put(4, "44");
        oConnor81.put(5, "3");
        oConnor81.put(6, "29");
        oConnor81.put(7, "32");
        oConnor81.put(8, "43");
        oConnor81.put(9, "0");
        oConnor81.put(10, "0");
        oConnor81.put(11, "109");
        oConnor81.put(12, "198");
        oConnor81.put(13, "0");
        oConnor81.put(14, "0");

        return oConnor81;
    }    
    
    public TreeMap<Integer, String> Sandström28() {
        TreeMap<Integer, String> sandström28 = new TreeMap<>();
        sandström28.put(0, "28");
        sandström28.put(1, "Lucas Sandström");
        sandström28.put(2, "Sheffield Steelers");
        sandström28.put(3, "FW");
        sandström28.put(4, "44");
        sandström28.put(5, "12");
        sandström28.put(6, "19");
        sandström28.put(7, "31");
        sandström28.put(8, "23");
        sandström28.put(9, "2");
        sandström28.put(10, "0");
        sandström28.put(11, "74");
        sandström28.put(12, "108");
        sandström28.put(13, "2");
        sandström28.put(14, "2");

        return sandström28;
    } 
    
    public TreeMap<Integer, String> Dowd75() {
        TreeMap<Integer, String> dowd75 = new TreeMap<>();
        dowd75.put(0, "75");
        dowd75.put(1, "Robert Dowd");
        dowd75.put(2, "Sheffield Steelers");
        dowd75.put(3, "FW");
        dowd75.put(4, "24");
        dowd75.put(5, "13");
        dowd75.put(6, "11");
        dowd75.put(7, "24");
        dowd75.put(8, "23");
        dowd75.put(9, "3");
        dowd75.put(10, "0");
        dowd75.put(11, "85");
        dowd75.put(12, "122");
        dowd75.put(13, "2");
        dowd75.put(14, "3");

        return dowd75;
    }    
    
    public TreeMap<Integer, String> Meland14() {
        TreeMap<Integer, String> meland14 = new TreeMap<>();
        meland14.put(0, "14");
        meland14.put(1, "Eric Meland");
        meland14.put(2, "Sheffield Steelers");
        meland14.put(3, "FW");
        meland14.put(4, "35");
        meland14.put(5, "7");
        meland14.put(6, "11");
        meland14.put(7, "18");
        meland14.put(8, "12");
        meland14.put(9, "0");
        meland14.put(10, "2");
        meland14.put(11, "63");
        meland14.put(12, "108");
        meland14.put(13, "49");
        meland14.put(14, "66");

        return meland14;
    } 
    
    public TreeMap<Integer, String> Phillips20() {
        TreeMap<Integer, String> phillips20 = new TreeMap<>();
        phillips20.put(0, "20");
        phillips20.put(1, "Jonathan Phillips");
        phillips20.put(2, "Sheffield Steelers");
        phillips20.put(3, "FW");
        phillips20.put(4, "49");
        phillips20.put(5, "7");
        phillips20.put(6, "8");
        phillips20.put(7, "15");
        phillips20.put(8, "14");
        phillips20.put(9, "0");
        phillips20.put(10, "2");
        phillips20.put(11, "70");
        phillips20.put(12, "106");
        phillips20.put(13, "64");
        phillips20.put(14, "99");

        return phillips20;
    } 
    
    public TreeMap<Integer, String> Phillips13() {
        TreeMap<Integer, String> phillips13 = new TreeMap<>();
        phillips13.put(0, "13");
        phillips13.put(1, "David Phillips");
        phillips13.put(2, "Sheffield Steelers");
        phillips13.put(3, "D ");
        phillips13.put(4, "49");
        phillips13.put(5, "3");
        phillips13.put(6, "11");
        phillips13.put(7, "14");
        phillips13.put(8, "16");
        phillips13.put(9, "0");
        phillips13.put(10, "0");
        phillips13.put(11, "48");
        phillips13.put(12, "97");
        phillips13.put(13, "0");
        phillips13.put(14, "2");

        return phillips13;
    } 
    
    public TreeMap<Integer, String> Hrabal97() {
        TreeMap<Integer, String> hrabal97 = new TreeMap<>();
        hrabal97.put(0, "97");
        hrabal97.put(1, "Josef Hrabal");
        hrabal97.put(2, "Sheffield Steelers");
        hrabal97.put(3, "D ");
        hrabal97.put(4, "19");
        hrabal97.put(5, "3");
        hrabal97.put(6, "8");
        hrabal97.put(7, "11");
        hrabal97.put(8, "10");
        hrabal97.put(9, "0");
        hrabal97.put(10, "0");
        hrabal97.put(11, "11");
        hrabal97.put(12, "27");
        hrabal97.put(13, "0");
        hrabal97.put(14, "0");

        return hrabal97;
    } 
    
    public TreeMap<Integer, String> Bettauer42() {
        TreeMap<Integer, String> bettauer42 = new TreeMap<>();
        bettauer42.put(0, "42");
        bettauer42.put(1, "James Bettauer");
        bettauer42.put(2, "Sheffield Steelers");
        bettauer42.put(3, "D ");
        bettauer42.put(4, "27");
        bettauer42.put(5, "4");
        bettauer42.put(6, "3");
        bettauer42.put(7, "7");
        bettauer42.put(8, "12");
        bettauer42.put(9, "1");
        bettauer42.put(10, "0");
        bettauer42.put(11, "57");
        bettauer42.put(12, "90");
        bettauer42.put(13, "0");
        bettauer42.put(14, "0");

        return bettauer42;
    } 
    
    public TreeMap<Integer, String> Johnson53() {
        TreeMap<Integer, String> johnson53 = new TreeMap<>();
        johnson53.put(0, "53");
        johnson53.put(1, "Aaron Johnson");
        johnson53.put(2, "Sheffield Steelers");
        johnson53.put(3, "D ");
        johnson53.put(4, "17");
        johnson53.put(5, "1");
        johnson53.put(6, "5");
        johnson53.put(7, "6");
        johnson53.put(8, "20");
        johnson53.put(9, "0");
        johnson53.put(10, "0");
        johnson53.put(11, "17");
        johnson53.put(12, "37");
        johnson53.put(13, "0");
        johnson53.put(14, "0");

        return johnson53;
    } 
    
    public TreeMap<Integer, String> Kolehmainen55() {
        TreeMap<Integer, String> kolehmainen55 = new TreeMap<>();
        kolehmainen55.put(0, "55");
        kolehmainen55.put(1, "Janne Kolehmainen");
        kolehmainen55.put(2, "Sheffield Steelers");
        kolehmainen55.put(3, "FW");
        kolehmainen55.put(4, "23");
        kolehmainen55.put(5, "2");
        kolehmainen55.put(6, "1");
        kolehmainen55.put(7, "3");
        kolehmainen55.put(8, "10");
        kolehmainen55.put(9, "0");
        kolehmainen55.put(10, "0");
        kolehmainen55.put(11, "27");
        kolehmainen55.put(12, "52");
        kolehmainen55.put(13, "5");
        kolehmainen55.put(14, "8");

        return kolehmainen55;
    } 
    
    public TreeMap<Integer, String> Liwing23() {
        TreeMap<Integer, String> liwing23 = new TreeMap<>();
        liwing23.put(0, "23");
        liwing23.put(1, "Jonas Liwing");
        liwing23.put(2, "Sheffield Steelers");
        liwing23.put(3, "D ");
        liwing23.put(4, "17");
        liwing23.put(5, "1");
        liwing23.put(6, "2");
        liwing23.put(7, "3");
        liwing23.put(8, "2");
        liwing23.put(9, "0");
        liwing23.put(10, "0");
        liwing23.put(11, "10");
        liwing23.put(12, "13");
        liwing23.put(13, "0");
        liwing23.put(14, "0");

        return liwing23;
    } 
    
    public TreeMap<Integer, String> Kuukka91() {
        TreeMap<Integer, String> kuukka91 = new TreeMap<>();
        kuukka91.put(0, "9");
        kuukka91.put(1, "Mikko Kuukka");
        kuukka91.put(2, "Sheffield Steelers");
        kuukka91.put(3, "D ");
        kuukka91.put(4, "18");
        kuukka91.put(5, "0");
        kuukka91.put(6, "3");
        kuukka91.put(7, "3");
        kuukka91.put(8, "10");
        kuukka91.put(9, "0");
        kuukka91.put(10, "0");
        kuukka91.put(11, "9");
        kuukka91.put(12, "22");
        kuukka91.put(13, "0");
        kuukka91.put(14, "0");

        return kuukka91;
    }    
    
    public TreeMap<Integer, String> StPierre39() {
        TreeMap<Integer, String> stPierre39 = new TreeMap<>();
        stPierre39.put(0, "39");
        stPierre39.put(1, "Martin St. Pierre");
        stPierre39.put(2, "Sheffield Steelers");
        stPierre39.put(3, "FW");
        stPierre39.put(4, "5");
        stPierre39.put(5, "1");
        stPierre39.put(6, "2");
        stPierre39.put(7, "3");
        stPierre39.put(8, "4");
        stPierre39.put(9, "0");
        stPierre39.put(10, "0");
        stPierre39.put(11, "6");
        stPierre39.put(12, "10");
        stPierre39.put(13, "52");
        stPierre39.put(14, "30");

        return stPierre39;
    }
    
    public TreeMap<Integer, String> Graham21() {
        TreeMap<Integer, String> graham21 = new TreeMap<>();
        graham21.put(0, "21");
        graham21.put(1, "Alex Graham");
        graham21.put(2, "Sheffield Steelers");
        graham21.put(3, "FW");
        graham21.put(4, "8");
        graham21.put(5, "1");
        graham21.put(6, "0");
        graham21.put(7, "1");
        graham21.put(8, "0");
        graham21.put(9, "0");
        graham21.put(10, "0");
        graham21.put(11, "1");
        graham21.put(12, "4");
        graham21.put(13, "0");
        graham21.put(14, "0");

        return graham21;
    } 
    
    public TreeMap<Integer, String> Shudra27() {
        TreeMap<Integer, String> shudra27 = new TreeMap<>();
        shudra27.put(0, "27");
        shudra27.put(1, "Cole Shudra");
        shudra27.put(2, "Sheffield Steelers");
        shudra27.put(3, "FW");
        shudra27.put(4, "49");
        shudra27.put(5, "0");
        shudra27.put(6, "0");
        shudra27.put(7, "0");
        shudra27.put(8, "10");
        shudra27.put(9, "0");
        shudra27.put(10, "0");
        shudra27.put(11, "22");
        shudra27.put(12, "32");
        shudra27.put(13, "5");
        shudra27.put(14, "4");

        return shudra27;
    }
    
    public TreeMap<Integer, String> Brown12() {
        TreeMap<Integer, String> brown12 = new TreeMap<>();
        brown12.put(0, "12");
        brown12.put(1, "Kieran Brown");
        brown12.put(2, "Sheffield Steelers");
        brown12.put(3, "FW");
        brown12.put(4, "3");
        brown12.put(5, "0");
        brown12.put(6, "0");
        brown12.put(7, "0");
        brown12.put(8, "0");
        brown12.put(9, "0");
        brown12.put(10, "0");
        brown12.put(11, "0");
        brown12.put(12, "0");
        brown12.put(13, "0");
        brown12.put(14, "0");

        return brown12;
    }
    
    public TreeMap<Integer, String> Duba70() {
        TreeMap<Integer, String> duba70 = new TreeMap<>();
        duba70.put(0, "70");
        duba70.put(1, "Tomáš Duba");
        duba70.put(2, "Sheffield Steelers");
        duba70.put(3, "GK");
        duba70.put(4, "48");
        duba70.put(5, "31");
        duba70.put(6, "16");
        duba70.put(7, "2");
        duba70.put(8, "1464");
        duba70.put(9, "142");
        duba70.put(10, "2789");
        duba70.put(11, "3.05");
        duba70.put(12, "90.3");

        return duba70;
    } 
    
    public TreeMap<Integer, String> Kantor41() {
        TreeMap<Integer, String> kantor41 = new TreeMap<>();
        kantor41.put(0, "41");
        kantor41.put(1, "Pavel Kantor");
        kantor41.put(2, "Sheffield Steelers");
        kantor41.put(3, "GK");
        kantor41.put(4, "2");
        kantor41.put(5, "0");
        kantor41.put(6, "2");
        kantor41.put(7, "0");
        kantor41.put(8, "38");
        kantor41.put(9, "6");
        kantor41.put(10, "103");
        kantor41.put(11, "3.5");
        kantor41.put(12, "84.21");

        return kantor41;
    } 

    public TreeMap<Integer, String> Kerlin31() {
        TreeMap<Integer, String> kerlin31 = new TreeMap<>();
        kerlin31.put(0, "31");
        kerlin31.put(1, "William Kerlin");
        kerlin31.put(2, "Sheffield Steelers");
        kerlin31.put(3, "GK");
        kerlin31.put(4, "3");
        kerlin31.put(5, "0");
        kerlin31.put(6, "0");
        kerlin31.put(7, "0");
        kerlin31.put(8, "7");
        kerlin31.put(9, "2");
        kerlin31.put(10, "13");
        kerlin31.put(11, "9.23");
        kerlin31.put(12, "71.43");

        return kerlin31;
    }

    public TreeMap<Integer, String> Warburton34() {
        TreeMap<Integer, String> warburton34 = new TreeMap<>();
        warburton34.put(0, "34");
        warburton34.put(1, "Curtis Warburton");
        warburton34.put(2, "Sheffield Steelers");
        warburton34.put(3, "GK");
        warburton34.put(4, "1");
        warburton34.put(5, "0");
        warburton34.put(6, "0");
        warburton34.put(7, "0");
        warburton34.put(8, "0");
        warburton34.put(9, "0");
        warburton34.put(10, "2");
        warburton34.put(11, "2");
        warburton34.put(12, "2");

        return warburton34;
    }
    // </editor-fold>
}
