package org.example.Orders;

public class Order {
    private String restaurantName;
    private Integer quantity;

    public Order(String restaurantName, Integer quantity) {
        this.restaurantName = restaurantName;
        this.quantity = quantity;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String convertToString() {
        return this.restaurantName + "-->" + this.quantity;
    }
}
