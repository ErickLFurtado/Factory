package com.ex;

public class PaymentFactory {
    public PaymentProcessor paymentType (String type){
        type.toUpperCase();
        if (type == "CARD"){
            return new CardPayment();
        }
        if (type == "PIX"){
            return new PixPayment();
        }
        if (type == "TICKET"){
            return new TicketPayment();
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
