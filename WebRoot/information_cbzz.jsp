<%@page import ="cbzz.cbzz" %>
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
		<td height="30">专著名称:</td>
		<td><s:property value="Zzmc"/></td>
		</tr>
		<tr>
		<td height="30">出版社名称:</td>
		<td><s:property value="Cbsmc"/></td>
		</tr>
		<tr>
		<td height="30">出版时间:</td>
		<td><s:property value="Cbsj"/></td>
		</tr>
		<tr>
		<td height="30">著者名单:</td>
		<td><s:property value="Zzmd"/></td>
		</tr>
		<tr>
		<td height="30">工作量分值:</td>
		<td><s:property value="Gzlfz"/></td>
		</tr>
		
		</table>
		</body>
</html>