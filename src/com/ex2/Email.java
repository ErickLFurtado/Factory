package com.ex2;

public class Email implements NotificationSystem{
    /// Endereço de email
    private String mail;
    /// Corpo do email
    private String message;

    @Override
    public boolean validate() {
        if (!validateMail(getMail()) || !validateMessage(getMessage())){
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

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private static boolean validateMail(String newMail){
        do {
            if (newMail.trim() == null || newMail.trim().isEmpty()){
                System.out.println("Erro: Digite um endereço de email!");
                return false;
            }
        }while (false);
        if (newMail.length() > 320){
            System.out.println("Erro: tamanho maximo do endereço de email atingido");
            return false;
        }
        return true;
    }

    private static boolean validateMessage(String newMessage){
        do {
            if (newMessage == null || newMessage.isEmpty()){
                System.out.println("Erro: Mensagem vazia!");
                return false;
            }
        }while (false);
        if (newMessage.length() > 1200){
            System.out.println("Erro: Número de caracteres excedido!");
            return false;
        }
        return true;
    }
}
