package com.campuspal.controller;

import com.campuspal.model.Ticket;
import com.campuspal.util.JsonUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SupportTicketController {
    @FXML private Button homeButton;
    @FXML private Button faqButton;
    @FXML private Button chatBotButton;
    @FXML private TextArea userTextArea;

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

    @FXML //Open FAQ Page
    public void handleFAQ() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FAQ page.fxml"));
        Scene faqScene = new Scene(loader.load());
        Stage stage = (Stage) faqButton.getScene().getWindow();
        stage.setScene(faqScene); }

    @FXML //Submit Support Ticket
    public void handleSubmit() {
        Ticket ticket = new Ticket();
        ticket.setTicketDescription(userTextArea.getText());
        JsonUtil.submitTicket(ticket);
        userTextArea.clear();}
}