package com.aulafx.prueba1.controlador;

import com.aulafx.prueba1.modelo.personas.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class PersonasController {
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtEdad;

    @FXML
    private TableView tblPersonas;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colApellidos;
    @FXML
    private TableColumn colEdad;

    //declaro un ObservableList para la TableView
    private ObservableList<Persona> listaPersona;



    // hacemos el método initialize para iniciar la tabla
    public void initialize() {
        // creo un objeto ObservableList
        // aqui creamos el ObservableList que he declarado más arriba
        listaPersona = FXCollections.observableArrayList();

        // Asignamos a las columnas correspondientes los nombres de los atributos
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));

        // asignar la lista que hemos creado antes a la tabla
        tblPersonas.setItems(listaPersona);
    }
    @FXML
    protected void agregarPersonas (ActionEvent action){

        // y ahora creamos la persona y la añadimos a la lista de personas
        Persona persona = new Persona(txtNombre.getText(), txtApellidos.getText(), Integer.parseInt(txtEdad.getText()));
        listaPersona.add(persona);
    }

}
