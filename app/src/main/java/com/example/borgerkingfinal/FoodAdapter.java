package com.example.borgerkingfinal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// We need to give a type in angle brackets <> when we extend RecyclerView.Adapter
// It's saying that we want an adapter that adapts to FoodViewHolder (our custom ViewHolder)
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    // class variable that holds the data that we want to adapt
    private ArrayList<Food> foodsToAdapt;

    public void setData(ArrayList<Food> foodsToAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.foodsToAdapt = foodsToAdapt;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // First create a View from the layout file. It'll probably be a ViewGroup like
        // ConstraintLayout that contains more Views inside it.
        // This view now represents your entire one item.
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.food, parent, false);

        // Then create an instance of your custom ViewHolder with the View you got from inflating
        // the layout.
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        // Compare what we have in this method, to what we used to have in MainActivity

        // 'position' is the index of the ViewHolder currently being bound (note VIEWHOLDER). So
        // if position is 0, then we are binding the first ViewHolder in the list. This means the
        // corresponding data object will be at index 0 of our data ArrayList.
        final Food foodAtPosition = foodsToAdapt.get(position);

        holder.nameTextView.setText(foodAtPosition.getName());
        holder.costTextView.setText(foodAtPosition.getCost());
        //holder.descriptionTextView.setText(foodAtPosition.getDescription());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("FoodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });

        holder.itemImageView.setImageResource(foodAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return foodsToAdapt.size();
    }

    // ViewHolder represents one item, but doesn't have data when it's first constructed.
    // We assign the data in onBindViewHolder.
    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTextView;
        public TextView costTextView;
        public ImageView itemImageView;

        // This constructor is used in onCreateViewHolder
        public FoodViewHolder(View v) {
            super(v);  // runs the constructor for the ViewHolder superclass
            view = v;
            nameTextView = v.findViewById(R.id.nameTextView);
            costTextView = v.findViewById(R.id.descriptionTextView);
            itemImageView = v.findViewById(R.id.imageView);
        }
    }
}

