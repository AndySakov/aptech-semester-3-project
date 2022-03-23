package com.aptech.sem3project;

import java.util.List;

public class RecipeCategory {
    private final String name;
    private final Recipe[] recipes;

    public RecipeCategory(String name, Recipe[] recipes) {
        this.name = name;
        this.recipes = recipes;
    }

    public String getName() {
        return name;
    }

    public Recipe[] getRecipes() {
        return recipes;
    }
}
