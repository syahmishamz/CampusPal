package com.campuspal.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class HomeController {
    @FXML private Button chatBotButton;
    @FXML private Button faqButton;
    @FXML private Button supportButton;

    @FXML
    public void handlechatBot() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Chatbot page.fxml"));
        Scene chatBotScene = new Scene(loader.load());
        Stage stage = (Stage) chatBotButton.getScene().getWindow();
        stage.setScene(chatBotScene);
    }

    @FXML
    public void handleFAQ() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FAQ page.fxml"));
        Scene faqScene = new Scene(loader.load());
        Stage stage = (Stage) faqButton.getScene().getWindow();
        stage.setScene(faqScene);
    }

    @FXML
    public void handleSupport() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Support page.fxml"));
        Scene supportScene = new Scene(loader.load());
        Stage stage = (Stage) supportButton.getScene().getWindow();
        stage.setScene(supportScene);
    }
}
