package com.monocept.model.loginModel;

public class Login {
	private String UserName;
	private String password;
	
	public Login(String name, String psw) {
		this.UserName = name;
		this.password = psw;	
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
