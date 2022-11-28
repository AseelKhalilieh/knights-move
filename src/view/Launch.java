package sample.src.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.src.control.HomepageController;

public class Launch extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        mainWindow(primaryStage);
    }

    public void mainWindow (Stage primaryStage){
        stage = primaryStage;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
