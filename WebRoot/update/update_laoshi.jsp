<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>更新老师信息</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<form action="update_laoshi" method="post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<tr>
		<td height="30">姓名:</td>
		<td><input type="hidden" name="Xm" value="<s:property value="Xm"/>"><s:property value="Xm"/></td>
		</tr>
		<tr>
		<td height="30">单位:</td>
		<td><input type="text" name="Dw" value="<s:property value="Dw"/>"></td>
		</tr>
		<tr>
		<td height="30">职务职称:</td>
		<td><input type="text" name="Zwzc" value="<s:property value="Zwzc"/>"></td>
		</tr>
		<tr>
		<td height="30">岗级分值:</td>
		<td><input type="text" name="Gjfz" value="<s:property value="Gjfz"/>"></td>
		</tr>
		<tr>
		<td height="30">岗级:</td>
		<td><input type="text" name="Gj" value="<s:property value="Gj"/>"></td>
		</tr>
		<tr>
		<td height="30">岗位:</td>
		<td><input type="text" name="Gw" value="<s:property value="Gw"/>"></td>
		</tr>
		<tr>
		<td height="30">领导加分:</td>
		<td><input type="text" name="Ldjf" value="<s:property value="Ldjf"/>"></td>
		</tr>
		<tr>
		<td colspan="2" align="center">
			<input type="submit" value="确定" size="12">
			&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="取消" size="12">
		</td>
		</tr>
		</table>
		</form>
		</body>
</html>