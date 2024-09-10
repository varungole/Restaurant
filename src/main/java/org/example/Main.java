package org.example;

import org.example.ErrorHandling.Errors;
import org.example.Orders.OrderControllerImpl;
import org.example.Restaurants.RestaurantControllerImpl;
import org.example.Users.UserControllerImpl;
import org.example.Orders.OrderController;
import org.example.Restaurants.RestaurantController;
import org.example.Users.UserController;
import org.example.Orders.Order;
import org.example.Orders.OrderManagement;
import org.example.Restaurants.Restaurant;
import org.example.Restaurants.RestaurantManagement;
import org.example.Users.User;
import org.example.Users.UserManagement;

import java.util.*;


public class Main {

    private User currentUser = null;

    public Errors errors;
    public OrderManagement orderManagement;
    public UserManagement userManagement;
    public RestaurantManagement restaurantManagement;

    private final RestaurantController restaurantController;
    private final UserController userController;
    private final OrderController orderController;

    public Main() {
        HashMap<String, Restaurant> restaurantMap = new HashMap<>();
        HashMap<String, User> userMap = new HashMap<>();
        errors = new Errors(restaurantMap, userMap);

        restaurantManagement = new RestaurantManagement(errors, restaurantMap);
        userManagement = new UserManagement(errors, userMap, currentUser);
        HashMap<String, List<Order>> orders = new HashMap<>();
        orderManagement = new OrderManagement(errors, restaurantMap, userMap, orders);

        restaurantController = new RestaurantControllerImpl(restaurantManagement);
        userController = new UserControllerImpl(userManagement);
        orderController = new OrderControllerImpl(orderManagement);
    }

    public void registerRestaurants(String restaurantName, List<Integer> pinCodes, String foodItemName, Integer foodItemPrice, Integer quantity) {
        restaurantController.registerRestaurants(restaurantName, pinCodes, foodItemName, foodItemPrice, quantity);
    }

    public void updateQuantity(String restaurantName, Integer newQuantity) {
        restaurantController.updateRestaurantQuantity(restaurantName, newQuantity);
    }

    public void rateRestaurant(String restaurantName, Integer rating, String comment) {
        restaurantController.rateRestaurant(restaurantName, rating, comment);
    }

    public void showRestaurant() {
        restaurantController.showRestaurant();
    }

    public void registerUser(String userName, String genderCode, String phoneNumber, String pincode) {
        userController.registerUser(userName, genderCode, phoneNumber, pincode);
    }

    public void loginUser(String username) {
        userController.loginUser(username);
        currentUser = userController.getCurrentUser();
    }

    public void logoutUser(String username) {
        userController.logoutUser(username);
        currentUser = null;
    }

    public void placeOrder(String restaurantName, Integer quantity) {
        if (currentUser != null) {
            orderController.placeOrder(currentUser.getUserName(), restaurantName, quantity);
        } else {
            System.out.println("No user is logged in");
        }
    }

    public void orderHistory(String username) {
        orderController.orderHistory(username);
    }


    public static void main(String[] args) {
          Main m = new Main();
          m.registerRestaurants("Sheetal", Arrays.asList(411038, 411029, 411027), "Idli", 20 , 10 );
          m.registerRestaurants("LaxmiNarayan", Arrays.asList(411038, 411029, 411027), "Punjabi", 30 , 25 );
          m.registerUser("Varun", "M", "240-505-8378", "411038");
          m.loginUser("Varun");
          System.out.println("-------------------------");
          m.showRestaurant();
          System.out.println("-------------------------");
          m.placeOrder("Sheetal", 5);
          m.placeOrder("Sheetal", 2);
          m.orderHistory("Varun");
          m.registerUser("Ashish", "M", "9822-57-9937", "411038");
          m.loginUser("Ashish");
          m.placeOrder("LaxmiNarayan", 5);
          m.orderHistory("Ashish");
          m.registerUser("Max", "M", "240-686-8383", "20740");
          m.loginUser("Max");
          m.logoutUser("Max");
    }
}