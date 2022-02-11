package com.halilulkr.interfaceSegregation.badExample;

public class Dog implements Animal{

    @Override
    public void fly() {
        //Belki uçakla yolculuk yaparsa uçabilir.
    }

    @Override
    public void run() {
        System.out.println("Köpek koşuyor");
    }

    @Override
    public void bark() {
        System.out.println("Köpek havlıyor");
    }
}
