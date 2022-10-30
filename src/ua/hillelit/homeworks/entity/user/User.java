package ua.hillelit.homeworks.entity.user;

import ua.hillelit.homeworks.api.Sub;
import ua.hillelit.homeworks.service.Bot;

import java.time.Year;

public class User implements Sub {
    private String nickname;
    private Year birthYear;

    public User(String nickname, Year birthday) {
        this.nickname = nickname;
        this.birthYear = birthday;
    }

    @Override
    public void update(Bot bot) {
        System.out.println("Вы получили " + bot.getName() + " от " + bot.getName());
    }
}
