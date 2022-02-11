package com.halilulkr.openClosed.goodExample;

public class Rectangle implements Shape{

    private double width;
    private double height;

    //Getter Setter

    @Override
    public double getArea() {
        return (width * height);
    }


}
