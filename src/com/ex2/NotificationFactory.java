package com.ex2;

public class NotificationFactory {
    private String recipient;
    private String subject;
    private String message;

    public NotificationSystem notificationPriority (int type){
        switch (type){
            case 1:
                return new Email(recipient, subject, message);

            case 2:
                return new Sms(recipient, message);

            default:
                throw new IllegalArgumentException();
        }
    }
}
