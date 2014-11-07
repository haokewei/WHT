
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
		<form action="add_cbzz" method= "post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="cccaaa" width="35%" align="center">
		<tr>
		<td height="30">专著名称:</td>
		<td><input name="Zzmc" type="text" size ="30"></td>
		</tr>
		<tr>
		<td height ="30">出版社名称:</td>
		<td>
		<input name="Cbsmc" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">出版时间:</td>
		<td>
		<input name="Cbsj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">著者名单:</td>
		<td>
		<input name="Zzmd" type="text" size ="30">
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