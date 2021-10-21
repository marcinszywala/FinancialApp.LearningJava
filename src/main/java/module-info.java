module com.example.financialappdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.financialappdemo to javafx.fxml;
    exports com.example.financialappdemo;
    exports com.example.financialappdemo.Controller;
    opens com.example.financialappdemo.Controller to javafx.fxml;
}