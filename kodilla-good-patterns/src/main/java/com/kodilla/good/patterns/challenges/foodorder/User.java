package com.kodilla.good.patterns.challenges.foodorder;

class User {

    private final String name;
    private final String adress;

    public User(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }
}
