package com.kodilla.hibernate.invoice;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.id = id;
        this.number = number;
        this.items = items;
    }

    @Id
    @Column(name = "ID", unique = true)
    @NotNull
    @GeneratedValue
    public int getId() {
        return id;
    }

    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }

    @OneToMany
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
