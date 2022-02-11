package com.halilulkr.openClosed.goodExample;

public class AreaManager {

    public double calculateArea(Shape... shapes){

        double area=0;
        for (Shape shape: shapes){
            area+=shape.getArea();
        }
        return area;
    }
}
