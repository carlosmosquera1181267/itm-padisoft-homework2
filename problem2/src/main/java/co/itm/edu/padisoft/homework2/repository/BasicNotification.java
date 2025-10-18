package co.itm.edu.padisoft.homework2.repository;

import co.itm.edu.padisoft.homework2.interfaces.Notification;

public class BasicNotification implements Notification {

    public BasicNotification() {

    }
    @Override
    public void send(String message) {
        System.out.println("Sending BASIC notification: " + message);
    }
}
