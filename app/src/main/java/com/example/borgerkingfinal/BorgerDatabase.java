package com.example.borgerkingfinal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Example usage:
 *      Article articleObject1 = FakeDatabase.getArticleById(1);
 *      System.out.println(articleObject1.getHeadline());
 *
 * Output:
 *      Diamonds, Warlords and Mercenaries: Russia’s New Playbook in Africa
 */

public class BorgerDatabase {


    /***
     * Retrieves an Article object using the provided id.
     */
    public static Food getFoodById(int foodID) {
        return foods.get(foodID);
    }

    /***
     * Return an ArrayList containing all the articles in the database.
     */
    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }



    private static final HashMap<Integer, Food> foods = new HashMap<>();

    static {
        foods.put(1, new Food(
                1,
                "Whopper",
                "$8.99",
                "Angus beef, tomato, lettuce, cheddar, pickles, onion and our Ultimate Sauce. This standard burger will keep you satisfied.",
                R.drawable.whopper_image
        ));
        foods.put(2, new Food(
                2,
                "Double Whopper",
                "$10.99",
                 "Same as the Whopper but double the Angus.",
                R.drawable.doublewhopper_image
        ));

        foods.put(3, new Food(
                3,
                "Triple Whopper",
                "$12.99",
                "This one is for Legends Only.",
                R.drawable.triplewhopper_image
        ));

        foods.put(4, new Food(
                4,
                "Chicken Whopper",
                "$10.99",
                "Crumbed chicken, lettuce, mayo, tomato and bacon.",
                R.drawable.chickenwhopper_image
        ));

        foods.put(5, new Food(
                5,
                "Veggie Whopper",
                "$10.99",
                "The classic Whopper but with a veggie patty for all you soy boys out there.",
                R.drawable.veggiewhopper_image
        ));

        foods.put(6, new Food(
                6,
                "Fries",
                "$3.99",
                "Borger Kong's famous thin cut potato fries.",
                R.drawable.fries_image
        ));

        foods.put(7, new Food(
                2,
                "Sweet Potato Fries",
                "$3.99",
                "Thick cut sweet potato fries.",
                R.drawable.sweetpotatofries_image
        ));

        foods.put(8, new Food(
                8,
                "Coke",
                "$3.99",
                "355ml can of Coca Cola.",
                R.drawable.coke_image
        ));

        foods.put(9, new Food(
                9,
                "Diet Coke",
                "$3.99",
                "355ml can of Diet Coca Cola.",
                R.drawable.dietcoke_image
        ));

        foods.put(10, new Food(
                10,
                "BK Salad",
                "$10.99",
                "Lettuce and lots of ranch dressing to make you feel like you're eating healthy.",
                R.drawable.salad_image
        ));

        foods.put(11, new Food(
                11,
                "Apple Pie",
                "$4.99",
                "A classic apple pie, just like gran used to make.",
                R.drawable.applepie_image
        ));

        foods.put(12, new Food(
                12,
                "Chocolate Sundae",
                "$4.99",
                "Vanilla ice cream doused in hot chocolate fudge sauce.",
                R.drawable.chocolatesundae_image
        ));

        foods.put(13, new Food(
                13,
                "Caramel Sundae",
                "$4.99",
                "Vanilla ice cream doused in caramel sauce.",
                R.drawable.caramelsundae_image
        ));

        foods.put(14, new Food(
                14,
                "Strawberry Sundae",
                "$4.99",
                "Vanilla ice cream doused in strawberry sauce.",
                R.drawable.strawberrysundae_image
        ));

        foods.put(15, new Food(
                15,
                "Nuggets",
                "$7.99",
                "A 6 pack of chicken nuggets.",
                R.drawable.nuggets_image
        ));

    }
}
