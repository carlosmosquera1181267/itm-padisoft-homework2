package co.itm.edu.padisoft.homework2.repository;

import co.itm.edu.padisoft.homework2.interfaces.Notification;

public class EncryptedNotification extends NotificationDecorator {

    public EncryptedNotification(Notification notification) {
        super.setWrapped(notification);
    }

    @Override
    public void send(String message) {
        String encrypt = encrypt(message);
        System.out.println("[Cifrado] Mensaje cifrado antes de enviar");
        super.send(encrypt);
    }

    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}
