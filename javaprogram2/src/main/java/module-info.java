module com.example.javaprogram2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.javaprogram2 to javafx.fxml, javafx.media;
    exports com.example.javaprogram2;
}
