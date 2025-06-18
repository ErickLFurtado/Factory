package com.ex;

public interface PaymentProcessor {

    void processPayment(double value);

    boolean validate();
}
