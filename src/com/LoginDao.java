package com;


import java.sql.*;

public class LoginDao {

public static boolean validate(String username,String userpass){
boolean status=false;
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/cybnet", "root", "root");
	//Connection connection=MyConn();
	PreparedStatement preparedStatement=connection.prepareStatement("select * from users where username=? and userpass=?");
	preparedStatement.setString(1, username);
	preparedStatement.setString(2, userpass);
	
	ResultSet resultSet=preparedStatement.executeQuery();
	status=resultSet.next();
	
	
}catch(Exception e){System.out.println(e);}
return status;
}
}
