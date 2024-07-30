module bmt.mavenjfx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens bmt.mavenjfx2 to javafx.fxml;
    exports bmt.mavenjfx2;
    exports bmt.mavenjfx2.sample;
    opens bmt.mavenjfx2.sample to javafx.fxml;
}