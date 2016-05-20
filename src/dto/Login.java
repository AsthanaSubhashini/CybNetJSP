package dto;

public class Login {
	String username;
	String userpass;
	
	public Login(String username2, String userpass2) {
		this.username=username2;
		this.userpass=userpass2;
	}
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
	
}
