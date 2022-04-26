package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/database monocept";
		String username = "root";
		String password = "abhi@4105";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "INSERT INTO student (StudentID,  StudentName) VALUES (?,?)";
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "106");
			statement.setString(2, "Sagar");
			 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			} 
			
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

}
