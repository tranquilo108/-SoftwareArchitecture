module com.example.hw11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hw11 to javafx.fxml;
    exports com.example.hw11;
}