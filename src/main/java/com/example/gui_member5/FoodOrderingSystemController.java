package com.example.gui_member5;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.swing.*;

public class FoodOrderingSystemController {
    @FXML private CheckBox cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae;
    @FXML private RadioButton rbNone, rb5, rb10, rb15;
    @FXML private Button btnOrder;
    private ToggleGroup discountGroup;

    @FXML
    public void initialize(){
        discountGroup = new ToggleGroup();
        rbNone.setToggleGroup(discountGroup);
        rb5.setToggleGroup(discountGroup);
        rb10.setToggleGroup(discountGroup);
        rb15.setToggleGroup(discountGroup);

        cPizza.setId("cPizza");
        cBurger.setId("cBurger");
        cFries.setId("cFries");
        cSoftDrinks.setId("cSoftDrinks");
        cTea.setId("cTea");
        cSundae.setId("cSundae");
        rbNone.setId("rbNone");
        rb5.setId("rb5");
        rb10.setId("rb10");
        rb15.setId("rb15");
        btnOrder.setId("btnOrder");
    }

    @FXML
    protected void onOrderClick(){
        double total = 0;

        if(cPizza.isSelected()) total += 100;
        if(cBurger.isSelected()) total += 80;
        if(cFries.isSelected()) total += 65;
        if(cSoftDrinks.isSelected()) total += 55;
        if(cTea.isSelected()) total += 50;
        if(cSundae.isSelected()) total += 40;

        if(rb5.isSelected()) total *= 0.95;
        else if(rb10.isSelected()) total *= 0.90;
        else if(rb15.isSelected()) total *= 0.85;

        String message = String.format("The total price is Php %.2f", total);
        JOptionPane.showMessageDialog(null, message);
    }
}
