module com.example.javaprogram2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.javaprogram2 to javafx.fxml;
    exports com.example.javaprogram2;
}
