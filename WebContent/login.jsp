<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="lb" class="com.LoginBean" scope="session"/>
<jsp:setProperty property="username" name="lb" param="username"/>
<jsp:setProperty property="userpass" name="lb" param="userpass"/>

<%if(lb.getStatus()) { %>
	welcome,<jsp:getProperty property="username" name="lb"/>
	<jsp:forward page="usermenu.jsp"></jsp:forward>
<%} else {%>
		Sorry <jsp:getProperty property="username" name="lb"/>
		<a href="index.jsp">Login Again</a>
<%} %>

</body>
</html>