package com.halilulkr.openClosed.goodExample;

public class Circle implements Shape{

    private double radius;

    //Getter Setter

    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
