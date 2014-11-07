<%@page import ="xueshujianzhi.xueshujianzhi" %>
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
		<td height="30">学术团体名称:</td>
		<td><s:property value="Xsttmc"/></td>
		</tr>
		<tr>
		<td height="30">担任职务:</td>
		<td><s:property value="Drzw"/></td>
		</tr>
		<tr>
		<td height="30">任职开始时间:</td>
		<td><s:property value="Rzkssj"/></td>
		</tr>
		<tr>
		<td height="30">任职结束时间:</td>
		<td><s:property value="Rzjssj"/></td>
		</tr>
		<tr>
		<td height="30">姓名:</td>
		<td><s:property value="Xm"/></td>
		</tr>
		<tr>
		<td height="30">学术量分值:</td>
		<td><s:property value="Xslfz"/></td>
		</tr>
		
		</table>
		</body>
</html>