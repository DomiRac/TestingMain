package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "TASK_LIST")
public class TaskList {
    private int id;
    private List<String> listName;
    private String description;

    public TaskList(int id, List<String> listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    public TaskList() {

    }

    @Id
    @Column(name = "ID", unique = true)
    @NotNull
    @GeneratedValue
    public int getId() {
        return id;
    }

    @Column(name = "LIST_NAME")
    public List<String> getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(List<String> listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
