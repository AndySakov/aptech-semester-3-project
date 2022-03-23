package com.aptech.sem3project;

import java.io.Serializable;

public class Recipe implements Serializable {
    private final String name;
    private final String image;
    private final String description;
    private final String[] ingredients;
    private final String[] steps;

    public Recipe(String name, String image, String description, String[] ingredients, String[] steps) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String[] getSteps() {
        return steps;
    }
}
