package com.ex;

import java.util.Date;
import java.util.Random;

public class TicketPayment implements PaymentProcessor{
    private String barcode;

    @Override
    public void processPayment(double value) {

    }

    @Override
    public boolean validate() {
        return false;
    }


    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    private static String generateBarcode(){
        Random random = new Random();
        StringBuilder barcode = new StringBuilder();

        for (int i = 0; i < 13; i++){
            barcode.append(random.nextInt(10));
        }
        return barcode.toString();
    }

}
