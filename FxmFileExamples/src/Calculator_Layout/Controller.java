package Calculator_Layout;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.script.ScriptException;

public class Controller
{

    @FXML private TextField displayField;

    @FXML private Button btn7;
    @FXML private Button btnAdd;
    @FXML private Button btnEquals;

    private String currentInput = "";

    @FXML
    private void initialize() {
      // Optional: Initialize logic
      displayField.setText("0");
    }

    @FXML
    private void handleNumber(javafx.event.ActionEvent event) {
      Button clicked = (Button) event.getSource();
      currentInput += clicked.getText();
      displayField.setText(currentInput);
    }

    @FXML
    private void handleOperation(javafx.event.ActionEvent event) {
      Button clicked = (Button) event.getSource();
      currentInput += " " + clicked.getText() + " ";
      displayField.setText(currentInput);
    }

    @FXML
    private void handleEquals() {
      try {
        // Simple evaluation (you can improve this later)
        String result = evaluateExpression(currentInput);
        displayField.setText(result);
        currentInput = result;
      } catch (Exception e) {
        displayField.setText("Error");
      }
    }

    private String evaluateExpression(String expr) {
      // Very basic: use JavaScript engine or write your own parser
      try
      {
        return String.valueOf(new javax.script.ScriptEngineManager()
            .getEngineByName("JavaScript").eval(expr));
      }
      catch (ScriptException e)
      {
        throw new RuntimeException(e);
      }
    }
  }

