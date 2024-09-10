package org.example.Orders;

import org.example.ErrorHandling.Errors;
import org.example.Restaurants.Restaurant;
import org.example.Users.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderManagement {

    public Errors errors;
    public HashMap<String, Restaurant> restaurantMap;
    public HashMap<String, User> userMap;
    public HashMap<String, List<Order>> orders;

    public OrderManagement(Errors errors, HashMap<String, Restaurant> restaurantMap, HashMap<String, User> userMap, HashMap<String, List<Order>> orders) {
        this.errors = errors;
        this.restaurantMap = restaurantMap;
        this.userMap = userMap;
        this.orders = orders;
    }

    public void placeOrder(String username, String restaurantName, Integer quantity) {

        if(errors.isRestaurantValid(restaurantName, quantity)) return;

        Restaurant r = restaurantMap.get(restaurantName);
        r.setInitialQuantity(r.getInitialQuantity() - quantity);
        orders.computeIfAbsent(username, k -> new ArrayList<>()).add(new Order(restaurantName, quantity));
        System.out.println("Successfully placed order");
    }

    public void orderHistory(String username) {

        if(errors.isUserValid(username)) {
            return;
        }

        User u = userMap.get(username);
        List<Order> orderList = orders.get(username);
        if (orderList != null) {
            orderList.forEach(order -> System.out.println("Order history for user " + username + ": " + order.convertToString()));
        } else {
            System.out.println("No order found");
        }
    }

}
