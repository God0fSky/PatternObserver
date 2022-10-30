package ua.hillelit.homeworks;

import ua.hillelit.homeworks.entity.notification.Message;
import ua.hillelit.homeworks.entity.notification.Video;
import ua.hillelit.homeworks.entity.user.User;
import ua.hillelit.homeworks.service.Bot;

import java.time.Year;

public class MyBot {
    public static void main(String[] args) {
        Bot bot = new Bot("MyBot");
        User user1 = new User("First user", Year.of(2000));
        User user2 = new User("Second user", Year.of(2001));
        bot.follow(user1);
        bot.follow(user2);
        bot.addNotification(new Video("00:01", bot.getName(), "url address"));
        bot.addNotification(new Message("10:01", bot.getName(), "New message"));
    }
}
