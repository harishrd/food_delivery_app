package com.food_app.model;

// POJO Class / Model class

public class Restaurant {
	private int restaurant_id;
	private String name; 
	private String cuisine_type;
	private String delivery_time;
	private String address;
	private int admin_user_id;
	private float rating;
	private byte is_active;
	private String image_path;
	
	public Restaurant() {
		super();
	}

	public Restaurant(int restaurant_id, String name, String cuisine_type, String delivery_time, String address,
			int admin_user_id, float rating, byte is_active, String image_path) {
		super();
		this.restaurant_id = restaurant_id;
		this.name = name;
		this.cuisine_type = cuisine_type;
		this.delivery_time = delivery_time;
		this.address = address;
		this.admin_user_id = admin_user_id;
		this.rating = rating;
		this.is_active = is_active;
		this.image_path = image_path;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisine_type() {
		return cuisine_type;
	}

	public void setCuisine_type(String cuisine_type) {
		this.cuisine_type = cuisine_type;
	}

	public String getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAdmin_user_id() {
		return admin_user_id;
	}

	public void setAdmin_user_id(int admin_user_id) {
		this.admin_user_id = admin_user_id;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public byte getIs_active() {
		return is_active;
	}

	public void setIs_active(byte is_active) {
		this.is_active = is_active;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurant_id=" + restaurant_id + ", name=" + name + ", cuisine_type=" + cuisine_type
				+ ", delivery_time=" + delivery_time + ", address=" + address + ", admin_user_id=" + admin_user_id
				+ ", rating=" + rating + ", is_active=" + is_active + ", image_path=" + image_path + "]";
	}
	
}
