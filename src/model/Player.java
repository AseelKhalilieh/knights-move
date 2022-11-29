package src.model;


public class Player extends Account{

    private int totalGamesPlayed;
    private int highestScore;

    public Player(int id, String nickname) {
        super(id, nickname);
    }

    public Player(int id, String nickname, int totalGamesPlayed, int highestScore) {
        super(id, nickname);
        this.totalGamesPlayed = totalGamesPlayed;
        this.highestScore = highestScore;
    }

    public int getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public void setTotalGamesPlayed(int totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }


}
