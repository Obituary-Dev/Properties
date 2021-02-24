package properties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Properties");

        Person bucky = new Person();

        bucky.firstNameProperty().addListener((v, oldValue, newValue) -> {
            System.out.println("Name changed to: "+ newValue);
            // not to do: security location 
            System.out.println("firstNameProperty(): " + bucky.firstNameProperty());
            System.out.println("getFirstName(): "+ bucky.getFirstName());

        });

        button = new Button("Submit");
        button.setOnAction(e -> bucky.setFirstName("Porky"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

}
