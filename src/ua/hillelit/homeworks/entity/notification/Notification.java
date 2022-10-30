package ua.hillelit.homeworks.entity.notification;

public abstract class Notification {
    private String messageTime;
    private String sender;

    public Notification(String messageTime, String sender) {
        this.messageTime = messageTime;
        this.sender = sender;
    }
}
