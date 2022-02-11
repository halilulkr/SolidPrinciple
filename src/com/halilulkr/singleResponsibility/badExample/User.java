package com.halilulkr.singleResponsibility.badExample;

public class User {

    private Long id;
    private String username;
    private String street;
    private String city;

    //Getter Setter

    public void changeAddress(String street, String city){
        this.street=street;
        this.city=city;
    }

    public void login(String username){
        System.out.println("Hoşgeldin" + username);
    }

    public void logOut(String username) {
        System.out.println("Güle güle" + username);
    }

    //Burada adres ile ilgili street ve city gibi veriler direkt olarak User sınıfında bulunmamalıdır.
    //Adres ile alakalı bir değişiklik yapacağımız zaman User sınıfı sorumlu olmadığı işlemlerden etkilenecektir.
}
