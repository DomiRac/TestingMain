package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASK_LIST")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public  TaskList() {
    }

    public TaskList(String listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    @NotNull
    public int getId() {
        return id;
    }

    @Column(name = "LIST_NAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName (String listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
