import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxExample extends Application
{

  @Override public void start(Stage primaryStage){
    CheckBox checkBox = new CheckBox("Pick me!");
    checkBox.setAllowIndeterminate(true);

    Button button = new Button("Print State");
    button.setOnAction(_ -> {
    if(checkBox.isIndeterminate()){
      System.out.println("Indeterminate");
    }
    else if (checkBox.isSelected()){
      System.out.println("Selected");
    }else{
      System.out.println("Unselected");
    }
  });

    CheckBox checkBox1 = new CheckBox("Enable notifications");

    checkBox1.setOnAction(_-> {
      if (checkBox1.isSelected()) {
        System.out.println("Checkbox is now SELECTED");
      } else {
        System.out.println("Checkbox is now UNSELECTED");
      }
    });

    VBox root = new VBox(10, checkBox, checkBox1, button);
    Scene scene = new Scene(root, 300, 200);

    primaryStage.setTitle("CheckBox Example");
    primaryStage.setScene(scene);
    primaryStage.show();

  }
}
