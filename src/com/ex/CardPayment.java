package com.ex;

public class CardPayment implements PaymentProcessor{
    private int cvv;
    private String cardNumber;

    @Override
    public void processPayment(double value) {
        System.out.println("Processando pagamento do cartão...");
    }

    @Override
    public boolean validate() {
        if (!validateCardNumber(getCardNumber())){
            return false;
        }
        if (!validateCvv(getCvv())){
            return false;
        }
        System.out.println("Validação ok!");
        return true;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    private static boolean validateCardNumber(String cardNumber){
        if (cardNumber == null || cardNumber.trim().isEmpty() ){
            System.out.println("Erro: Numero do cartão vazio!");
            return false;
        }
        if (cardNumber.length() < 13 || cardNumber.length() > 19){
            System.out.println("Erro: O numero do cartão inválido!");
            return false;
        }
        return true;
    }

    private static boolean validateCvv(int cvv){
        if (cvv < 3 || cvv > 4){
            System.out.println("Erro: Numero de cvv invalido!");
        }
        return true;
    }
}
