package com.foodiedelight.app.exception;

public class RestaurantNotFoundException extends RuntimeException {
    public RestaurantNotFoundException(Long id) {
        super("Restaurant with ID " + id + " not found.");
    }
}