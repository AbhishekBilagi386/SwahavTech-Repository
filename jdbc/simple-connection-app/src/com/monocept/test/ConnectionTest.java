package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/?useCursorFetch=true", "root", "abhi@4105");
			System.out.println(con.getClass());
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {

			if (con.isClosed() != true) {
				con.close();
			}
		}
	}

}
