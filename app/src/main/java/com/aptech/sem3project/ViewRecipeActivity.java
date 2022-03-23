package com.aptech.sem3project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.net.URL;

public class ViewRecipeActivity extends AppCompatActivity {

    Recipe recipe;
    ImageView recipeImage;
    TextView descriptionText;
    TextView ingredientsText;
    TextView stepsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recipe);

        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.recipe = (Recipe) extras.getSerializable("recipe");
        }

        setTitle(recipe.getName());

        recipeImage = findViewById(R.id.recipeImage);
        descriptionText = findViewById(R.id.descriptionText);
        ingredientsText = findViewById(R.id.ingredientsText);
        stepsText = findViewById(R.id.stepsText);

        Glide.with(this).load(recipe.getImage()).placeholder(R.drawable.infinity).into(recipeImage);
        descriptionText.setText(getResources().getString(R.string.description_text, recipe.getDescription()));
        ingredientsText.setText(getResources().getString(R.string.ingredients_text, this.buildIngredients()));
        stepsText.setText(getResources().getString(R.string.steps_text, this.buildSteps()));
    }

    private String buildIngredients() {
        StringBuilder ingredientsJoined = new StringBuilder();
        for (String ingredient : this.recipe.getIngredients()) {
            ingredientsJoined.append(ingredient).append("\n\n");
        }
        return ingredientsJoined.toString().trim();
    }

    private String buildSteps() {
        StringBuilder stepsJoined = new StringBuilder();
        for (String step : this.recipe.getSteps()) {
            stepsJoined.append(step).append("\n\n");
        }
        return stepsJoined.toString().trim();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}