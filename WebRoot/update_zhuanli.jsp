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
		<form action="update_zhuanli" method="post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<tr>
		<td height="30">专利名称:</td>
		<td><input type="hidden" name="Zlmc" value="<s:property value="Zlmc"/>"><s:property value="Zlmc"/></td>
		</tr>
		<tr>
		<td height="30">专利编号:</td>
		<td><input type="text" name="Zlbh" value="<s:property value="Zlbh"/>"></td>
		</tr>
		<tr>
		<td height="30">专利权人:</td>
		<td><input type="text" name="Zlqr" value="<s:property value="Zlqr"/>"></td>
		</tr>
		<tr>
		<td height="30">授予单位:</td>
		<td><input type="text" name="Sydw" value="<s:property value="Sydw"/>"></td>
		</tr>
		<tr>
		<td height="30">时间:</td>
		<td><input type="text" name="Sj" value="<s:property value="Sj"/>"></td>
		</tr>
		<tr>
		<td height="30">人员名单:</td>
		<td><input type="text" name="Rymd" value="<s:property value="Rymd"/>"></td>
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