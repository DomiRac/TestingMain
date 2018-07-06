package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
