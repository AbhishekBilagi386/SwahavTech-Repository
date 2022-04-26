package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/database monocept";
		String username = "root";
		String password = "abhi@4105";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

			String sql = "UPDATE student SET StudentID=?, StudentName=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "123");
			statement.setString(2, "Sagar Deshpande");

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
