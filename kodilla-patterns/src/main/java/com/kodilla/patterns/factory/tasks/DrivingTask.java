package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        Random random = new Random();

        if (random.nextInt(5) < 6) {
            return true;
        } else {
            return false;
        }
    }
}
