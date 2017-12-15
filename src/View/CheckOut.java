package View;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckOut {
    public static Scene createScene(Stage stage) {
        Pane root = new Pane();
        Scene checkOutScene = new Scene(root, 1280, 900);

        root.getStylesheets().add("stylesheet.css");

        Line line1 = new Line(0, 50, 1290, 50);
        root.getChildren().add(line1);

        Line line2 = new Line(0, 850, 1290, 850);
        root.getChildren().add(line2);

        Text pageTitle = new Text();
        pageTitle.setText("Select equipment to check out:");
        root.getChildren().add(pageTitle);
        pageTitle.setLayoutX(525);
        pageTitle.setLayoutY(125);
        pageTitle.setStyle("-fx-font: 32 arial;");

        return checkOutScene;
    }
}