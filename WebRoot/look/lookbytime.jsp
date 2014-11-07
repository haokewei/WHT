<%@page import ="java.util.ArrayList" %>
<%@page import ="look.lookbytime" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>look by time</title>
	</head>
	<body bgcolor="white">
		<hr noshade>
		<div align="center">
			<form action="lookbytimeaction" method="post">
				<table border="2" cellspacing="0" cellpadding="0" width="40%" align="center">
				<tr align="center">
				<td align="center" height="130">
				<p>请输入时间</p>
				时间：<input name="Time" type="text" size="30"><br>
				</td>
				</tr>
				<tr>
				<td align="center">
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
