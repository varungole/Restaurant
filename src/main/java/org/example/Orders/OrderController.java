package org.example.Orders;

public interface OrderController {

    public void placeOrder(String username, String restaurantName, Integer quantity);
    public void orderHistory(String username);
}
