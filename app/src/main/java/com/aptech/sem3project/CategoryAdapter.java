package com.aptech.sem3project;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category> {
    public CategoryAdapter(@NonNull Context context, ArrayList<Category> categoryArrayList) {
        super(context, 0, categoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
        }

        Category category = getItem(position);
        TextView categoryName = listItemView.findViewById(R.id.idCategoryName);
        ImageView categoryImage = listItemView.findViewById(R.id.idCategoryPic);
        categoryName.setText(category.getFancyName());
        categoryImage.setImageResource(category.getImageId());

        listItemView.setOnClickListener(arg0 -> {
            Intent in=new Intent( arg0.getContext(), ViewCategoryRecipesActivity.class);
            in.putExtra("category", category.getFancyName());
            arg0.getContext().startActivity(in);
        });

        return listItemView;
    }
}

