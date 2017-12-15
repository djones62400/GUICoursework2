package Controller;

import View.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckPageController {

    private Stage stage;

    public CheckPageController(Stage stage) {
        this.stage = stage;
    }

    public void openCheckIn() {
        Scene checkIn = CheckIn.createScene(stage);
        stage.setScene(checkIn);
    }
    public void openCheckOut() {
        Scene checkOut = CheckOut.createScene(stage);
        stage.setScene(checkOut);
    }
}
