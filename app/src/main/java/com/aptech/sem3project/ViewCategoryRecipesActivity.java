package com.aptech.sem3project;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ViewCategoryRecipesActivity extends AppCompatActivity {

    ListView recipeList;
    TextView textView;
    RecipeCategory[] categories;
    Recipe[] recipes;
    String category;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_category_recipes);

        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.category = extras.getString("category");
        }

        setTitle(category.substring(0, category.length() - 1) + " Recipes");

        recipeList = findViewById(R.id.recipeList);
        textView = findViewById(R.id.textView);

        DemoData data = new DemoData();
        recipes = data.getCategoryMapping().get(category.toLowerCase());

        List recipeNames = Arrays.stream(recipes)
                .map(Recipe::getName).collect(Collectors.toList());

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, recipeNames);
        recipeList.setAdapter(adapter);

        recipeList.setOnItemClickListener((adapterView, view, position, l) -> {
            String value = adapter.getItem(position);

            Intent in=new Intent( view.getContext(), ViewRecipeActivity.class);
            Recipe thisRecipe = (Recipe) Arrays.stream(recipes).filter(recipe -> recipe.getName().equals(value)).toArray()[0];
            in.putExtra("recipe", thisRecipe);
            view.getContext().startActivity(in);

        });
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