package sample.src.model;

import java.util.ArrayList;
import sample.src.model.Game;
import src.model.Player;
import src.model.Question;

public class SysData {

    private static SysData instance = null;
    private static final int HIGHSCORES_AMOUNT = 10;
    private ArrayList<Question> allQuestions  = new ArrayList<Question>();
    private ArrayList<Player> allGames  = new ArrayList<Player>();

    public static SysData getInstance() {
        if (instance == null)
        {
            instance = new SysData();
        }
        return instance;
    }

    public ArrayList<Question> getQuestions() {
        return this.allQuestions ;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.allQuestions.clear();
        this.allQuestions.addAll(questions);
    }

    public ArrayList<Player> getAllGames() {
        return this.allGames;
    }


    public void setAllGames(ArrayList<Player> scoreboard) {

        this.allGames.clear();
        this.allGames = scoreboard;
    }












}
