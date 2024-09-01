package com.food_app.dao;

import java.util.List;

import com.food_app.model.Restaurant;

public interface RestaurantDAO 
{
	int insertRestaurant(Restaurant r);
	int deleteRestaurant(int restaurant_id);
	int updateRestaurant(int restaurant_id);
	Restaurant fetchRestaurant(int restaurant_in);
	List<Restaurant> fetchAllRestaurant();
}
