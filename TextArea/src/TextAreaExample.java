import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextAreaExample extends Application
{
  @Override public void start(Stage primaryStage) {

    TextArea textArea = new TextArea();
    textArea.setWrapText(true);
    textArea.setPrefRowCount(10);
    textArea.setPrefColumnCount(30);

    TextField textField = new TextField();
    textField.setPromptText("Enter text to append...");


    Button appendButton = new Button("Append");
    appendButton.setOnAction(e -> {
      String text = textField.getText();
      if(!text.isEmpty()){
          textArea.appendText(text + "\n");
          textField.clear();
      }
    });

    Button printButton = new Button("Print Text to Console");
      printButton.setOnAction(event -> {
      String text = textArea.getText();
        System.out.println(text);
      textArea.clear();
      });



    VBox root = new VBox(10, textField, appendButton, textArea, printButton);
    Scene scene = new Scene(root, 900, 600);

    primaryStage.setTitle("TextArea Example");
    primaryStage.setScene(scene);
    primaryStage.show();

  }
}
