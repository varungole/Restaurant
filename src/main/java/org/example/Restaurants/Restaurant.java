package org.example.Restaurants;

import org.example.Utilities.Pair;

import java.util.List;

public class Restaurant implements Comparable<Restaurant>{

    String name;
    List<Integer> pinCodes;
    String foodItemName;
    Integer foodItemPrice;
    Integer initialQuantity;
    Pair ratings;

    public Restaurant(String name, List<Integer> pinCodes, String foodItemName, Integer foodItemPrice, Integer initialQuantity) {
        this.name = name;
        this.pinCodes = pinCodes;
        this.foodItemName = foodItemName;
        this.foodItemPrice = foodItemPrice;
        this.initialQuantity = initialQuantity;
    }

    public Pair getRatings() {
        return ratings;
    }

    public void setRatings(Pair ratings) {
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPinCodes() {
        return pinCodes;
    }

    public void setPinCodes(List<Integer> pinCodes) {
        this.pinCodes = pinCodes;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public Integer getFoodItemPrice() {
        return foodItemPrice;
    }

    public void setFoodItemPrice(Integer foodItemPrice) {
        this.foodItemPrice = foodItemPrice;
    }

    public Integer getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(Integer initialQuantity) {
        this.initialQuantity = initialQuantity;
    }

    @Override
    public int compareTo(Restaurant o) {
        return 0;
    }
}
