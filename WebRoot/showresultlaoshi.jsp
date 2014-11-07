<%@page import ="look.lookbytitle" %>
<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>老师 查询结果</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		与 <s:property value="Xm"/> 有关的老师有:<br>
		</h3>
		<s:iterator value="Laoshi" id="item"> 
    	<tr>
		<td>
		<s:a href="information_laoshi?Xm=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_laoshi?Xm=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_laoshi?Xm=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		
		
		
		
		
		</body>
</html>
