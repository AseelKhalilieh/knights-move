package sample.src.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.src.model.Game;

public class Controller {



    public void initialize(){
        // Themes are Coral, Dusk, Wheat, Marine, Emerald, Sandcastle
        Game game = new Game(chessBoard, "Coral");
    }
    @FXML
    private GridPane chessBoard;

    @FXML
    private Button backBtn;

    @FXML
    void goBack(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/homepage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Chess");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
