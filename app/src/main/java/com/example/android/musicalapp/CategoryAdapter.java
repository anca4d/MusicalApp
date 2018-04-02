package com.example.android.musicalapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category> {

    public CategoryAdapter(Activity context, ArrayList<Category> categories) {
        super(context, 0, categories);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Category currentCategory = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView imageList = (ImageView) listItemView.findViewById(R.id.imageList);
        imageList.setImageResource(currentCategory.getImageList());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songTitle = (TextView) listItemView.findViewById(R.id.song);
        songTitle.setText(currentCategory.getTitle());

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView arrow = (ImageView) listItemView.findViewById(R.id.arrow);
        arrow.setImageResource(currentCategory.getImgArrow());

        return listItemView;
    }
}
