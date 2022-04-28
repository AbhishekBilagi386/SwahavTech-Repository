package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjectionTest {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:4040/emp_dept";
		String username = "root";
		String password = "abhi@4105";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" Employee number: ");
			String empNo = sc.nextLine();
			String sql = "Select EMPNO, ENAME, SAL, JOB from emp where EMPNO = "+empNo+"";
			System.out.println(sql);
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

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
