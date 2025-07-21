package com.campuspal.controller;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChatbotController {
    @FXML private TextArea chatArea;
    @FXML private TextField userInputField;

    interface Assistant {
        String chat(String message); }

    //Initialise AI chat using LangChain4j
    private final Assistant assistant = AiServices.builder(Assistant.class)
            .chatModel(OpenAiChatModel.builder()
                    .apiKey(System.getenv("OPENAI_API_KEY"))
                    .modelName("gpt-4o")
                    .build())
            .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
            .build();

    @FXML //Get AI Response
    public void handleSendChat() {
        String input = userInputField.getText();
        String response = assistant.chat(input);
        chatArea.appendText("You: " + input + "\n");
        chatArea.appendText("AI: " + response + "\n");
        userInputField.clear();
    }

    @FXML //Open Home Page
    public void handleHome() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/homepage.fxml"));
        Scene homeScene = new Scene(loader.load());
        Stage stage = (Stage) homeButton.getScene().getWindow();
        stage.setScene(homeScene); }

    @FXML //Open Support Ticket Page
    public void handleSupport() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Support page.fxml"));
        Scene supportScene = new Scene(loader.load());
        Stage stage = (Stage) supportButton.getScene().getWindow();
        stage.setScene(supportScene);}

    //Open FAQ Page
    @FXML
    public void handleFAQ() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FAQ page.fxml"));
        Scene faqScene = new Scene(loader.load());
        Stage stage = (Stage) faqButton.getScene().getWindow();
        stage.setScene(faqScene);
    }
}
