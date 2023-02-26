module com.example.step01travelclub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.step01travelclub to javafx.fxml;
    exports com.example.step01travelclub;
}