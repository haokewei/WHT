
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
		<form action="add_zhuanli" method= "post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="cccaaa" width="35%" align="center">
		<tr>
		<td height="30">专利名称:</td>
		<td><input name="Zlmc" type="text" size ="30"></td>
		</tr>
		<tr>
		<td height ="30">专利编号:</td>
		<td>
		<input name="Zlbh" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">专利权人:</td>
		<td>
		<input name="Zlqr" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">授予单位:</td>
		<td>
		<input name="Sydw" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">时间:</td>
		<td>
		<input name="Sj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">人员名单:</td>
		<td>
		<input name="Rymd" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">工作量分值:</td>
		<td>
		<input name="Gzlfz" type="text" size ="30">
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