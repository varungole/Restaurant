package org.example.ErrorHandling;

import org.example.Restaurants.Restaurant;
import org.example.Users.User;

import java.util.HashMap;

public class Errors {

    private HashMap<String, Restaurant> restaurantMap;
    private HashMap<String, User> userMap;

    public Errors(HashMap<String, Restaurant> restaurantMap, HashMap<String, User> userMap) {
        this.restaurantMap = restaurantMap;
        this.userMap = userMap;
    }

    public boolean isUserValid(String username) {
        User u = userMap.get(username);
        if(u == null) {
            System.out.println("Error: User does not exist");
            return true;
        }
        return false;
    }

    public boolean doesRestaurantExist(String restaurantName) {
        if(restaurantMap.containsKey(restaurantName)) {
            System.out.println("Error: Restaurant already exists");
            return false;
        }
        return true;
    }

    public boolean isRestaurantValid(String restaurantName, Integer quantity) {
        Restaurant r = restaurantMap.get(restaurantName);

        if(restaurantDoesNotExist(restaurantName)) {
            return true;
        }
        if(r.getInitialQuantity() < quantity) {
            System.out.println("Not enough food quantity avaialble");
            return true;
        }
        return false;
    }

    public boolean restaurantDoesNotExist(String restaurantName) {
        Restaurant r = restaurantMap.get(restaurantName);
        return r == null;
    }

    public boolean userAlreadyExists(String userName) {
        if(userMap.containsKey(userName)) {
            System.out.println("User already exists");
            return true;
        }
        return false;
    }
}
