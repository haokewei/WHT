package laoshi;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;
public class delete_laoshi extends ActionSupport{
	private String Xm;
	public void setXm(String Xm)
	{
		this.Xm=Xm;
	}
	public String getXm()
	{
		return Xm;
	}
	public void message()
	{
		String msg="删除成功";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public String execute() throws Exception
	{		
		String temp=new String();
		Connection con=null;
		Statement stmt=null;
		Statement stmt2=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/科研管理";
		con = DriverManager.getConnection(url,"root","tx940614");
		stmt=con.createStatement();
		stmt2=con.createStatement();
		String sql1="select * from 老师 where 姓名='"+Xm+"'";	
		String sql2="delete  from 老师 where 姓名='"+Xm+"'";
		rs=stmt.executeQuery(sql1);
			while(rs.next())
				stmt2.executeUpdate(sql2);
		rs.close();
		stmt.close();
		stmt2.close();
		con.close();
		message();
		return "success";
	}
}
