package zcdl;
import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class zhuce extends ActionSupport{
	private String Yhm;
	private String Mm;
	private String Qrmm;
	
	

	public String getYhm() {
		return this.Yhm;
	}



	public void setYhm(String Yhm) {
		this.Yhm = Yhm;
	}



	public String getMm() {
		return this.Mm;
	}



	public void setMm(String Mm) {
		this.Mm = Mm;
	}



	public String getQrmm() {
		return this.Qrmm;
	}



	public void setQrmm(String Qrmm) {
		this.Qrmm = Qrmm;
	}

	public void wrong1()
	{
		String msg="用户名已存在";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public void wrong2()
	{
		String msg="两次密码输入不一致";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public void success()
	{
		String msg="注册成功";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}

	public String execute() throws Exception{
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();	
		
		String sql1="select * from 用户 where 用户名='"+Yhm+"'";		
		rs=stmt.executeQuery(sql1);
		if(rs.next())
		{
			wrong1();
			return "error";
		}
		rs.close();
		
		if(!Mm.equals(Qrmm))
		{
			wrong2();
			return "error";
		}
		
		String sql2="insert into 用户 "+"(用户名,密码)"+"value("+"'"+Yhm+"'"+","+"'"+Mm+"'"+")";
		stmt.executeUpdate(sql2);

		stmt.close();
		con.close();
		success();
		return "success";		
	}
}