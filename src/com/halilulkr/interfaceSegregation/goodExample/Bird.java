package com.halilulkr.interfaceSegregation.goodExample;

public class Bird implements Flyable,Runnable {

    @Override
    public void fly() {
        System.out.println("Kuş uçuyor");
    }

    @Override
    public void run() {
        System.out.println("Kuş koşuyor");
    }
}
