<%@page import ="look.lookbytype" %>
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
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		<s:property value="Type"/> 有:<br>
		</h3>
		<s:iterator value="Xmlb1" id="item"> 
		
		<%
		String Type=request.getParameter("Type");
		if(Type.equals("出版专著")){ %>
    	<tr>
		<td>
		<s:a href="information_cbzz?Zzmc=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_cbzz?Zzmc=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_cbzz?Zzmc=%{item}">更新</s:a>
		</td>
		</tr>
		<%} else if(Type.equals("获奖")) {%>
		<tr>
		<td>
		<s:a href="information_huojiang?Xmmc=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_huojiang?Xmmc=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_huojiang?Xmmc=%{item}">更新</s:a>
		</td>
		</tr>
		<%} else if(Type.equals("科研项目")) {%>
		<tr>
		<td>
		<s:a href="information_kyxm?Xmmc=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_kyxm?Xmmc=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_kyxm?Xmmc=%{item}">更新</s:a>
		</td>
		</tr>
		<%} else if(Type.equals("专利")) {%>
		<tr>
		<td>
		<s:a href="information_zhuanli?Zlmc=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_zhuanli?Zlmc=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_zhuanli?Zlmc=%{item}">更新</s:a>
		</td>
		</tr>
		<%} else if(Type.equals("学术兼职")) {%>
		<tr>
		<td>
		<s:a href="information_xsjz?Bzf=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_xsjz?Bzf=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_xsjz?Bzf=%{item}">更新</s:a>
		</td>
		</tr>
		<%} %>
		
		</s:iterator>		
		</table>
		

	
		</body>
</html>
