package ua.hillelit.homeworks.entity.notification;

public class VoiceMessage extends Message {
    private String pathToAudio;

    public VoiceMessage(String messageTime, String sender, String textMessage, String pathToAudio) {
        super(messageTime, sender, textMessage);
        this.pathToAudio = pathToAudio;
    }
}
