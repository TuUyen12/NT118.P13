package com.example.lab2_nt118;

public class Dish {
    private String ten_mon;
    private Thumbnail thumbnail;
    private boolean promotion;

    public Dish(String ten_mon, Thumbnail thumbnail, boolean promotion) {
        this.ten_mon = ten_mon;
        this.thumbnail = thumbnail;
        this.promotion = promotion;
    }
}
