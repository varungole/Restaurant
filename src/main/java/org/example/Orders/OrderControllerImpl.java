package org.example.Orders;

public class OrderControllerImpl implements OrderController {

    private final OrderManagement orderManagement;

    public OrderControllerImpl(OrderManagement orderManagement) {
        this.orderManagement = orderManagement;
    }

    @Override
    public void placeOrder(String username, String restaurantName, Integer quantity) {
        orderManagement.placeOrder(username, restaurantName, quantity);
    }

    @Override
    public void orderHistory(String username) {
         orderManagement.orderHistory(username);
    }
}
