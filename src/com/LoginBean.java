package com;

import dto.Login;

public class LoginBean {

	String username;
	String userpass;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	@Override
	public String toString() {
		return "LoginBean [username=" + username + ", userpass=" + userpass + "]";
	}
	
	public boolean getStatus()
	{
		Login login=new Login(username,userpass);
		LoginDao dao=new LoginDao();
		boolean status=dao.validate(username,userpass);
		return status;
	}
	
}
