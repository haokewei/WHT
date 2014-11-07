
<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>ADD</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<div align="center">
		<form action="add_xsjz" method= "post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="cccaaa" width="35%" align="center">
		<tr>
		<td height="30">学术团体名称:</td>
		<td><input name="Xsttmc" type="text" size ="30"></td>
		</tr>
		<tr>
		<td height ="30">担任职务:</td>
		<td>
		<input name="Drzw" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">任职开始时间:</td>
		<td>
		<input name="Rzkssj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">任职结束时间:</td>
		<td>
		<input name="Rzjssj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">姓名:</td>
		<td>
		<input name="Xm" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">学术量分值:</td>
		<td>
		<input name="Xslfz" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td colspan="2" align="center">
		<input type="submit" value="添加" size="12">
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="取消" size="12">
		</td>
		</tr>
		</table>
		</form>
		</div>
		</body>
</html>