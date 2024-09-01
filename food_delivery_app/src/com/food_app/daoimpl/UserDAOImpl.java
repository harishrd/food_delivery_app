package com.food_app.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.food_app.dao.UserDAO;
import com.food_app.model.User;
import com.food_app.util.MyConnection;

public class UserDAOImpl implements UserDAO
{
	private static MyConnection myCon;
	private static Connection connection;
	private PreparedStatement pstmt;
	
	public UserDAOImpl()
	{
		myCon = MyConnection.getMyConnection();
		connection = myCon.connect();
	}

	@Override
	public int insertUser(User u) 
	{
		try {
			pstmt = connection.prepareStatement("INSERT INTO User(userId, username, password, email, address, role, createDate, lastLoginDate) VALUES(?,?,?,?,?,?,?,?)");
			
			pstmt.setInt(1, u.getUserId());
			pstmt.setString(2, u.getUsername());
			pstmt.setString(3, u.getPassword());
			pstmt.setString(4, u.getEmail());
			pstmt.setString(5, u.getAddress());
			pstmt.setString(6, u.getRole());
//			pstmt.setDate(7, u.getCreateDate());
//			pstmt.setDate(8, u.getLastLoginDate());
			
			return pstmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int deleteUser(int userId) {
		
		return 0;
	}

	@Override
	public int updateUser(int userId) {
		
		return 0;
	}

	@Override
	public User fetchUser(int userId) {
		
		return null;
	}

	@Override
	public List<User> fetchAllUsers() {
		
		return null;
	}
	
}
