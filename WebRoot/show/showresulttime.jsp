<%@page import ="look.lookbytime" %>
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
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		<s:property value="Time"/> 的科研项目有:<br>
		</h3>
		<s:iterator value="Xmlb1" id="item"> 
    	<tr>
		<td>
		<s:a href="informationAction?title=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteAction?title=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_kyxm?Xmmc=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		<s:property value="Time"/> 的出版专著有:<br>
		</h3>
		<s:iterator value="Xmlb2" id="item"> 
    	<tr>
		<td>
		<s:a href="informationAction?title=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteAction?title=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_cbzz?Zzmc=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		<s:property value="Time"/> 的获奖项目有:<br>
		</h3>
		<s:iterator value="Xmlb3" id="item"> 
    	<tr>
		<td>
		<s:a href="informationAction?title=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteAction?title=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_huojiang?Xmmc=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		<s:property value="Time"/> 的学术兼职有:<br>
		</h3>
		<s:iterator value="Xmlb4" id="item"> 
    	<tr>
		<td>
		<s:a href="informationAction?title=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteAction?title=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_xsjz?Bzf=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		<s:property value="Time"/> 的专利有:<br>
		</h3>
		<s:iterator value="Xmlb5" id="item"> 
    	<tr>
		<td>
		<s:a href="informationAction?title=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteAction?title=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_zhuanli?Zlmc=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		
		
		
		</body>
</html>
