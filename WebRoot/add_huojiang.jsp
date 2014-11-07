
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
		<form action="add_huojiang" method= "post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="cccaaa" width="35%" align="center">
		<tr>
		<td height="30">项目名称:</td>
		<td><input name="Xmmc" type="text" size ="30"></td>
		</tr>
		<tr>
		<td height ="30">获奖类别:</td>
		<td>
		<input name="Hjlb" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">获奖等级:</td>
		<td>
		<input name="Hjdj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">获奖时间:</td>
		<td>
		<input name="Hjsj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">获奖人员名单:</td>
		<td>
		<input name="Hjrymd" type="text" size ="30">
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