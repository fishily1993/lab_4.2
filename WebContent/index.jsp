<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
</head>
<body>
   <s:form action="books" method="post">
      <s:textfield label="Author" name="Name"/><br/>
      <s:submit type="submit" value="Login" />		
   </s:form>
</body>
</html>
<!--change for C4-->
