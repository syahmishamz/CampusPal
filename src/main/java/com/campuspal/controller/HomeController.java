package com.campuspal.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class HomeController {
    @FXML private Button faqButton;
    @FXML private Button supportButton;

    //Open FAQ Page
    @FXML
    public void handleFAQ() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FAQ page.fxml"));
        Scene faqScene = new Scene(loader.load());
        Stage stage = (Stage) faqButton.getScene().getWindow();
        stage.setScene(faqScene);
    }

    //Open Support Ticket Page
    @FXML
    public void handleSupport() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Support page.fxml"));
        Scene supportScene = new Scene(loader.load());
        Stage stage = (Stage) supportButton.getScene().getWindow();
        stage.setScene(supportScene);
    }
}
