package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);

        TaskList taskDone = board.getDoneList();
        TaskList taskToDo = board.getToDoList();
        TaskList taskInProgress = board.getInProgressList();

        taskDone.tasks.add("Done thing");
        taskToDo.tasks.add("Thing to do");
        taskInProgress.tasks.add("Thing in progress");

        Assert.assertEquals("Done thing", taskDone.tasks.get(0));
        Assert.assertEquals("Thing to do", taskToDo.tasks.get(0));
        Assert.assertEquals("Thing in progress", taskInProgress.tasks.get(0));
    }
}
