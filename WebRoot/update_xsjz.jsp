<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>SHOW</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<form action="update_xsjz" method="post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<tr>
		<td height="30">标识符:</td>
		<td><input type="hidden" name="Bzf" value="<s:property value="Bzf"/>"><s:property value="Bzf"/></td>
		</tr>
		<tr>
		<td height="30">学术团体名称:</td>
		<td><input type="text" name="Xsttmc" value="<s:property value="Xsttmc"/>"></td>
		</tr>
		<tr>
		<td height="30">担任职务:</td>
		<td><input type="text" name="Drzw" value="<s:property value="Drzw"/>"></td>
		</tr>
		<tr>
		<td height="30">任职开始时间:</td>
		<td><input type="text" name="Rzkssj" value="<s:property value="Rzkssj"/>"></td>
		</tr>
		<tr>
		<td height="30">任职结束时间:</td>
		<td><input type="text" name="Rzjssj" value="<s:property value="Rzjssj"/>"></td>
		</tr>
		<tr>
		<td height="30">姓名:</td>
		<td><input type="text" name="Xm" value="<s:property value="Xm"/>"></td>
		</tr>
		<tr>
		<td height="30">学术量分值:</td>
		<td><input type="text" name="Xslfz"value="<s:property value="Xslfz"/>"></td>
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