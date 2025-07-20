package com.campuspal.util;

import com.campuspal.model.User;
import com.campuspal.model.Ticket;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
    private static final String USER_FILE = "src/main/resources/data/users.json";
    private static final String TICKET_FILE = "src/main/resources/data/tickets.json";

    public static boolean validateUser(String email, String password) {
        try {
            Reader reader = new FileReader(USER_FILE);
            Type listType = new TypeToken<List<User>>(){}.getType();
            List<User> users = new Gson().fromJson(reader, listType);
            for (User user : users) {
                if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void registerUser(User user) {
        try {
            List<User> users = new ArrayList<>();
            File file = new File(USER_FILE);
            if (file.exists()) {
                users = new Gson().fromJson(new FileReader(file), new TypeToken<List<User>>(){}.getType());
            }
            users.add(user);
            FileWriter writer = new FileWriter(USER_FILE);
            new Gson().toJson(users, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void submitTicket(Ticket ticket) {
        try {
            List<Ticket> tickets = new ArrayList<>();
            File file = new File(TICKET_FILE);
            if (file.exists()) {
                tickets = new Gson().fromJson(new FileReader(file), new TypeToken<List<Ticket>>(){}.getType());
            }
            tickets.add(ticket);
            FileWriter writer = new FileWriter(TICKET_FILE);
            new Gson().toJson(tickets, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
