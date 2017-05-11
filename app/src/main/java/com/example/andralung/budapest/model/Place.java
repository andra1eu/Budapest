package com.example.andralung.budapest.model;

public class Place {

    private final String title;
    private final int image;
    private final String description;

    public Place( int image, String title, String description) {
        this.title = title;
        this.image = image;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
