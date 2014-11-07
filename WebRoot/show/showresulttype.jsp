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
			<s:a href="UpdateAction?title=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		

	
		</body>
</html>
