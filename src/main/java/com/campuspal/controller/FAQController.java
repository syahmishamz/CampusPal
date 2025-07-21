package com.campuspal.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FAQController {
    @FXML private Button arrowBtn1;
    @FXML private Label answer1;
    @FXML private Button arrowBtn2;
    @FXML private Label answer2;
    @FXML private Button arrowBtn3;
    @FXML private Label answer3;
    @FXML private Button arrowBtn4;
    @FXML private Label answer4;
    @FXML private Button homeButton;
    @FXML private Button chatBotButton;
    @FXML private Button supportButton;

    @FXML //Open Home Page
    public void handleHome() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/homepage.fxml"));
        Scene homeScene = new Scene(loader.load());
        Stage stage = (Stage) homeButton.getScene().getWindow();
        stage.setScene(homeScene); }

    @FXML //Open Chatbot Page
    public void handlechatBot() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Chatbot page.fxml"));
        Scene chatBotScene = new Scene(loader.load());
        Stage stage = (Stage) chatBotButton.getScene().getWindow();
        stage.setScene(chatBotScene); }

    @FXML //Open Support Ticket Page
    public void handleSupport() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Support page.fxml"));
        Scene supportScene = new Scene(loader.load());
        Stage stage = (Stage) supportButton.getScene().getWindow();
        stage.setScene(supportScene);}

    @FXML // Open FAQ 1
    private void toggleAnswer1() {
        toggleAnswer(answer1, arrowBtn1);}

    @FXML //Open FAQ 2
    private void toggleAnswer2() {
        toggleAnswer(answer2, arrowBtn2);}

    @FXML //Open FAQ 3
    private void toggleAnswer3() {
        toggleAnswer(answer3, arrowBtn3);}

    @FXML //Open FAQ 4
    private void toggleAnswer4() {
        toggleAnswer(answer4, arrowBtn4);}

    // To toggle for FAQ answer & direction of arrow
    private void toggleAnswer(Label answerLabel, Button arrowButton) {
        boolean currentlyVisible = answerLabel.isVisible();
        answerLabel.setVisible(!currentlyVisible);
        arrowButton.setText(currentlyVisible ? "▶" : "▼");}
}