package org.example.Restaurants;

import java.util.List;

public interface RestaurantController {
    public void registerRestaurants(String restaurantName, List<Integer> pinCodes, String foodItemName, Integer foodItemPrice, Integer quantity);
    public void updateRestaurantQuantity(String restaurantName, Integer newQuantity);
    public void rateRestaurant(String restaurantName, Integer rating, String comment);
    public void showRestaurant();
}
