module com.mycompany.trotebuster {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.mycompany.trotebuster to javafx.fxml;
    exports com.mycompany.trotebuster;
}
