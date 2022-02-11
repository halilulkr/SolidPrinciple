package com.halilulkr.liskovSubstitution.badExample;

public class Square extends Rectangle {

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    //Matetiksel olarak kareyi de bir dikdörtgen olarak kabul edebiliriz. Ancak yazılım da işler böyle olmaz.
}
