package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("list 1")
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return  new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "list 1")
    public TaskList getListOne() {
        return new TaskList();

    }

    @Bean(name = "list2")
    public TaskList getListTwo() {
        return new TaskList();
    }
}
