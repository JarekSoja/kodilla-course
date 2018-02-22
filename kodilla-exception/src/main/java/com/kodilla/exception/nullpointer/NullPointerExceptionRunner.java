package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e){
                System.out.println("Message not sent" + "but my program is running very well!");
            }
            System.out.println("Rest of the program is running flawlessly.");

    }
}