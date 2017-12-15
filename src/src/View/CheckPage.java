package View;
import Controller.CheckPageController;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckPage {
    public static Scene createScene(Stage stage){
        CheckPageController cpc = new CheckPageController(stage);
        Pane root = new Pane();

        root.getStylesheets().add("stylesheet.css");

        Scene scene = new Scene(root, 1280, 900);
        scene.getStylesheets().add("stylesheet.css");
        root.setId("root");

        Text pageOr = new Text();
        pageOr.setText("or");
        root.getChildren().add(pageOr);
        pageOr.setLayoutX(640);
        pageOr.setLayoutY(450);
        pageOr.setStyle("-fx-font: 32 arial;");

        Text pageTitle = new Text();
        pageTitle.setText("Choose an Option:");
        root.getChildren().add(pageTitle);
        pageTitle.setLayoutX(525);
        pageTitle.setLayoutY(125);
        pageTitle.setStyle("-fx-font: 32 arial;");

        Line line1 = new Line(0, 50, 1290, 50);
        root.getChildren().add(line1);

        Line line2 = new Line(0, 850, 1290, 850);
        root.getChildren().add(line2);

        Button checkIn = new Button("Check in");
        checkIn.getStyleClass().add("button1");
        checkIn.setLayoutX(390);
        checkIn.setLayoutY(200);
        checkIn.setPrefWidth(500);
        checkIn.setPrefHeight(200);
        checkIn.setOnAction((ActionEvent ae) -> cpc.openCheckIn());
        root.getChildren().add(checkIn);

        Button checkOut = new Button("Check Out");
        checkOut.getStyleClass().add("button1");
        checkOut.setLayoutX(390);
        checkOut.setLayoutY(500);
        checkOut.setPrefWidth(500);
        checkOut.setPrefHeight(200);
        root.getChildren().add(checkOut);
        checkOut.setOnAction((ActionEvent ae) -> cpc.openCheckOut());

        return scene;

    }

}

