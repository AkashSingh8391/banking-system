module com.example.banking_management_system_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.banking_management_system_ to javafx.fxml;
    exports com.example.banking_management_system_;
}