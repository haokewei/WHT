
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
		<form action="update_cbzz" method="post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<tr>
		<td height="30">专著名称:</td>
		<td><input type="hidden" name="Zzmc" value="<s:property value="Zzmc"/>"><s:property value="Zzmc"/></td>
		</tr>
		<tr>
		<td height="30">出版社名称:</td>
		<td><input type="text" name="Cbsmc" value="<s:property value="Cbsmc"/>"></td>
		</tr>
		<tr>
		<td height="30">出版时间:</td>
		<td><input type="text" name="Cbsj" value="<s:property value="Cbsj"/>"></td>
		</tr>
		<tr>
		<td height="30">著者名单:</td>
		<td><input type="text" name="Zzmd" value="<s:property value="Zzmd"/>"></td>
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