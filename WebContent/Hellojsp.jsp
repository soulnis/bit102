<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
 String Id= request.getParameter("Id");
 String pwd= request.getParameter("pwd");
%>

<h1> Hello!!,<%=Id %>.</h1>
<h1>Your password is <%=pwd %>.</h1>

</body>
</html>