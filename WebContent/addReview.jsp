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
	<jsp:getProperty property="booktitle" name="bb" />


	<form method="post" action="review.jsp">
		Enter Book Title:<input type="text" name="booktitle"> <br />
		Enter Book Review: <input type="text" name="bookreview"> <br />

		<input type="submit" value="Add">
	</form>

</body>
</html>