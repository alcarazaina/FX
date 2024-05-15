package com.aulafx.prueba1.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumarController {

    // Declarar los elementos de la vista que van a jugar un papel en la aplicación
    @FXML
    private Label lblResultado;
    @FXML
    private TextField txtOperador;
    @FXML
    private TextField txtOperador2;
    @FXML
    private Button btnSumar;
    @FXML
    protected void sumar(ActionEvent action){
        int operador = Integer.parseInt(txtOperador.getText());
        int operador2 = Integer.parseInt(txtOperador2.getText());
        int suma = operador + operador2;
        // quiero que esa suma la muestre la etiqueta resultado
        lblResultado.setText(String.valueOf(suma));
    }
}