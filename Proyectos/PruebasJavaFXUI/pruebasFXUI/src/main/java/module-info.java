module edu.fpdual.mijavaFx {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.fpdual.mijavaFx to javafx.fxml;
    exports edu.fpdual.mijavaFx;
}
