package com.halilulkr.openClosed.badExample;

import java.util.List;

public class AreaService {

    //Sadece dikdörtgen hesabı yapıyor
    public double calculateArea(Rectangle... shapes){
        double area=0;
        for (Rectangle rectangle: shapes){
            area+=(rectangle.getWidth() * rectangle.getHeight());
        }
        return area;
    }

    //Peki daire için alan hesabı yapmak istesek
    public double calculateArea(Object... shapes){
        double area=0;
        for (Object shape:shapes){
            if (shape instanceof  Rectangle){
                Rectangle rectangle = (Rectangle) shape; //casting
                area+= (rectangle.getWidth() * rectangle.getHeight());
            }else if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                area+= (circle.getRadius() * circle.getRadius() * Math.PI);
            }else{
                throw new RuntimeException("Shape not supported");
            }
        }
        return area;
    }

    //Kodumuzda değişiklik yapmak zorunda kaldık
}
