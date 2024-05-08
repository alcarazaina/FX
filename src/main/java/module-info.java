module com.aulafx.prueba1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aulafx.prueba1 to javafx.fxml;
    exports com.aulafx.prueba1;
}