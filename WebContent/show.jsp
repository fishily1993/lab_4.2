<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='2'>
	<thead>
		<tr>
			<th>ISBN</th>
			<th>Title</th>
			<th>Publisher</th>
			<th>Price</th>
		</tr>
	</thead>
	<tbody>
	<tr>
			<td><s:property value = "ISBN"/></td>
			<td><s:property value = "Title"/></td>
			<td><s:property value = "Publisher"/></td>
			<td><s:property value = "Price"/></td>	
	</tr>
	</tbody>
</table>
<s:property value = "PublishiData"/>
</body>
</html>