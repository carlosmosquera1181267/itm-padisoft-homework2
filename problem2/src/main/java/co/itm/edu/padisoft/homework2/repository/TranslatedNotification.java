package co.itm.edu.padisoft.homework2.repository;

import co.itm.edu.padisoft.homework2.interfaces.Notification;

public class TranslatedNotification extends NotificationDecorator {

    public TranslatedNotification(Notification notification) {
        super.setWrapped(notification);
    }

    @Override
    public void send(String message) {
        String translated = translate(message);
        System.out.println("[Traducción] Mensaje traducido automáticamente.");
        super.send(translated);
    }

    private String translate(String message) {
        return "[EN]" + message;
    }
}
