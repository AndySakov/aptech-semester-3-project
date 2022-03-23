package com.aptech.sem3project;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView categoriesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoriesGV = findViewById(R.id.idCategoryList);

        ArrayList<Category> categoryArrayList = new ArrayList<>();
        categoryArrayList.add(new Category("Mocktails", R.drawable.mocktails));
        categoryArrayList.add(new Category("Juices", R.drawable.juices));
        categoryArrayList.add(new Category("Chocolate Drinks", R.drawable.chocolate_drinks));
        categoryArrayList.add(new Category("Smoothies", R.drawable.smoothies));
        categoryArrayList.add(new Category("Punches", R.drawable.punches));
        categoryArrayList.add(new Category("Teas", R.drawable.teas));

        CategoryAdapter adapter = new CategoryAdapter(this, categoryArrayList);
        categoriesGV.setAdapter(adapter);

        categoriesGV.setVerticalSpacing(100);
    }
}