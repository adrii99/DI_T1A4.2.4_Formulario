module com.example.crearformulario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crearformulario to javafx.fxml;
    exports com.example.crearformulario;
}