package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        taskExecuted = true;

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
       return taskExecuted;
    }
}
