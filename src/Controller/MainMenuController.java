package Controller;

import View.CheckPage;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {

    private Stage stage;

    public MainMenuController(Stage stage) {
        this.stage = stage;
    }

    public void openCheckPage() {
        Scene checkPage = CheckPage.createScene(stage);
        stage.setScene(checkPage);
    }
}