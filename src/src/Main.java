import View.CheckPage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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


