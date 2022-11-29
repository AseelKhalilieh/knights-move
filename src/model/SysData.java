package sample.src.model;

import java.util.ArrayList;
import sample.src.model.Question;
import sample.src.model.Game;

public class SysData {

    private static SysData instance = null;
    private static final int HIGHSCORES_AMOUNT = 10;
    private ArrayList<Question> questions = new ArrayList<Question>();
    private ArrayList<Game> scoreboard = new ArrayList<Game>();

    public static SysData getInstance() {
        if (instance == null)
        {
            instance = new SysData();
        }
        return instance;
    }





}
