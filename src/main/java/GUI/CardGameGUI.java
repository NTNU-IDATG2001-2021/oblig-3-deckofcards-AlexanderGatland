package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

/**
 * The type Card game gui.
 */
public class CardGameGUI extends Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();

        String fxmlPath = "src/main/resources/CardGameGUI.fxml";

        FileInputStream inputStream = new FileInputStream(fxmlPath);

        BorderPane root = fxmlLoader.load(inputStream);

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setTitle("Card Game");

        stage.show();
    }
}
