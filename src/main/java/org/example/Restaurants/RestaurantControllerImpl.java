package org.example.Restaurants;

import java.util.List;

public class RestaurantControllerImpl implements RestaurantController {

    private final RestaurantManagement restaurantManagement;

    public RestaurantControllerImpl(RestaurantManagement restaurantManagement) {
        this.restaurantManagement = restaurantManagement;
    }

    @Override
    public void registerRestaurants(String restaurantName, List<Integer> pinCodes, String foodItemName, Integer foodItemPrice, Integer quantity) {
        restaurantManagement.registerRestaurant(restaurantName, pinCodes, foodItemName, foodItemPrice, quantity);
    }

    @Override
    public void updateRestaurantQuantity(String restaurantName, Integer newQuantity) {
        restaurantManagement.updateRestaurantQuantity(restaurantName, newQuantity);
    }

    @Override
    public void rateRestaurant(String restaurantName, Integer rating, String comment) {
        restaurantManagement.rateRestaurant(restaurantName, rating, comment);
    }

    @Override
    public void showRestaurant() {
        restaurantManagement.showRestaurant();
    }
}
