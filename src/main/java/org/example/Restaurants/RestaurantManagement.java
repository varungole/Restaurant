package org.example.Restaurants;

import org.example.ErrorHandling.Errors;
import org.example.Utilities.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantManagement {

    private Errors errors;
    private HashMap<String, Restaurant> restaurantMap;

    public RestaurantManagement(Errors errors, HashMap<String, Restaurant> restaurantMap) {
        this.errors = errors;
        this.restaurantMap = restaurantMap;
    }

    public void registerRestaurant(String restaurantName, List<Integer> pinCodes, String foodItemName, Integer foodItemPrice, Integer quantity) {
        if(!errors.doesRestaurantExist(restaurantName)) {
            return;
        }

        Restaurant newRestaurant = new Restaurant(restaurantName, pinCodes, foodItemName, foodItemPrice, quantity);
        restaurantMap.put(restaurantName, newRestaurant);
        System.out.println("Registered restaurant " + newRestaurant.getName());
    }

    public void updateRestaurantQuantity(String restaurantName, Integer newQuantity) {

        if(errors.isRestaurantValid(restaurantName, newQuantity)) {
            return;
        }

        Restaurant r = restaurantMap.get(restaurantName);
        r.setInitialQuantity(newQuantity);
        System.out.println("Quantity for restaurant is updated");
    }

    public void rateRestaurant(String restaurantName, Integer rating, String comment) {
        if(errors.restaurantDoesNotExist(restaurantName)) {
            return;
        }
        Restaurant r = restaurantMap.get(restaurantName);
        if(comment.isEmpty()) {
            comment = "";
        }
        Pair newRating = new Pair(rating, comment);
        r.setRatings(newRating);
    }

    public void showRestaurant() {
        for(Map.Entry<String, Restaurant> peek: restaurantMap.entrySet()) {
            System.out.println(peek.getKey());
        }
    }
}
