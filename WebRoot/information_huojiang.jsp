<%@page import ="huojiang.huojiang" %>
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
		<td height="30">项目名称:</td>
		<td><s:property value="Xmmc"/></td>
		</tr>
		<tr>
		<td height="30">获奖类别:</td>
		<td><s:property value="Hjlb"/></td>
		</tr>
		<tr>
		<td height="30">获奖时间:</td>
		<td><s:property value="Hjsj"/></td>
		</tr>
		<tr>
		<td height="30">获奖人员名单:</td>
		<td><s:property value="Hjrymd"/></td>
		</tr>
		<tr>
		<td height="30">工作量分值:</td>
		<td><s:property value="Gzlfz"/></td>
		</tr>
		
		</table>
		</body>
</html>