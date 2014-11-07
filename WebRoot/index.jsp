<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>科研成果管理系统</title>
    <style >
    body{background :url(img/bj.jpg)}
    </style>
  </head>
  	<body bgcolor="white">
  		                ************* 请选择查询方式**************************请选择添加方式****************************** 生成报表*************
		<table width="33%" align="left" bgcolor="blue"> 
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="lookbypeople.jsp">按人员</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="lookbytime.jsp">按时间</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="lookbytitle.jsp">按名称</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="lookbytype.jsp">按类别</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="looklaoshi.jsp">查找老师</a>
			</td>
			</tr>
		</table>
		
		
			
			<table width="33%" align="left" bgcolor="blue"> 
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="add_cbzz.jsp">添加出版专著信息</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="add_huojiang.jsp">添加获奖信息</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="add_kyxm.jsp">添加科研项目信息</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="add_xsjz.jsp">添加学术兼职信息</a>
			</td>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="add_zhuanli.jsp">添加专利信息</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="add_laoshi.jsp">添加教师信息</a>
			</td>
			</tr>

		</table>
		<table width="33%" align="left" bgcolor="blue"> 
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="print_gzl.jsp">年度工作量报表</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="lookbytime.jsp">xxxxx</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="lookbytitle.jsp">xxxxx</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="lookbytype.jsp">xxxxx</a>
			</td>
			</tr>
			<tr height="20" bgcolor="white" align="center">
			<td>
				<a href="looklaoshi.jsp">xxxxxx</a>
			</td>
			</tr>
		</table>
		
	</body>
  </html>
 