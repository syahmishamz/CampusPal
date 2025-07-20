package com.campuspal.controller;

import com.campuspal.model.Ticket;
import com.campuspal.util.JsonUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SupportTicketController {
    @FXML private TextArea userTextArea;

    @FXML
    public void handleSubmit() {
        Ticket ticket = new Ticket();
        ticket.setTicketDescription(userTextArea.getText());
        JsonUtil.submitTicket(ticket);
        userTextArea.clear();
    }
}