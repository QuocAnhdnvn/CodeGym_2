package com.model;

public class Room {
    private String name;
    private Long id;
    private int price;
    private static Long categoryId;
    private static Long countId = 1000L;

    public Room(String name, int price, Long categoryId) {
        this.id = countId;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
