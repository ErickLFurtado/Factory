package com.ex2;

public class Sms implements NotificationSystem{
    private String senderNumber;
    private String message;

    public Sms(String senderNumber, String message) {
        this.senderNumber = senderNumber;
        this.message = message;
    }

    StringBuilder sb = new StringBuilder();

    @Override
    public boolean validate() {
        if (!validateMessageSMS(message, senderNumber)){
            return false;
        }
        return true;
    }

    @Override
    public String format() {
        sb.append("=====SMS======\n");
        sb.append("Para: ").append(senderNumber).append("\n");
        sb.append(message).append("\n");
        sb.append("----------------------");
        sb.append("Enviada através do sistema de notificação automatico!");
        sb.append("======================");
        return sb.toString();
    }

    @Override
    public void send() {
        validate();
        System.out.println("Enviando mensagem...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println("Erro ao conectar!");
        }
        System.out.println("Mensagem enviada!");

        String messageToSend = format();
        System.out.println(messageToSend);

    }

    private static boolean validateMessageSMS(String newMessage, String newNumber ){
        if (newNumber == null || newNumber.trim().isEmpty()){
            System.out.println("Erro: Numero digitado está vazio!");
            return false;
        }
        if (newMessage == null || newMessage.isEmpty()){
            System.out.println("Erro: Digite algo para enviar a mensagem");
            return false;
        }
        return true;
    }

}
