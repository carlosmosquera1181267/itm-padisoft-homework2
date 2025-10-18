package co.itm.edu.padisoft.homework2;

import co.itm.edu.padisoft.homework2.interfaces.Notification;
import co.itm.edu.padisoft.homework2.repository.BasicNotification;
import co.itm.edu.padisoft.homework2.repository.CompressedNotification;
import co.itm.edu.padisoft.homework2.repository.EncryptedNotification;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! \r\n");

        Notification notification = new BasicNotification();
        notification = new EncryptedNotification(notification);
        notification = new CompressedNotification(notification);

        notification.send("Mensaje importante confidencial y comprimido");
    }
}