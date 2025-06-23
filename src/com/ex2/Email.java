package com.ex2;

public class Email implements NotificationSystem{
    private String recipient;
    private String subject;
    private String message;
    private String sender;

    public Email(String recipient, String subject, String message, String sender) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
        this.sender = sender;
    }

    public Email(String recipient, String subject, String message) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
    }

    StringBuilder sb = new StringBuilder();

    @Override
    public boolean validate() {
        if (!validateMail(getRecipient()) || !validateMessage(getMessage())){
            return false;
        }
        return true;
    }

    @Override
    public String format() {
        sb.append("===EMAIL===\n");
        sb.append("De:: ").append(sender).append("\n");
        sb.append("Para: ").append(recipient).append("\n");
        sb.append("Assunto: ").append(subject).append("\n");
        sb.append(message).append("\n");
        sb.append("-----------------------------------------\n");
        sb.append("Enviado do sistema automatico de notificações");
        sb.append("==============================================");

        return sb.toString();
    }

    @Override
    public void send() {
        validate();
        System.out.println("Enviando email...");
        try{
                Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Erro durante a conexão");
        }
        System.out.println("Email enviado1");

        String mailToSend = format();
        System.out.println(mailToSend);
    }

    public String getRecipient() {
        return recipient;
    }

    public void setMail(String recipient) {
        this.recipient = recipient;
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
