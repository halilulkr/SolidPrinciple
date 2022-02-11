package com.halilulkr.interfaceSegregation.goodExample;

public class Cat implements Runnable {

    @Override
    public void run() {
        System.out.println("Kedi koşuyor");
    }
}
