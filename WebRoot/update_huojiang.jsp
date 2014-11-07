<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>SHOW_BOOK</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<form action="update_huojiang" method="post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<tr>
		<td height="30">项目名称:</td>
		<td><input type="hidden" name="Xmmc" value="<s:property value="Xmmc"/>"><s:property value="Xmmc"/></td>
		</tr>
		<tr>
		<td height="30">获奖类别:</td>
		<td><input type="text" name="Hjlb" value="<s:property value="Hjlb"/>"></td>
		</tr>
		<tr>
		<td height="30">获奖等级:</td>
		<td><input type="text" name="Hjdj" value="<s:property value="Hjdj"/>"></td>
		</tr>
		<tr>
		<td height="30">获奖时间:</td>
		<td><input type="text" name="Hjsj" value="<s:property value="Hjsj"/>"></td>
		</tr>
		<tr>
		<td height="30">获奖人员名单:</td>
		<td><input type="text" name="Hjrymd" value="<s:property value="Hjrymd"/>"></td>
		</tr>
		<tr>
		<td height="30">工作量分值:</td>
		<td><input type="text" name="Gzlfz"value="<s:property value="Gzlfz"/>"></td>
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