module com.aleram.demo01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aleram.demo01 to javafx.fxml;
    exports com.aleram.demo01;
}