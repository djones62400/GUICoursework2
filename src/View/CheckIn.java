package View;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckIn {
    public static Scene createScene(Stage stage){
        Pane root = new Pane();
        Scene checkInScene = new Scene(root, 1280, 900);

        root.getStylesheets().add("stylesheet.css");

        Line line1 = new Line(0, 50, 1290, 50);
        root.getChildren().add(line1);

        Line line2 = new Line(0, 850, 1290, 850);
        root.getChildren().add(line2);

        Text pageTitle = new Text();
        pageTitle.setText("Check in previous items:");
        root.getChildren().add(pageTitle);
        pageTitle.setLayoutX(525);
        pageTitle.setLayoutY(125);
        pageTitle.setStyle("-fx-font: 32 arial;");

        return checkInScene;
    }
}
//hello
//hello2