package com.example.android.musicalapp;

import java.io.Serializable;

public class Category implements Serializable {

    int imageList;
    int imgArrow;
    String title;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImgArrow() {
        return imgArrow;
    }

    public void setImgArrow(int imgArrow) {
        this.imgArrow = imgArrow;
    }

    public int getImageList() {
        return imageList;
    }

    public void setImageList(int imageList) {
        this.imageList = imageList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category(int imageList, int imgArrow, String title, String type) {
        this.imageList = imageList;
        this.imgArrow = imgArrow;
        this.title = title;
        this.type = type;
    }

    public Category() {
    }
}
