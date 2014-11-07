<%@page import ="zhuanli.zhuanli" %>
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
		<td height="30">专利名称:</td>
		<td><s:property value="Zlmc"/></td>
		</tr>
		<tr>
		<td height="30">专利编号:</td>
		<td><s:property value="Zlbh"/></td>
		</tr>
		<tr>
		<td height="30">专利权人:</td>
		<td><s:property value="Zlqr"/></td>
		</tr>
		<tr>
		<td height="30">授予单位:</td>
		<td><s:property value="Sydw"/></td>
		</tr>
		<tr>
		<td height="30">时间:</td>
		<td><s:property value="Sj"/></td>
		</tr>
		<tr>
		<td height="30">人员名单:</td>
		<td><s:property value="Rymd"/></td>
		</tr>
		<tr>
		<td height="30">工作量分值:</td>
		<td><s:property value="Gzlfz"/></td>
		</tr>
		
		</table>
		</body>
</html>