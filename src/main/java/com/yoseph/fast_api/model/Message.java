package com.yoseph.fast_api;

public class Message {
    private String content;
    private String sender;

    // Constructors, Getters, Setters

    public Message() {}

    public Message(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
