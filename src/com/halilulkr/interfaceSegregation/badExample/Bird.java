package com.halilulkr.interfaceSegregation.badExample;

public class Bird implements Animal{

    @Override
    public void fly() {
        System.out.println("Kuş uçuyor");
    }

    @Override
    public void run() {
        System.out.println("Kuş koşuyor");
    }

    @Override
    public void bark() {
        //Kuşun havladığını pek sanmıyorum.
    }
}
