package Models;

/**
 *
 * @author Neal Nisbet B00380762
 */
public class Team {
    //private attributes
    private String teamName;
    private int gamesPlayed;
    private int wins;
    private int losses;
    private int overtimeWins;
    private int overtimeLosses;
    private double winPct;
    private int points;
    private int goalsScored;
    private int goalsAgainst;
    private double avgGoalsFor;
    private double avgGoalsAgainst;
    private double avgAttendance;
    private int shotsOnGoalFor;
    private int shotsOnGoalAgainst;
    private double faceoffWinPct;
    private double faceoffWinTotal;
    private double powerplayPct;
    private int powerplayTotal;
    private double penaltyKillsPct;
    private int penaltyKillsTotal;
    
    // <editor-fold desc="getter and setter methods">
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }
    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getOvertimeWins() {
        return overtimeWins;
    }
    public void setOvertimeWins(int overtimeWins) {
        this.overtimeWins = overtimeWins;
    }

    public int getOvertimeLosses() {
        return overtimeLosses;
    }
    public void setOvertimeLosses(int overtimeLosses) {
        this.overtimeLosses = overtimeLosses;
    }

    public double getWinPct() {
        return winPct;
    }
    public void setWinPct(double winPct) {
        this.winPct = winPct;
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoalsScored() {
        return goalsScored;
    }
    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }
    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public double getAvgGoalsFor() {
        return avgGoalsFor;
    }
    public void setAvgGoalsFor(double avgGoalsFor) {
        this.avgGoalsFor = avgGoalsFor;
    }

    public double getAvgGoalsAgainst() {
        return avgGoalsAgainst;
    }
    public void setAvgGoalsAgainst(double avgGoalsAgainst) {
        this.avgGoalsAgainst = avgGoalsAgainst;
    }

    public double getAvgAttendance() {
        return avgAttendance;
    }
    public void setAvgAttendance(double avgAttendance) {
        this.avgAttendance = avgAttendance;
    }

    public int getShotsOnGoalFor() {
        return shotsOnGoalFor;
    }
    public void setShotsOnGoalFor(int shotsOnGoalFor) {
        this.shotsOnGoalFor = shotsOnGoalFor;
    }

    public int getShotsOnGoalAgainst() {
        return shotsOnGoalAgainst;
    }
    public void setShotsOnGoalAgainst(int shotsOnGoalAgainst) {
        this.shotsOnGoalAgainst = shotsOnGoalAgainst;
    }

    public double getFaceoffWinPct() {
        return faceoffWinPct;
    }
    public void setFaceoffWinPct(double faceoffWinPct) {
        this.faceoffWinPct = faceoffWinPct;
    }

    public double getFaceoffWinTotal() {
        return faceoffWinTotal;
    }
    public void setFaceoffWinTotal(double faceoffWinTotal) {
        this.faceoffWinTotal = faceoffWinTotal;
    }

    public double getPowerplayPct() {
        return powerplayPct;
    }
    public void setPowerplayPct(double powerplayPct) {
        this.powerplayPct = powerplayPct;
    }

    public int getPowerplayTotal() {
        return powerplayTotal;
    }
    public void setPowerplayTotal(int powerplayTotal) {
        this.powerplayTotal = powerplayTotal;
    }

    public double getPenaltyKillsPct() {
        return penaltyKillsPct;
    }
    public void setPenaltyKillsPct(double penaltyKillsPct) {
        this.penaltyKillsPct = penaltyKillsPct;
    }

    public int getPenaltyKillsTotal() {
        return penaltyKillsTotal;
    }
    public void setPenaltyKillsTotal(int penaltyKillsTotal) {
        this.penaltyKillsTotal = penaltyKillsTotal;
    }
    // </editor-fold>
    
    //constructor
    public Team(String teamNameIn, int gamesPlayedIn, int winsIn, int lossesIn, int overtimeWinsIn, int overtimeLossesIn, double winPctIn, int pointsIn,
            int goalsScoredIn, int goalsAgainstIn, double avgGoalsForIn, double avgGoalsAgainstIn, double avgAttendanceIn, int shotsOnGoalForIn,
            int shotsOnGoalAgainstIn, double faceoffWinPctIn, double faceoffWinTotalIn, double powerplayPctIn, int powerplayTotalIn, double penaltyKillsPctIn, int penaltyKillsTotalIn) {
        teamName = teamNameIn;
        gamesPlayed = gamesPlayedIn;
        wins = winsIn;
        losses = lossesIn;
        overtimeWins = overtimeWinsIn;
        overtimeLosses = overtimeLossesIn;
        winPct = winPctIn;
        points = pointsIn;
        goalsScored = goalsScoredIn;
        goalsAgainst = goalsAgainstIn;
        avgGoalsFor = avgGoalsForIn;
        avgGoalsAgainst = avgGoalsAgainstIn;
        avgAttendance = avgAttendanceIn;
        shotsOnGoalFor = shotsOnGoalForIn;
        shotsOnGoalAgainst = shotsOnGoalAgainstIn;
        faceoffWinPct = faceoffWinPctIn;
        faceoffWinTotal = faceoffWinTotalIn;
        powerplayPct = powerplayPctIn;
        powerplayTotal = powerplayTotalIn;
        penaltyKillsPct = penaltyKillsPctIn;
        penaltyKillsTotal = penaltyKillsTotalIn;
    }
}
