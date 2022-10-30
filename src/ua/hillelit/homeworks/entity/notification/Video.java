package ua.hillelit.homeworks.entity.notification;

public class Video extends Notification {
    private String url;

    public Video(String messageTime, String sender, String url) {
        super(messageTime, sender);
        this.url = url;
    }
}
