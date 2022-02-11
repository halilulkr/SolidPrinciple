package com.halilulkr.dependencyInversion.goodExample;

public class Sms implements Message{

    @Override
    public void sendMessage() {
        sendSms();
    }

    private void sendSms(){
        System.out.println("SMS gönderildi");
    }
}
