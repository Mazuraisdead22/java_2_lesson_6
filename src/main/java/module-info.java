module com.example.javafx_lesson_6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx_lesson_6 to javafx.fxml;
    exports com.example.javafx_lesson_6;
}