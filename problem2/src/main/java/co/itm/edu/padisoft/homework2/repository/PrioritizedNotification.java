package co.itm.edu.padisoft.homework2.repository;

import co.itm.edu.padisoft.homework2.interfaces.Notification;

public class PrioritizedNotification extends NotificationDecorator {
    public PrioritizedNotification(Notification notification) {
        super.setWrapped(notification);
    }

    @Override
    public void send(String message) {
        System.out.println("[Prioridad Alta] Procesando antes de otras notificaciones.");
        super.send(message);
    }
}
