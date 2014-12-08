<%@page import ="java.util.ArrayList" %>
<%@page import ="look.lookbyadvanced" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>look</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<div align="center">
			<form action="lookbyadvancedaction" method="post">
				<table border="2" cellspacing="0" cellpadding="0" width="50%" align="center">
				<tr><td align="center">人员名称：</td><td><input type="text" name="Name"></td></tr>
				<tr><td align="center">项目名称：</td><td><input type="text" name="Title"></td></tr>
				<tr><td align="center">时间：</td><td><input type="text" name="Time"></td></tr>
				<tr><td align="center">种类：</td>
				<td><SELECT name="Type">
					<option value="">请选择</option>
					<option value="出版专著">出版专著</option>
					<option value="科研项目">科研项目</option>
					<option value="获奖">获奖</option>
					<option value="学术兼职">学术兼职</option>
					<option value="专利">专利</option>
				</SELECT>
				</td>
				</tr>
				<tr>
				<td colspan="2" align="center">
				<input type="submit" value="查询">
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="取消">
				</td>
				</tr>
				</table>
			</form>
		</div>
	</body>
</html>