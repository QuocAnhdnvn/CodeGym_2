package com.model;

public class Room {
    private String name;
    private Long id;
    private String author;
    private static Long categoryId;
    private static Long countId = 1000L;

    public Room(String name, String author, Long categoryId) {
        this.id = countId;
        this.name = name;
        this.author = author;
        this.categoryId = categoryId;
        countId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
