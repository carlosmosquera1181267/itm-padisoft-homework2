package co.itm.edu.padisoft.homework2.repository;

import co.itm.edu.padisoft.homework2.interfaces.Notification;

public abstract class NotificationDecorator implements Notification {
    private Notification wrapped;

    public void setWrapped(Notification wrapped) {
        this.wrapped = wrapped;
    }

    public void send(String message) {
        wrapped.send(message);
    }
}
