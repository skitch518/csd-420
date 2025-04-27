module com.example.schrinermodule7 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.schrinermodule7 to javafx.fxml;
    exports com.example.schrinermodule7;
}