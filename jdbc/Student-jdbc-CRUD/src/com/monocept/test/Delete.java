package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/database monocept";
		String username = "root";
		String password = "abhi@4105";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "DELETE FROM student WHERE StudentName=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Sagar Deshpande");

			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
