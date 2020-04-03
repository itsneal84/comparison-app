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
    Player Pufahl44 = new Player(44, "Matt Pufahl", "Glasgow Clan", "D", 47, 6, 20, 26, 34, 0, 0, 88, 156, 1, 0);
    Player Roy15 = new Player(15, "Mathieu Roy", "Glasgow Clan", "FW", 35, 14, 10, 24, 16, 5, 1, 87, 149, 18, 19);
    Player Ehrhardt2 = new Player(2, "Travis Ehrhardt", "Glasgow Clan", "D", 44, 6, 18, 24, 42, 1, 0, 138, 231, 0, 0);
    Player Lidhammar21 = new Player(21, "Mikael Lidhammar", "Glasgow Clan", "FW", 45, 5, 18, 23, 54, 0, 0, 72, 113, 10, 17);
    Player Heywood17 = new Player(17, "Jordan Heywood", "Glasgow Clan", "D", 35, 6, 14, 20, 26, 1, 0, 66, 123, 0, 0);
    Player Peacock71 = new Player(71, "Craig Peacock", "Glasgow Clan", "FW", 44, 7, 12, 19, 31, 5, 0, 72, 116, 412, 289);
    Player Springer27 = new Player(27, "Linden Springer", "Glasgow Clan", "D", 47, 5, 12, 17, 101, 0, 0, 64, 116, 0, 0);
    Player Stanisz58 = new Player(58, "Matt Stanisz", "Glasgow Clan", "D", 40, 2, 14, 16, 45, 1, 0, 69, 120, 0, 1);
    Player Haywood11 = new Player(11, "Matthew Haywood", "Glasgow Clan", "FW", 48, 6, 8, 14, 28, 0, 1, 51, 65, 114, 209);
    Player Tanski41 = new Player(41, "Scott Tanski", "Glasgow Clan", "FW", 29, 5, 6, 11, 16, 0, 1, 44, 67, 60, 78);
    Player Jonsson33 = new Player(33, "Marcus Jonsson", "Glasgow Clan", "FW", 15, 3, 4, 7, 4, 0, 0, 24, 29, 5, 9);
    Player Howlett20 = new Player(20, "Mac Howlett", "Glasgow Clan", "FW", 46, 3, 1, 4, 0 ,0, 0, 25, 34, 18, 23);
    Player Musil24 = new Player(24, "Jack Musil", "Glasgow Clan", "FW", 25, 1, 3, 4, 6, 0, 0, 15, 24, 18, 24);
    Player Jacklin54 = new Player(54, "Scott Jacklin", "Glasgow Clan", "FW", 11, 1, 2, 3, 8, 0, 0, 22, 31, 58, 51);
    Player Moore29 = new Player(29, "Craig Moore", "Glasgow Clan", "D", 31, 1, 2, 3, 10, 0, 0, 15, 32, 0, 0);
    Player Robertson22 = new Player(22, "Sean Robertson", "Glasgow Clan", "D", 9, 0, 3, 3, 0, 0, 0, 6, 8, 0, 0);
    Player Stenton10 = new Player(10, "Liam Stenton", "Glasgow Clan", "D", 10, 0, 2, 2, 0, 0, 0, 1, 3, 0, 0);
    Player Fitzgerald13 = new Player(13, "Zack Fitzgerald", "Glasgow Clan", "D", 4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0);
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
    Player Troncinsky8 = new Player(8, "Marek Troncinsky", "Sheffield Steelers", "D", 43, 12, 30, 42, 40, 5, 1, 114, 209, 0, 0);
    Player Armstrong90 = new Player(90, "John Armstrong", "Sheffield Steelers", "C", 45, 12, 28, 40, 28, 1, 1, 103, 173, 496, 418);
    Player Davies19 = new Player(19, "Michael Davies", "Sheffield Steelers", "FW", 41, 13, 26, 39, 28, 6, 0, 110, 170, 138, 245);
    Player Brocklehurst2 = new Player(2, "Aaron Brocklehurst", "Sheffield Steelers", "D", 47, 2, 32, 34, 74, 0, 0, 75, 160, 0, 1);
    Player OConnor81 = new Player(81, "Ben O'Connor", "Sheffield Steelers", "D", 44, 3, 29, 32, 43, 0, 0, 109, 198, 0, 0);
    Player Sandström28 = new Player(28, "Lucas Sandström", "Sheffield Steelers", "FW", 44, 12, 19, 31, 23, 2, 0, 74, 108, 2, 2);
    Player Dowd75 = new Player(75, "Robert Dowd", "Sheffield Steelers", "FW", 24, 13, 11, 24, 23, 3, 0, 85, 122, 2, 3);
    Player Meland14 = new Player(14, "Eric Meland", "Sheffield Steelers", "FW", 35, 7, 11, 18, 12, 0, 2, 63, 108, 49, 66);
    Player Phillips20 = new Player(20, "Jonathan Phillips", "Sheffield Steelers", "FW", 49, 7, 8, 15, 14, 0, 2, 70, 106, 64, 99);
    Player Phillips13 = new Player(13, "David Phillips", "Sheffield Steelers", "D", 49, 3, 11, 14, 16, 0, 0, 48, 97, 0, 2);
    Player Hrabal97 = new Player(97, "Josef Hrabal", "Sheffield Steelers", "D", 19, 3, 8, 11, 10, 0, 0, 11, 27, 0, 0);
    Player Bettauer42 = new Player(42, "James Bettauer", "Sheffield Steelers", "D", 27, 4, 3, 7, 12, 1, 0, 57, 90, 0, 0);
    Player Johnson53 = new Player(53, "Aaron Johnson", "Sheffield Steelers", "D", 17, 1, 5, 6, 20, 0, 0, 17, 37, 0, 0);
    Player Kolehmainen55 = new Player(55, "Janne Kolehmainen", "Sheffield Steelers", "FW", 23, 2, 1, 3, 10, 0, 0, 27, 52, 5, 8);
    Player Liwing23 = new Player(23, "Jonas Liwing", "Sheffield Steelers", "D", 17, 1, 2, 3, 2, 0, 0, 10, 13, 0, 0);
    Player Kuukka91 = new Player(91, "Mikko Kuukka", "Sheffield Steelers", "D", 18, 0, 3, 3, 10, 0, 0, 9, 22, 0, 0);
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

    public static void HashMap(){
        HashMap<Integer, String> playerMap = new HashMap<>();
        // <editor-fold desc="add all players to hashtable">
        playerMap.put(1, "LaPorte16");
        playerMap.put(2, "Bjerrum16");
        playerMap.put(3, "Rau5");
        playerMap.put(4, "Pitt61");
        playerMap.put(5, "Beca26");
        playerMap.put(6, "Pufahl44");
        playerMap.put(7, "Roy15");
        playerMap.put(8 ,"Ehrhardt2");
        playerMap.put(9, "Lidhammar21");
        playerMap.put(10, "Heywood17");
        playerMap.put(11, "Peacock71");
        playerMap.put(12, "Springer27");
        playerMap.put(13, "Stanisz58");
        playerMap.put(14, "Haywood11");
        playerMap.put(15, "Tanski41");
        playerMap.put(16, "Jonsson33");
        playerMap.put(17, "Howlett20");
        playerMap.put(18, "Musil24");
        playerMap.put(19, "Jacklin54");
        playerMap.put(20, "Moore29");
        playerMap.put(21, "Robertson22");
        playerMap.put(22, "Stenton10");
        playerMap.put(23, "Fitzgerald13");
        playerMap.put(24, "Henderson89");
        playerMap.put(25, "(Smith19");
        playerMap.put(26, "Killeen32");
        playerMap.put(27, "McLaughlin88");
        
        playerMap.put(28, "Connolly63");
        playerMap.put(29, "Vallerand88");
        playerMap.put(31, "DeLuca15");
        playerMap.put(32, "Eberle10");
        playerMap.put(33, "Lemtyugov52");
        playerMap.put(34, "Troncinsky8");
        playerMap.put(35, "Armstrong90");
        playerMap.put(36, "Davies19");
        playerMap.put(37, "Brocklehurst2");
        playerMap.put(38, "OConnor81");
        playerMap.put(39, "Sandström28");
        playerMap.put(40, "Dowd75");
        playerMap.put(41, "Meland14");
        playerMap.put(42, "Phillips20");
        playerMap.put(43, "Phillips13");
        playerMap.put(44, "Hrabal97");
        playerMap.put(45, "Bettauer42");
        playerMap.put(46, "Johnson53");
        playerMap.put(47, "Kolehmainen55");
        playerMap.put(48, "Liwing23");
        playerMap.put(49, "Kuukka91");
        playerMap.put(50, "StPierre39");
        playerMap.put(51, "Graham21");
        playerMap.put(52, "Shudra27");
        playerMap.put(53, "Brown12");
        playerMap.put(54, "Duba70");
        playerMap.put(55, "Kantor41");
        playerMap.put(56, "Kerlin31");
        playerMap.put(57, "Warburton34");
        // </editor-fold>
    }    
}
