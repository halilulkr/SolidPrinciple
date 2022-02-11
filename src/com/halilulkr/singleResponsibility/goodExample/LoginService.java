package com.halilulkr.singleResponsibility.goodExample;

public class LoginService {

    public void login(String username){
        System.out.println("Hoşgeldin" + username);
    }

    public void logOut(String username) {
        System.out.println("Güle güle" + username);
    }
}
