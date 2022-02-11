package com.halilulkr.interfaceSegregation.badExample;

public class Cat implements Animal{

    @Override
    public void fly() {
        //Kedinin de uçtuğunu pek sanmıyorum.
    }

    @Override
    public void run() {
        System.out.println("Kedi koşuyor");
    }

    @Override
    public void bark() {
        //Belki yırtıcı bir kedidir.
        System.out.println("Kedi havlıyor");
    }
}
