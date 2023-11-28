module com.project.nextgenapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.nextgenapp to javafx.fxml;
    exports com.project.nextgenapp;
}