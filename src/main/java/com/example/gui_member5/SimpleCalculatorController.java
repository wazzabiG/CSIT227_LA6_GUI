package com.example.gui_member5;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import static java.lang.Integer.parseInt;

public class SimpleCalculatorController {
    @FXML private TextField tfNumber1;
    @FXML private TextField tfNumber2;
    @FXML private ComboBox<String> cbOperations;
    @FXML private Button btnCompute;
    @FXML private Label lblResult;
    private int result = 0;

    @FXML
    public void initialize(){
        cbOperations.getItems().addAll("+","-","*","/");
        cbOperations.setValue("+");
        tfNumber1.setId("tfNumber1");
        tfNumber2.setId("tfNumber2");
        cbOperations.setId("cbOperations");
        btnCompute.setId("btnCompute");
        lblResult.setId("lblResult");
    }

    @FXML
    protected void onComputeClick(){
        try {
            String operator = cbOperations.getValue();
            int num1 = parseInt(tfNumber1.getText());
            int num2 = parseInt(tfNumber2.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) result = num1 / num2;
                    else {
                        lblResult.setText("Error: Division by 0");
                        return;
                    }
                    break;
            }

            lblResult.setText(String.valueOf(result));

        } catch(NumberFormatException e) {
            lblResult.setText("Invalid input");
        }
    }
}
