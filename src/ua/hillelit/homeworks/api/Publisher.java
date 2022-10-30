package ua.hillelit.homeworks.api;

public interface Publisher {
    void follow(Sub sub);

    void unfollow(Sub sub);

    void notifySubs();
}
