<%@page import ="look.lookbyadvanced" %>
<%@page import ="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>SHOW</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<%
		if(request.getAttribute("F1").equals("1")){%> 
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		科研项目:<br>
		</h3>
		<s:iterator value="Xmlb1" id="item">
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
		</s:iterator>	
		</table>	
		<%}
		if(request.getAttribute("F3").equals("1")) {%>
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		获奖的项目:<br>
		</h3>
		<s:iterator value="Xmlb3" id="item"> 
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
		</s:iterator>		
		</table>
		<%}
		if(request.getAttribute("F4").equals("1")) {%>
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		学术兼职:<br>
		</h3>
		<s:iterator value="Xmlb4" id="item"> 
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
		</s:iterator>		
		</table>
		<%} 
		if(request.getAttribute("F5").equals("1")) {%>
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		专利:<br>
		</h3>
		<s:iterator value="Xmlb5" id="item"> 
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
		</s:iterator>		
		</table>
		<%}
		if(request.getAttribute("F2").equals("1")) {%>
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		出版的专著:<br>
		</h3>
		<s:iterator value="Xmlb2" id="item"> 
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
		</s:iterator>	
		</table>	
		<%} if(request.getAttribute("F1").equals("") && request.getAttribute("F2").equals("") && 
				request.getAttribute("F3").equals("") && request.getAttribute("F4").equals("") && 
				request.getAttribute("F5").equals("")){%>
			<div align="center">
			抱歉没有相关结果！
		<%} %>
		</body>
</html>