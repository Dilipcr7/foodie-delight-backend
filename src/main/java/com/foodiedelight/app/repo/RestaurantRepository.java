package com.foodiedelight.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodiedelight.app.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}