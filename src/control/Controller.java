package sample.src.control;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import sample.src.model.Game;

public class Controller {

    @FXML
    GridPane chessBoard;

    public void initialize(){

        // Themes are Coral, Dusk, Wheat, Marine, Emerald, Sandcastle

        Game game = new Game(chessBoard, "Coral");

    }
}
