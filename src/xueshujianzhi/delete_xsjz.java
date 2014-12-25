package xueshujianzhi;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class delete_xsjz extends ActionSupport{
	private String Bzf;
	
	
	public void setBzf (String Bzf)
	{
		this.Bzf = Bzf;
	}
	public String getBzf()
	{
		return this.Bzf;
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
		Bzf=getBzf();
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		stmt=con.createStatement();	
		String sql1="delete  from 学术兼职 where 标识符='"+Bzf+"'";
		stmt.executeUpdate(sql1);
		stmt.close();
		con.close();
		//message();
		return "success";
	}
}
