package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(123456, "Georgie", 'M', 1963, 6, 25, 5));
        usersList.add(new ForumUser(123457, "SweetPotato", 'F', 1977, 7, 11, 700));
        usersList.add(new ForumUser(121231, "JamieBrown", 'M', 1933, 5, 03, 0));
        usersList.add(new ForumUser(777777, "GodOfDarkness", 'F', 1967, 7, 01, 89));
        usersList.add(new ForumUser(989563, "Nickie18", 'M', 1937, 4, 22, 12));
        usersList.add(new ForumUser(453678, "Lollipop", 'M', 2000, 12, 13, 90));
        usersList.add(new ForumUser(563826, "LoveMyBMW", 'M', 1991, 9, 16, 123));
        usersList.add(new ForumUser(937515, "Punisher", 'M', 1988, 2, 14, 500));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }
}
