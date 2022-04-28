package com.monocept.transactions.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class MerchantTransactions {

	public static void main(String[] args) throws SQLException{
		String dbURL = "jdbc:mysql://localhost:3306/merchant_transaction";
		String username = "root";
		String password = "abhi@4105";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "SELECT * FROM merchant where MID = 'M1'";
			String sql2 = "SELECT * FROM customer where CID = 'C1'";
			Boolean autoCommit;
			String update_query = "UPDATE `merchant` \r\n" + "SET balance = balance + 5000 \r\n" + "where MID='M3';";
			String update_query1 = "UPDATE `customer` \r\n" + "SET balance = balance - 5000 \r\n" + "where CID='C1';";

			Statement statement1 = conn.createStatement();
			ResultSet rs = null;
		
			rs = statement1.executeQuery(sql);
			
			System.out.println("Setting the AutoCommit value as FALSE");
            conn.setAutoCommit(false);
            autoCommit = conn.getAutoCommit();
            
            System.out.println("AutoCommit value of the Connection = "+ autoCommit);
			System.out.println("withdrawing money from customer m1");
			System.out.println(update_query);
			int return_rows = statement1.executeUpdate(update_query);
			System.out.println("Updated but didn't commit");
			
			// Getting data after Updation
			Connection conn1 = DriverManager.getConnection(dbURL, username, password);
			System.out.println("getting new Connection");
			System.out.println("MID = M1 data");
			
			Statement statement2 = conn1.createStatement();
			ResultSet rs1;
			rs1 = statement2.executeQuery(sql);
			displayData(rs1);
			System.out.println("Commit has been done");
			conn.commit();
			Savepoint s1 = conn.setSavepoint();
			
			System.out.println("Displaying data of MID = m1");
            System.out.println("Using The Second Connection");
            rs = statement2.executeQuery(sql); 
            displayData(rs);
            rs = statement1.executeQuery(sql); 
            
          //Rollback the transaction
            System.out.println("Data of Cid = C1");
            rs1 = statement1.executeQuery(sql2); 
            displayData1(rs1);
            System.out.println("Updating the balance of customer C1");
            System.out.println("Update Query is " + update_query1);
            statement1.executeUpdate(update_query1);
            
            System.out.println("Data of Customer = C1 but didn't commit");
            rs1 = statement1.executeQuery(sql2); 
            displayData1(rs1);
            System.out.println();
            System.out.println("Rollback is done without Save point");
            
            conn.rollback(s1);
            
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	private static void displayData(ResultSet rs1) throws SQLException {
		while (rs1.next()) {
			String MID = rs1.getString("MID");
			String MName = rs1.getString("MName");
			String balance = rs1.getString("balance");
			System.out.println(MID + "\n" + MName + "\n" + balance);
		}
	}
	private static void displayData1(ResultSet rs2) throws SQLException {
		while (rs2.next()) {
			String CID = rs2.getString("CID");
			String CName = rs2.getString("CName");
			String balance = rs2.getString("balance");
			System.out.println(CID + "\n" + CName + "\n" + balance);
		}
	}
}
