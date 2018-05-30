package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String userAdress;

    public User(String userName, String userAdress) {
        this.userName = userName;
        this.userAdress = userAdress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAdress() {
        return userAdress;
    }
}
