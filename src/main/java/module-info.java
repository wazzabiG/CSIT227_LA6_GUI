module com.example.gui_member5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.gui_member5 to javafx.fxml;
    exports com.example.gui_member5;
}