package co.itm.edu.padisoft.homework2.repository;

import co.itm.edu.padisoft.homework2.interfaces.Notification;

public class LoggedNotification extends NotificationDecorator {
    public LoggedNotification(Notification notification) {
        super.setWrapped(notification);
    }

    @Override
    public void send(String message) {
        System.out.println("[Log] Enviando mensaje: " + message);
        super.send(message);
    }
}
