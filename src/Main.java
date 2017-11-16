import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();


        Scene scene = new Scene(root, 1280, 900);
        scene.getStylesheets().add("stylesheet.css");
        root.setId("root");
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.setResizable(false);

        Button checkIn = new Button("Check in");
        checkIn.getStyleClass().add("button");
        checkIn.setLayoutX(550);
        checkIn.setLayoutY(100);
        root.getChildren().add(checkIn);

        Button checkOut = new Button("Check Out");
        checkOut.getStyleClass().add("button");
        checkOut.setLayoutX(550);
        checkOut.setLayoutY(500);
        root.getChildren().add(checkOut);

        checkIn.setOnAction((ActionEvent ae) -> doSomething(ae));
        //boolean add = root.getChildren().add(checkIn);
        stage.show();

    }

    private void doSomething(ActionEvent ae) {


    }

    public static void main(String[] args) {
        launch(args);
    }
}
