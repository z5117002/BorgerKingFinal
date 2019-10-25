package com.example.borgerkingfinal;

public class Food {

    // unique identifier of a menu item
    private int foodID;

    // Name of the item
    private String name;
    // Cost of the Item
    private String cost;
    // Item Description
    private String description;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;


    public Food(int foodID, String name, String cost, String description, int imageDrawableId) {
        this.foodID = foodID;
        this.name = name;
        this.cost = cost;
        this.description = description;

        // Added this line for temporary way of showing images
        this.imageDrawableId = imageDrawableId;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}