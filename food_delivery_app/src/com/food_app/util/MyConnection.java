package com.food_app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// singleton class
public class MyConnection 
{
	private MyConnection()
	{
		
	}
	
	private static MyConnection myCon = new MyConnection();
	
	public static MyConnection getMyConnection()
	{
		return myCon;
	}
	
	public Connection connect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery_app", "root", "FLYINGFISH");

		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
