public class Game {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    public Game(String homeTeam, String awayTeam, int homeScore, int awayScore){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String getHometeam(){
        return this.homeTeam;
    }

    public String getAwayteam(){
        return this.awayTeam;
    }

    public boolean isWinner(String teamname){
        if(this.homeTeam == teamname && this.homeScore > this.awayScore){
            return true;
        }else if(this.awayTeam == teamname && this.awayScore > this.homeScore){
            return true;
        }else{
            return false;
        }
    }
}
