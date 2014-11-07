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
		<form action="update_kyxm" method="post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<tr>
		<td height="30">项目名称:</td>
		<td><input type="hidden" name="Xmmc" value="<s:property value="Xmmc"/>"><s:property value="Xmmc"/></td>
		</tr>
		<tr>
		<td height="30">项目来源:</td>
		<td><input type="text" name="Xmly" value="<s:property value="Xmly"/>"></td>
		</tr>
		<tr>
		<td height="30">项目负责人:</td>
		<td><input type="text" name="Xmfzr" value="<s:property value="Xmfzr"/>"></td>
		</tr>
		<tr>
		<td height="30">开始时间:</td>
		<td><input type="text" name="Kssj" value="<s:property value="Kssj"/>"></td>
		</tr>
		<tr>
		<td height="30">结束时间:</td>
		<td><input type="text" name="Jssj" value="<s:property value="Jssj"/>"></td>
		</tr>
		<tr>
		<td height="30">合同款(万元):</td>
		<td><input type="text" name="Htk" value="<s:property value="Htk"/>"></td>
		</tr>
		<tr>
		<tr>
		<td height="30">类型:</td>
		<td><input type="text" name="Lx" value="<s:property value="Lx"/>"></td>
		</tr>
		<tr>
		<tr>
		<td height="30">鉴定验收时间:</td>
		<td><input type="text" name="Jdyssj" value="<s:property value="Jdyssj"/>"></td>
		</tr>
		<tr>
		<tr>
		<td height="30">鉴定验收组织单位:</td>
		<td><input type="text" name="Jdyszzdw" value="<s:property value="Jdyszzdw"/>"></td>
		</tr>
		<tr>
		<tr>
		<td height="30">课题合同号:</td>
		<td><input type="text" name="Kthth" value="<s:property value="Kthth"/>"></td>
		</tr>
		<tr>
		<tr>
		<td height="30">经费卡号:</td>
		<td><input type="text" name="Jfkh" value="<s:property value="Jfkh"/>"></td>
		</tr>
		<tr>
		<tr>
		<td height="30">课题合同号:</td>
		<td><input type="text" name="Kthth" value="<s:property value="Kthth"/>"></td>
		</tr>
		<tr>
		<td height="30">备注:</td>
		<td><input type="text" name="Bz"value="<s:property value="Bz"/>"></td>
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