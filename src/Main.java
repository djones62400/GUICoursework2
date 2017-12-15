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

        Scene mainMenu = MainMenu.createScene(stage);
        stage.setScene(mainMenu);
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}


