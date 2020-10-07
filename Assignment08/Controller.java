package Assignment08;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Controller {
    public TextField calcInput;

    public void calculateInput(ActionEvent actionEvent) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        calcInput.setText(String.valueOf(engine.eval(calcInput.getText())));
    }

    public void clearText(ActionEvent actionEvent) {
        calcInput.setText("");
    }

    public void appendNumberZero(ActionEvent actionEvent)  { calcInput.setText(calcInput.getText() + "0"); }
    public void appendNumberOne(ActionEvent actionEvent)   { calcInput.setText(calcInput.getText() + "1"); }
    public void appendNumberTwo(ActionEvent actionEvent)   { calcInput.setText(calcInput.getText() + "2"); }
    public void appendNumberThree(ActionEvent actionEvent) { calcInput.setText(calcInput.getText() + "3"); }
    public void appendNumberFour(ActionEvent actionEvent)  { calcInput.setText(calcInput.getText() + "4"); }
    public void appendNumberFive(ActionEvent actionEvent)  { calcInput.setText(calcInput.getText() + "5"); }
    public void appendNumberSix(ActionEvent actionEvent)   { calcInput.setText(calcInput.getText() + "6"); }
    public void appendNumberSeven(ActionEvent actionEvent) { calcInput.setText(calcInput.getText() + "7"); }
    public void appendNumberEight(ActionEvent actionEvent) { calcInput.setText(calcInput.getText() + "8"); }
    public void appendNumberNine(ActionEvent actionEvent)  { calcInput.setText(calcInput.getText() + "9"); }

    public void appendAddition(ActionEvent actionEvent)       { calcInput.setText(calcInput.getText() + "+"); }
    public void appendSubtraction(ActionEvent actionEvent)    { calcInput.setText(calcInput.getText() + "-"); }
    public void appendMultiplication(ActionEvent actionEvent) { calcInput.setText(calcInput.getText() + "*"); }
    public void appendDivision(ActionEvent actionEvent)       { calcInput.setText(calcInput.getText() + "/"); }

}
