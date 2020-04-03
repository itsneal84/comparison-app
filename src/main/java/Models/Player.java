package Models;

/**
 *
 * @author Neal Nisbet B00380762
 */
public class Player {
    // <editor-fold desc="private attributes">
    private int number;
    private String playerName;
    private String teamName;
    private String position;
    private int gamesPlayed;
    private int goals;
    private int assists;
    private int points;
    private int penaltyMinutes;
    private int powerPlayGoals;
    private int shorthandedGoals;
    private int shotsOnGoal;
    private int totalShots;
    private int faceoffWins;
    private int faceoffLost;

    //goalie only attributes
    private int wins;
    private int loses;
    private int shutouts;
    private int shotsAgainst;
    private int goalsAgainst;
    private int minutesPlayed;
    private double avgGoalsAgainst;
    private double savePct;
    // </editor-fold>

    // <editor-fold desc="getter and setter methods">
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGoals() {
        return goals;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }
    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    public int getPenaltyMinutes() {
        return penaltyMinutes;
    }
    public void setPenaltyMinutes(int penaltyMinutes) {
        this.penaltyMinutes = penaltyMinutes;
    }

    public int getPowerPlayGoals() {
        return powerPlayGoals;
    }
    public void setPowerPlayGoals(int powerPlayGoals) {
        this.powerPlayGoals = powerPlayGoals;
    }
    
    public int getShorthandedGoals() {
        return shorthandedGoals;
    }
    public void setShorthandedGoals(int shorthandedGoals) {
        this.shorthandedGoals = shorthandedGoals;
    }

    public int getShotsOnGoal() {
        return shotsOnGoal;
    }
    public void setShotsOnGoal(int shotsOnGoal) {
        this.shotsOnGoal = shotsOnGoal;
    }

    public int getTotalShots() {
        return totalShots;
    }
    public void setTotalShots(int totalShots) {
        this.totalShots = totalShots;
    }

    public int getFaceoffWins() {
        return faceoffWins;
    }
    public void setFaceoffWins(int faceoffWins) {
        this.faceoffWins = faceoffWins;
    }

    public int getFaceoffLost() {
        return faceoffLost;
    }
    public void setFaceoffLost(int faceoffLost) {
        this.faceoffLost = faceoffLost;
    }

    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }
    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getShutouts() {
        return shutouts;
    }
    public void setShutouts(int shutouts) {
        this.shutouts = shutouts;
    }

    public int getShotsAgainst() {
        return shotsAgainst;
    }
    public void setShotsAgainst(int shotsAgainst) {
        this.shotsAgainst = shotsAgainst;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }
    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }
    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public double getAvgGoalsAgainst() {
        return avgGoalsAgainst;
    }
    public void setAvgGoalsAgainst(double avgGoalsAgainst) {
        this.avgGoalsAgainst = avgGoalsAgainst;
    }

    public double getSavePct() {
        return savePct;
    }
    public void setSavePct(double savePct) {
        this.savePct = savePct;
    }
    // </editor-fold>
    
    //normal player contructor
    public Player(int numberIn, String playerNameIn, String teamNameIn, String positionIn, int gamesPlayedIn, int goalsIn, int assistsIn, int pointsIn,
            int penaltyMinutesIn, int powerPlayGoalsIn, int shorthandedGoalsIn, int shotsOnGoalIn, int totalShotsIn, int faceoffWinsIn, int faceoffLostIn) {
        number = numberIn;
        playerName = playerNameIn;
        teamName = teamNameIn;
        position = positionIn;
        gamesPlayed = gamesPlayedIn;
        goals = goalsIn;
        assists = assistsIn;
        points = pointsIn;
        penaltyMinutes = penaltyMinutesIn;
        powerPlayGoals = powerPlayGoalsIn;
        shorthandedGoals = shorthandedGoalsIn;
        shotsOnGoal = shorthandedGoalsIn;
        totalShots = totalShotsIn;
        faceoffWins = faceoffWinsIn;
        faceoffLost = faceoffLostIn;
    }
    
    //goalie constructor
    public Player(int numberIn, String playerNameIn, String teamNameIn, String positionIn, int gamesPlayedIn, int winsIn, int losesIn, int shutoutsIn,
            int shotsAgainstIn, int goalsAgainstIn, int minutesPlayedIn, double avgGoalsAgainstIn, double savePctIn) {
        number = numberIn;
        playerName = playerNameIn;
        teamName = teamNameIn;
        position = positionIn;
        gamesPlayed = gamesPlayedIn;
        wins = winsIn;
        loses = losesIn;
        shutouts = shutoutsIn;
        shotsAgainst = shotsAgainstIn;
        goalsAgainst = goalsAgainstIn;
        minutesPlayed = minutesPlayedIn;
        avgGoalsAgainst = avgGoalsAgainstIn;
        savePct = savePctIn;
    }
}
