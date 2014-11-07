<%@page import ="laoshi.laoshi" %>
<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>information</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<tr>
		<td height="30">姓名:</td>
		<td><s:property value="Xm"/></td>
		</tr>
		<tr>
		<td height="30">单位:</td>
		<td><s:property value="Dw"/></td>
		</tr>
		<tr>
		<td height="30">职务职称:</td>
		<td><s:property value="Zwzc"/></td>
		</tr>
		<tr>
		<td height="30">岗级:</td>
		<td><s:property value="Gj"/></td>
		</tr>
		<tr>
		<td height="30">岗级分值:</td>
		<td><s:property value="Gjfz"/></td>
		</tr>
		<tr>
		<td height="30">岗位:</td>
		<td><s:property value="Gw"/></td>
		</tr>
		<tr>
		<td height="30">领导加分:</td>
		<td><s:property value="Ldjf"/></td>
		</tr>
		
		
		</table>
		</body>
</html>