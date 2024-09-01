package com.food_app.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.food_app.dao.RestaurantDAO;
import com.food_app.model.Restaurant;
import com.food_app.util.MyConnection;

public class RestaurantDAOImpl implements RestaurantDAO
{
	private static MyConnection myCon;
	private static Connection con;
	private static PreparedStatement pstmt;

	public RestaurantDAOImpl()
	{
		myCon = MyConnection.getMyConnection();
		con = myCon.connect();
	}
	@Override
	public int insertRestaurant(Restaurant r) {
		try 
		{
			pstmt = con.prepareStatement("INSERT INTO Restaurant(restaurant_id, name, cuisine_type, delivery_time, address, admin_user_id, rating, is_active, image_path) VALUES(?,?,?,?,?,?,?,?,?)");
			
			pstmt.setInt(1, r.getRestaurant_id());
			pstmt.setString(2, r.getName());
			pstmt.setString(3, r.getCuisine_type());
			pstmt.setString(4, r.getDelivery_time());
			pstmt.setString(5, r.getAddress());
			pstmt.setInt(6, r.getAdmin_user_id());
			pstmt.setFloat(7, r.getRating());
			pstmt.setInt(8, r.getIs_active());
			pstmt.setString(9, r.getImage_path());
			
			return pstmt.executeUpdate();
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteRestaurant(int restaurant_id) {
		
		return 0;
	}

	@Override
	public int updateRestaurant(int restaurant_id) {
		
		return 0;
	}

	@Override
	public Restaurant fetchRestaurant(int restaurant_in) {
		
		return null;
	}

	@Override
	public List<Restaurant> fetchAllRestaurant() {
		
		return null;
	}
	
}
