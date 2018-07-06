package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("This is a shopping task","Buy me a sandwich, pleeeasee", 1);
            case  PAINTINGTASK:
                return new PaintingTask("This is a painting task", "black", "EVERYTHING");
            case  DRIVINGTASK:
                return new DrivingTask("This is a driving task", "Take me to the Moon", "I don't know what u mean");
            default:
                return null;
        }
    }
}
