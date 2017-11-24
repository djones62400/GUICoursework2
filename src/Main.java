import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();

        root.getStylesheets().add("stylesheet.css");

        Scene scene = new Scene(root, 1280, 900);
        scene.getStylesheets().add("stylesheet.css");
        root.setId("root");
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.setResizable(false);

        Text pageTitle = new Text();
        pageTitle.setText("or");
        root.getChildren().add(pageTitle);
        pageTitle.setLayoutX(640);
        pageTitle.setLayoutY(450);
        Font.font(36);

        Button checkIn = new Button("Check in");
        checkIn.getStyleClass().add("button1");
        checkIn.setLayoutX(390);
        checkIn.setLayoutY(200);
        checkIn.setPrefWidth(500);
        checkIn.setPrefHeight(200);
        root.getChildren().add(checkIn);

        Button checkOut = new Button("Check Out");
        checkOut.getStyleClass().add("button2");
        checkOut.setLayoutX(390);
        checkOut.setLayoutY(500);
        checkOut.setPrefWidth(500);
        checkOut.setPrefHeight(200);
        root.getChildren().add(checkOut);

        checkOut.setOnAction((ActionEvent ae) -> doSomething(ae));
        //boolean add = root.getChildren().add(checkIn);
        stage.show();

    }

    private void doSomething(ActionEvent ae) {


    }

    public static void main(String[] args) {
        launch(args);
    }
}
