package com.campuspal.controller;

import com.campuspal.util.JsonUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;

    @FXML
    public void handleLogin() throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if(JsonUtil.validateUser(email,password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/homepage.fxml"));
            Scene homeScene = new Scene(loader.load());
            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(homeScene);
        }
    }

    @FXML
    public void handleRegister() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Registration Page.fxml"));
        Scene registerScene = new Scene(loader.load());
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.setScene(registerScene);
    }
}
