import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LabelChangeExample extends Application
{

  @Override
  public void start(Stage primaryStage) {
    Label label = new Label("Hello, World");

    Button moonButton = new Button("Set Moon");
    moonButton.setOnAction(_-> label.setText("Hello, Moon!"));

    Button sunButton = new Button("Set Sun");
    sunButton.setOnAction(_ -> label.setText("Hello, Sun"));

    VBox root = new VBox(10, label, moonButton, sunButton);
    Scene scene = new Scene(root, 300, 200);

    primaryStage.setTitle("Label Change Example");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
