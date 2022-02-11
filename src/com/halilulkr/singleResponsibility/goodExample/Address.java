package com.halilulkr.singleResponsibility.goodExample;

public class Address {

    private String street;
    private String city;

    public void changeAddress(String street, String city){
        this.street=street;
        this.city=city;
    }
}
