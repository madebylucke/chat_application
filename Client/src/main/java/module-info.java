module dat055.group5.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens dat055.group5.client to javafx.fxml;
    exports dat055.group5.client;
    exports dat055.group5.client.Model;
    opens dat055.group5.client.Model to javafx.fxml;
}