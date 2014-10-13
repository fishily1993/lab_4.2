<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>The Author's Book</title>
</head>
<body>
<table>
	<s:iterator value="al">
	<tr>
		<td><a href='showBook.action?Title=<s:property />'><s:property /></a></td>
	</tr>
   	</s:iterator>
</table>
   
</body>
</html>