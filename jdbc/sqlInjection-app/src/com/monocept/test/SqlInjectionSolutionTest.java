package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjectionSolutionTest {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:4040/emp_dept";
		String username = "root";
		String password = "abhi@4105";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

			Scanner sc = new Scanner(System.in);

			System.out.println(" Employee number: ");
			String empNo = sc.nextLine();
			
			String sql = "SELECT EMPNO, ENAME, SAL, JOB FROM EMP WHERE EMPNO = ?";
			
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, empNo);
			System.out.println(statement);
			ResultSet result = statement.executeQuery();

			int count = 0;
				while (result.next()) {
					String employeeNum = result.getString("EMPNO");
					String employeeName = result.getString("EName");
					String salary = result.getString("sal");
					String job = result.getString("job");

					String output = "User #%d: %s - %s - %s - %s";
					System.out.println(String.format(output, ++count, employeeNum, employeeName, salary, job));
				}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
