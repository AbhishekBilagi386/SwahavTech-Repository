package com.monocept.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\User\\OneDrive\\Desktop\\SwabhavTechRepo\\Java\\basic-app2\\src\\config.properties");
		Properties prop = new Properties();

		prop.load(file);

		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String fname = prop.getProperty("firstname");

		System.out.println(username);
		System.out.println(password);
		System.out.println(fname);
	}

}
