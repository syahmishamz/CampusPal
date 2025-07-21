package com.campuspal.controller;

import com.campuspal.model.User;
import com.campuspal.util.JsonUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {
    @FXML private TextField usernameField;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;

    //Confirm Registration
    @FXML
    public void handleConfirmRegister() throws Exception {
        User user = new User();
        user.setUsername(usernameField.getText());
        user.setEmail(emailField.getText());
        user.setPassword(passwordField.getText());
        user.setRole("student");
        JsonUtil.registerUser(user);

        //Open Login Page
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login page.fxml"));
        Scene loginScene = new Scene(loader.load());
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.setScene(loginScene);
    }
}