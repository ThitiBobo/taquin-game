module com.example.taquingame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taquingame to javafx.fxml;
    exports com.example.taquingame;
}