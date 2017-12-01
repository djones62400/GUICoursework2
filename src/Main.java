import View.CheckPage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Inventory Application Program");
        stage.setResizable(false);

        Scene checkPage = CheckPage.createScene(stage);
        stage.setScene(checkPage);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}


