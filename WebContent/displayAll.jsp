

                        
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="dto.Book"%>
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
	<jsp:setProperty property="*" name="bb"/>
	<%List<String> list=bb.display(); %>
	
	<form action="displaySelectedBooks.jsp" method="post">
	
	<%for(String string:list) {%>
	<input type="checkbox" name="books" value="<%=string%>"><%=string%>
			<br/>
		<%} %>
		<input type="submit" value="Display">
	</form>
	

</body>
</html>