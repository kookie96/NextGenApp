module com.project.nextgenapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.annotation;


    opens com.project.nextgenapp to javafx.fxml;
    exports com.project.nextgenapp;
}