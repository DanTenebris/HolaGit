module com.mycompany.holagit {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.holagit to javafx.fxml;
    exports com.mycompany.holagit;
}
