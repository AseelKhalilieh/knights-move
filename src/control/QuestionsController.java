package src.control;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.stage.Stage;

public class QuestionsController {

    @FXML
    private Button backBtn;

    @FXML
    private Button editQuestion;

    @FXML
    private Button deleteQuestion;

    @FXML
    private Button newQuestion;

    @FXML
    void deleteQuestion(ActionEvent event) {

    }

    @FXML
    void editQuestion(ActionEvent event) {

    }

    @FXML
    void goBack(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/login.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            //Switch to the game scene
            Stage stage = (Stage) backBtn.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Chess");
            stage.show();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @FXML
    void newQuestion(ActionEvent event) {

    }

}
