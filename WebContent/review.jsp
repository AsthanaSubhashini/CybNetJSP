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
<jsp:setProperty property="booktitle" name="bb" param="booktitle"/>
<jsp:setProperty property="bookreview" name="bb" param="bookreview"/>

<%if(bb.review()) {%>
	book review added
	<jsp:forward page="usermenu.jsp"></jsp:forward>

<%}else { %>
	adding review failed;
	<jsp:forward page="addReview.jsp"></jsp:forward>
	
<%} %>


</body>
</html>