package com.aptech.sem3project;

public class Category {

    private final String fancyName;
    private final int imageId;

    public Category(String fancyName, int imageId) {
        this.fancyName = fancyName;
        this.imageId = imageId;
    }

    public String getFancyName() {
        return fancyName;
    }

    public int getImageId() {
        return imageId;

    }

}

