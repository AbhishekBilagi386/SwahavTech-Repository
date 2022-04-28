package com.monocept.model.Console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginConsole {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:4040/user";
		String username = "root";
		String password = "abhi@4105";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter UserName: ");
			String UName = sc.nextLine();
			System.out.println("Enter Password");
			String UPsw = sc.nextLine();
			String sql = "SELECT * FROM USER WHERE UNAME = ? AND PSW = ?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, UName);
			statement.setString(2, UPsw);
			System.out.println(statement);
			ResultSet result = statement.executeQuery();

			int count = 0;
			if (result.next()) {
				String userID = result.getString("UID");
				String userName = result.getString("UName");
				String uEmail = result.getString("email");
				String balance = result.getString("balance");

				String output = "User #%d: %s - %s - %s - %s";
				System.out.println(String.format(output, ++count, userID, userName, uEmail, balance));
				System.out.println("You have Suuccessfully loggedIn");
			} else {
				System.out.println("Wrong Username or Password");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
