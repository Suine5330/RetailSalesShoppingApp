package ProductProgramming;

import SalesApplicationals.SalesApplication;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Product 
{
	//The void functions to view all products, and search for products//
	
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	
	public void ViewAllProducts() 
	{
		try 
		{
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3307/bubbly", "Rooty", "Ride123456789!");
			statement = connect.createStatement();
			rs = statement.executeQuery("Select * from product");
			
			while (rs.next())
			{
				int product_id = rs.getInt("Product_ID");
				String name = rs.getString("name");
				Float cost = rs.getFloat("cost");
				System.out.println("Product_ID" + product_id + "Name:" + name + "Cost" + cost);
			}
		} 
		catch(Exception ex)
		{
			System.out.println("Error:" + ex.getMessage());
		}
		
		
	}
	
	
	public void SearchProduct(String pname) 
	{
		try 
		{
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3307/bubbly", "Rooty", "Ride123456789!");
			statement = connect.createStatement();
			rs = statement.executeQuery("Select * from product where name like '%" + pname + "%'");
			
			while (rs.next())
			{
				int product_id = rs.getInt("Product_ID");
				String name = rs.getString("name");
				Float cost = rs.getFloat("cost");
				System.out.println("Product_ID" + product_id + "Name:" + name + "Cost" + cost);
			}
		} 
		catch(Exception ex)
		{
			System.out.println("Error:" + ex.getMessage());
		}
	}
}
