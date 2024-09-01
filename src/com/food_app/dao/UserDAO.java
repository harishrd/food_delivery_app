package com.food_app.dao;

import java.util.List;

import com.food_app.model.User;

public interface UserDAO {
	int insertUser(User u);
	int deleteUser(int userId);
	int updateUser(int userId);
	User fetchUser(int userId);
	List<User> fetchAllUsers();
}
