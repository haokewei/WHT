package kyjf;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class delete_kyjf extends ActionSupport{
	private String Bzf;
	
	public void setBzf(String Bzf)
	{
		this.Bzf=Bzf;
	}
	public String getBzf()
	{
		return Bzf;
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
		String temp = new String(Bzf.getBytes("ISO-8859-1"),"UTF-8");
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		stmt=con.createStatement();
		String sql1="delete  from 科研经费 where 标识符='"+temp+"'";
		stmt.executeUpdate(sql1);
		stmt.close();
		con.close();
		//message();
		return "success";
	}
}
