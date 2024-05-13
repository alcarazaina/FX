package com.aulafx.prueba1.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SumarController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello world!");
    }
}