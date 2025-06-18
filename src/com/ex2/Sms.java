package com.ex2;

public class Sms implements NotificationSystem{
    private String message;

    @Override
    public boolean validate() {
        if (!validateMessageSMS(getMessage())){
            return false;
        }
        return true;
    }

    @Override
    public String format() {
        return "";
    }

    @Override
    public void send() {
        if (validate() == true){
            System.out.println("Enviando mensagem SMS...");
        }
        else {
            throw new IllegalArgumentException();
        }

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private static boolean validateMessageSMS(String newMessage){
        do {
            if (newMessage == null || newMessage.isEmpty()){
                System.out.println("Erro: Digite algo para enviar a mensagem");
                return false;
            }
            return true;
        }while (false);
    }

}
