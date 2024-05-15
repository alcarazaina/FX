package com.aulafx.prueba1.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

public class PersonasController {
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtEdad;

    @FXML
    private TreeTableColumn colNombre;
    @FXML
    private TreeTableColumn colApellidos;
    @FXML
    private TreeTableColumn colEdad;

    @FXML
    protected void insertar (ActionEvent action){
        String nombre = txtNombre.getText();
        String apellido = txtApellidos.getText();
        int edad = Integer.parseInt(txtEdad.getText());


    }

}
