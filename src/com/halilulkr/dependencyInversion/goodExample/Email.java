package com.halilulkr.dependencyInversion.goodExample;

public class Email implements Message{

    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail(){
        System.out.println("Email gönderildi");
    }
}
