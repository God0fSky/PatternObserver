package ua.hillelit.homeworks.service;

import ua.hillelit.homeworks.api.Publisher;
import ua.hillelit.homeworks.api.Sub;
import ua.hillelit.homeworks.entity.notification.Notification;

import java.util.ArrayList;
import java.util.List;

public class Bot implements Publisher {
    private String name;
    private final List<Sub> subs = new ArrayList<>();
    private final List<Notification> notifications = new ArrayList<>();


    public Bot(String name) {
        this.name = name;
    }

    public void addNotification(Notification not) {
        notifications.add(not);
        notifySubs();
    }

    @Override
    public void follow(Sub sub) {
        subs.add(sub);
    }

    @Override
    public void unfollow(Sub sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySubs() {
        for (Sub s : subs) {
            s.update(this);
        }
    }

    public String getName() {
        return name;
    }
}
