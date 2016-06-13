package com.jorgesepulveda.firebasetest;

/**
 * Created by Jorge on 6/12/2016.
 */

public class ChatMessage {
    private String author;
    private String message;

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public ChatMessage() {};

    public ChatMessage(String author, String message){
        this.author = author;
        this.message = message;
    }
}
