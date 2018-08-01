package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "My first table in Hibernate";

    @Test
    public void testTaskListSave() {

        TaskList taskList =  new TaskList("Name of the taski list", DESCRIPTION);

        taskListDao.save(taskList);

        int id = taskList.getId();
        TaskList readTaskList = taskListDao.findOne(id);
        Assert.assertEquals(id, readTaskList.getId());

        taskListDao.delete(id);

    }

    @Test
    public  void testTaskListDaoFindByListName() {

        TaskList taskList = new TaskList("Name of the taski list", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        Assert.assertEquals(1, readTaskList.size());

       int id = readTaskList.get(0).getId();
       taskListDao.delete(id);

    }
}
