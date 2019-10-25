package com.example.borgerkingfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FoodDetailActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView costTextView;
    private TextView descriptionTextView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);


                // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "ArticleID" that was put into the intent at the origin.
        int foodID = intent.getIntExtra("FoodID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        Food food = BorgerDatabase.getFoodById(foodID);

        nameTextView = findViewById(R.id.nameTextView);
        costTextView = findViewById(R.id.costTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);
        imageView = findViewById(R.id.imageView);

        // Set the views to show the data of our object
        nameTextView.setText(food.getName());
        costTextView.setText(food.getCost());
        descriptionTextView.setText(food.getDescription());

        // Don't worry too much about images for now (but if you can get something to work then do)
        // Generally you don't want to store image data in your app (too much space required)
        // We'll learn the way to load images from the internet in a later week.

        // BUT we have included a way to show images that works for now.
        imageView.setImageResource(food.getImageDrawableId());
    }


    }