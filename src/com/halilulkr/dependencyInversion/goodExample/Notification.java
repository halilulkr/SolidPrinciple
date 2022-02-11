package com.halilulkr.dependencyInversion.goodExample;

import java.util.List;

public class Notification {

    private List<Message> messages;

    public Notification(List<Message> messages) {
        this.messages = messages;
    }

    public void sender(){
        for (Message message:messages){
            message.sendMessage();
        }
    }
}
