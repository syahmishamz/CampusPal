module campuspal {
    requires javafx.controls;
    requires javafx.fxml;
    requires langchain4j;
    requires langchain4j.open.ai;
    requires langchain4j.core;
    requires org.apache.logging.log4j;
    requires org.slf4j;
    requires java.net.http;

    opens com.campuspal to javafx.fxml;
    exports com.campuspal;
}
