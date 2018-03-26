package com.kodilla.good.patterns.challenges.foodorder;

public class MailService implements InformationService {

    public void inform(User user){
        System.out.println("Mail Service method testing. Dear User: " + user + " congratulations!");
    }

    @Override
    public void inform() {

    }
}
