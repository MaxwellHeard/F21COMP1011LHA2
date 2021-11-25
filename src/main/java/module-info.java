module com.example.f21comp1011lha2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.f21comp1011lha2 to javafx.fxml, com.google.gson;
    exports com.example.f21comp1011lha2;
}