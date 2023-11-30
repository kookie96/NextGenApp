module com.project.nextgenapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;


    opens com.project.nextgenapp to javafx.fxml;
    exports com.project.nextgenapp;

}