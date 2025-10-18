```mermaid
classDiagram
    class Notification {
        <<interface>>
        +void send(string message)
    }
    class BasicNotification {
        +void send(string message)
    }
    Notification <|-- BasicNotification
    
    class NotificationDecorator {
        <<abstract>>
        +Notificacion wrapped
        +void setWrapped(Notification w)
        +void send(string message)
    }
    class EncriptedNotification {
        +void send(string message)
    }
    class CompressedNotification {
        +void send(string message)
    }
    class LoggedNotification {
        +void send(string message)
    }
    class PrioritizedNotification {
        +void send(string message)
    }
    class TranslatedNotification {
        +void send(string message)
    }
    NotificationDecorator ..> Notification
    NotificationDecorator <|-- EncriptedNotification
    NotificationDecorator <|-- CompressedNotification
    NotificationDecorator <|-- LoggedNotification
    NotificationDecorator <|-- PrioritizedNotification
    NotificationDecorator <|-- TranslatedNotification

