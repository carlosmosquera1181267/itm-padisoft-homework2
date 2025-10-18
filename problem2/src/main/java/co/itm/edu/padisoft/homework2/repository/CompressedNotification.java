package co.itm.edu.padisoft.homework2.repository;

import co.itm.edu.padisoft.homework2.interfaces.Notification;

public class CompressedNotification extends NotificationDecorator {

    public CompressedNotification(Notification notification) {
        super.setWrapped(notification);
    }

    @Override
    public void send(String message) {
        String compressed = compress(message);
        System.out.println("[Compresión] Mensaje comprimido antes de enviar.");
        super.send(compressed);
    }

    private String compress(String message) {
        return message.replace(" ", "");
    }
}
