package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NotebookApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/notebook_view.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Notebook App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
