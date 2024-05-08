module com.aulafx.prueba1 {
    // necesito estos módulos
    requires transitive javafx.controls;
    requires javafx.fxml;


    opens com.aulafx.prueba1 to javafx.fxml;
    exports com.aulafx.prueba1;
}