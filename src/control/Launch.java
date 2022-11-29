package src.control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launch extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        mainWindow(primaryStage);
    }

    public void mainWindow (Stage primaryStage){
        stage = primaryStage;
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/src/view/homepage.fxml"));

            Parent root1 = (Parent) fxmlLoader.load();
            Scene scene = new Scene(root1);
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
