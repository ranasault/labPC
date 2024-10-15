
module com.example.singh1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.singh1 to javafx.fxml;
    exports com.example.singh1;
}