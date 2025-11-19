import javafx.application.Application;
import javafx.stage.Stage;
import persistance.DataManager;
import presentation.UI;

public class RunApp extends Application
{

  @Override public void start(Stage primaryStage)
  {
    DataManager dm = new DataManager();
    UI ui = new UI(dm);
    ui.show(primaryStage);
  }
}
