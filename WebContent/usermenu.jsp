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
welcome,<jsp:getProperty property="username" name="lb"/>
<br/>
<a href="insertBookform.jsp">Insert Book</a>
<a href="searchform.jsp">Search Book</a>
<a href="displayAll.jsp">Display Books</a>
<a href="removeform.jsp">Remove Book </a>
<a href="addReview.jsp">Add Book Review </a>

</body>
</html>