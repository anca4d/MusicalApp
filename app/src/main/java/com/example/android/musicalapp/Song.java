package com.example.android.musicalapp;

import java.io.Serializable;

public class Song implements Serializable {

    String title;
    String lirics;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLirics() {
        return lirics;
    }

    public void setLirics(String lirics) {
        this.lirics = lirics;
    }

    public Song(String title, String lirics) {
        this.title = title;
        this.lirics = lirics;
    }

    public Song() {
    }
}
