package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {

        TaskFactory factory = new TaskFactory();

        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);

        Assert.assertEquals("This is a shopping task", shoppingTask.getTaskName());
        Assert.assertFalse(shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {

        TaskFactory factory = new TaskFactory();

        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);

        Assert.assertEquals("This is a painting task", paintingTask.getTaskName());
        Assert.assertEquals(false, paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {

        TaskFactory factory = new TaskFactory();

        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);

        Assert.assertEquals("This is a driving task", drivingTask.getTaskName());
        Assert.assertEquals(false, drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
