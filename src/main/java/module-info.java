module com.mycompany.examenjava2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.examenjava2 to javafx.fxml;
    exports com.mycompany.examenjava2;
}
