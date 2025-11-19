import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstTextField extends Application

{

  @Override public void start(Stage primaryStage)
  {
    TextField textField = new TextField();
    Label output = new Label();
    Button button = new Button("Transfer to label");
    button.setOnAction(e -> {
      String oldContent = output.getText() + "\n" + textField.getText();
      output.setText(oldContent);
      String text = textField.getText();
      textField.setText("");
      System.out.println(text);
    });

    // LIVE LABEL FROM TEXTFIELD
    TextField textField2 = new TextField();
    Label label = new Label("Your text will appear here");
    textField2.setOnKeyReleased(e -> {
      label.setText(textField2.getText());
    });

    VBox box = new VBox(14, textField, textField2, button, output, label);
    Scene scene = new Scene(box);
    primaryStage.setTitle("Text Field Examples");
    primaryStage.setScene(scene);
    primaryStage.setHeight(600);
    primaryStage.setWidth(900);
    primaryStage.show();

  }
}
