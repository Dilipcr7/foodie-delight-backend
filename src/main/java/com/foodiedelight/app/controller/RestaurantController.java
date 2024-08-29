package com.foodiedelight.app.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodiedelight.app.exception.RestaurantNotFoundException;
import com.foodiedelight.app.model.Restaurant;
import com.foodiedelight.app.repo.RestaurantRepository;

@RestController
@RequestMapping("/api")
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addRestaurant")
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant savedRestaurant = restaurantRepository.save(restaurant);
        return new ResponseEntity<>(savedRestaurant, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/editRestaurant/{id}")
    public ResponseEntity<Restaurant> editRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurantDetails) {
        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new RestaurantNotFoundException(id));

        restaurant.setName(restaurantDetails.getName());
        restaurant.setAddress(restaurantDetails.getAddress());
        restaurant.setCuisine(restaurantDetails.getCuisine());
        restaurant.setDescription(restaurantDetails.getDescription());
        restaurant.setPhoneNumber(restaurantDetails.getPhoneNumber());
        restaurant.setEmail(restaurantDetails.getEmail());
        restaurant.setWebsite(restaurantDetails.getWebsite());
        restaurant.setOpen(restaurantDetails.isOpen());
        restaurant.setRating(restaurantDetails.getRating());

        Restaurant updatedRestaurant = restaurantRepository.save(restaurant);
        return new ResponseEntity<>(updatedRestaurant, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteRestaurant/{id}")
    public ResponseEntity<String> deleteRestaurant(@PathVariable Long id) {
    	if (!restaurantRepository.existsById(id)) {
            throw new RestaurantNotFoundException(id);
        }
        restaurantRepository.deleteById(id);
        return new ResponseEntity<>("Restaurant with ID " + id + " was successfully deleted.", HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getRestaurants")
    public ResponseEntity<List<Restaurant>> getRestaurants() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getRestaurant/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable Long id) {
        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new RestaurantNotFoundException(id));
        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }
}
