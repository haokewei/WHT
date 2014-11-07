<%@page import ="keyanxiangmu.keyanxiangmu" %>
<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>information</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<tr>
		<td height="30">项目名称:</td>
		<td><s:property value="Xmmc"/></td>
		</tr>
		<tr>
		<td height="30">项目来源:</td>
		<td><s:property value="Xmly"/></td>
		</tr>
		<tr>
		<td height="30">项目负责人:</td>
		<td><s:property value="Xmfzr"/></td>
		</tr>
		<tr>
		<td height="30">开始时间:</td>
		<td><s:property value="Kssj"/></td>
		</tr>
		<tr>
		<td height="30">结束时间:</td>
		<td><s:property value="Jssj"/></td>
		</tr>
		<tr>
		<td height="30">合同款:</td>
		<td><s:property value="Htk"/></td>
		</tr>
		<tr>
		<td height="30">类型:</td>
		<td><s:property value="Lx"/></td>
		</tr>
		<tr>
		<td height="30">鉴定验收时间:</td>
		<td><s:property value="Jdyssj"/></td>
		</tr>
		<tr>
		<td height="30">鉴定验收组织单位:</td>
		<td><s:property value="Jdyszzdw"/></td>
		</tr>
		<tr>
		<td height="30">课题合同号:</td>
		<td><s:property value="Kthth"/></td>
		</tr>
		<tr>
		<td height="30">经费卡号:</td>
		<td><s:property value="Jfkh"/></td>
		</tr>
		<tr>
		<td height="30">备注:</td>
		<td><s:property value="Bz"/></td>
		</tr>
		<tr>
		<td height="30">工作量分值:</td>
		<td><s:property value="Gzlfz"/></td>
		</tr>
		
		</table>
		</body>
</html>