
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
		<form action="add_laoshi" method= "post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="cccaaa" width="35%" align="center">
		<tr>
		<td height="30">姓名:</td>
		<td><input name="Xm" type="text" size ="30"></td>
		</tr>
		<tr>
		<td height ="30">单位:</td>
		<td>
		<input name="Dw" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">职务职称:</td>
		<td>
		<input name="Zwzc" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">岗级分值:</td>
		<td>
		<input name="Gjfz" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">岗级:</td>
		<td>
		<input name="Gj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">岗位:</td>
		<td>
		<input name="Gw" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height="30">领导加分:</td>
		<td><input name="Ldjf" type="text" size ="30"></td>
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