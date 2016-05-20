<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="insert.jsp">
		BookId: <input type="text" name="bookid">
		<br/>
		BookTitle: <input type="text" name="booktitle">
		<br/><br/>
		BookReview: <input type="text" name="bookreview">
		<br/><br/>
		BookPrice: <input type="text" name="bookprice">
		<br/><br/>
		BookAuthor: <input type="text" name="bookauthor">
		<br/><br/>
		
		<input type="submit" value="Insert"> 

</form>

</body>
</html>