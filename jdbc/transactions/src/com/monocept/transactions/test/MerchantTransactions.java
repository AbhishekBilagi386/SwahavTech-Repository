package com.monocept.transactions.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MerchantTransactions {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/merchant_transaction";
		String username = "root";
		String password = "abhi@4105";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "SELECT * FROM merchant";
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int count = 0;
			while (result.next()) {
				String StudentID = result.getString("MID");
				String StudentName = result.getString("MName");

				String output = "User #%d: %s - %s";
				System.out.println(String.format(output, ++count, StudentID, StudentName));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

}
