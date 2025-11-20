package Calculator_Layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class RunApp extends Application {

  @Override
  public void start(Stage primaryStage) throws IOException {
    // Load the FXML file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorView.fxml"));

    // Create the scene
    Scene scene = new Scene(loader.load(), 400, 450);

    // Set up the stage
    primaryStage.setTitle("Calculator");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}

