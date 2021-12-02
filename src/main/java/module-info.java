module com.example.f21comp1011lha2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.f21comp1011lha2 to javafx.fxml, com.google.gson;
    exports com.example.f21comp1011lha2;
    exports com.example.f21comp1011lha2.Search;
    opens com.example.f21comp1011lha2.Search to com.google.gson, javafx.fxml;
    exports com.example.f21comp1011lha2.Details;
    opens com.example.f21comp1011lha2.Details to com.google.gson, javafx.fxml;
}