package com.example.gui_member5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class NumberCounterController {
    @FXML private Label countLabel;
    @FXML private Button increaseButton;
    @FXML private Button decreaseButton;
    private int count = 0;

    @FXML
    public void initialize(){
        countLabel.setId("countLabel");
        increaseButton.setId("increaseButton");
        decreaseButton.setId("decreaseButton");
    }

    @FXML
    public void onIncreaseClick(){
        count++;
        countLabel.setText(String.valueOf(count));
    }

    @FXML
    public void onDecreaseClick(){
        count--;
        countLabel.setText(String.valueOf(count));
    }
}
