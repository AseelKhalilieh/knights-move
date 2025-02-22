package src.control;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class HomepageController {

    @FXML
    private Button newGame;
    @FXML
    private Button manageQuestions;

    @FXML
    void openLoginPage(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/src/view/login.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            //Switch to the game scene
            Stage stage = (Stage) manageQuestions.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Chess");
            stage.show();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @FXML
    void startGame(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/src/view/sample.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            //Switch to the game scene
            Stage stage = (Stage) newGame.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Chess");
            stage.show();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }



}