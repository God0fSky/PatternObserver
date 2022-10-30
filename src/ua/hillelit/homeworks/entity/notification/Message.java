package ua.hillelit.homeworks.entity.notification;

public class Message extends Notification {
    private String textMessage;

    public Message(String messageTime, String sender, String textMessage) {
        super(messageTime, sender);
        this.textMessage = textMessage;
    }
}
