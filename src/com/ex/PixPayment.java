package com.ex;

public class PixPayment implements PaymentProcessor{
    private String pixKey;

    @Override
    public void processPayment(double value) {
        System.out.println("Pagamento realizado!");
    }

    @Override
    public boolean validate() {
        return true;
    }

    private static void generatorKey(){
        System.out.println("Gerando chave pix!");
    }
}
