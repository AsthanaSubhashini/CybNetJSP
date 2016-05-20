<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bb" class="com.BookBean" />
	<jsp:setProperty property="bookid" name="bb" param="bookid" />
	<jsp:setProperty property="booktitle" name="bb" param="booktitle" />
	<jsp:setProperty property="bookreview" name="bb" param="bookreview" />
	<jsp:setProperty property="bookprice" name="bb" param="bookprice" />
	<jsp:setProperty property="bookauthor" name="bb" param="bookauthor" />

	<%
		if (bb.insertBook()) {
	%>
		book inserted
		<jsp:forward page="usermenu.jsp"></jsp:forward>
	
	<%
		} else {
	%>
	book not inserted
	<%
		}
	%>
</body>
</html>