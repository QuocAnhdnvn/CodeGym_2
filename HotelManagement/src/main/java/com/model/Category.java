package com.model;

public class Category {
    private Long id;
    private String name;
    private int total;
    private String description;

    public Category(Long id, String name,int total,String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - " + "Name: " + name + " - " + "Total: " + total + " - " + "Description: " + description;
    }
}
