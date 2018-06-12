package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {
    Statistics statistics;

    public void calculateAdvStatistics(Statistics statistics) {
        int usersQuantity;
        int postsQuantity;
        int commentsQuantity;
        int averagePostsQuantityForUser;
        int averageCommentsQuantityForUser;
        int averageCommentsQuantityForPost;
    }

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics showStatistics() {
        return statistics;
    }
}