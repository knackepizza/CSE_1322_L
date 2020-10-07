package Lab08;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label resultText;
    public TextField num1;
    public TextField num2;

    public void calculateInput(ActionEvent actionEvent) {
        Integer n1 = Integer.valueOf(num1.getText());
        Integer n2 = Integer.valueOf(num2.getText());
        Integer n3 = n1 + n2;
        resultText.setText(n3 + "");
    }

    public void clearText(ActionEvent actionEvent) {
        resultText.setText("");
    }
}
