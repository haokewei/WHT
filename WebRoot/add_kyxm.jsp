
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
		<form action="add_kyxm" method= "post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="cccaaa" width="35%" align="center">
		<tr>
		<td height="30">项目名称:</td>
		<td><input name="Xmmc" type="text" size ="30"></td>
		</tr>
		<tr>
		<td height ="30">项目来源:</td>
		<td>
		<input name="Xmly" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">项目负责人:</td>
		<td>
		<input name="Xmfzr" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">开始时间:</td>
		<td>
		<input name="Kssj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">结束时间:</td>
		<td>
		<input name="Jssj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">合同款:</td>
		<td>
		<input name="Htk" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height="30">类型:</td>
		<td><input name="Lx" type="text" size ="30"></td>
		</tr>
		<tr>
		<td height ="30">鉴定验收时间:</td>
		<td>
		<input name="Jdyssj" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">鉴定验收组织单位:</td>
		<td>
		<input name="Jdyszzdw" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">课题合同号:</td>
		<td>
		<input name="Kthth" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">经费卡号:</td>
		<td>
		<input name="Jfkh" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">备注:</td>
		<td>
		<input name="Bz" type="text" size ="30">
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