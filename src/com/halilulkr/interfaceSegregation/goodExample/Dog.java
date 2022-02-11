package com.halilulkr.interfaceSegregation.goodExample;

public class Dog implements Runnable,Barkable {

    @Override
    public void bark() {
        System.out.println("Köpek havlıyor");
    }

    @Override
    public void run() {
        System.out.println("Köpek koşuyor");
    }
}
