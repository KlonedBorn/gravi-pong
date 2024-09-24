module com.kingineer.github {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.kingineer.github to javafx.fxml;
    exports com.kingineer.github;
}
