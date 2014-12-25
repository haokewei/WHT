package rjzzq;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;
public class delete_rjzzq extends ActionSupport{
	private String Rjzzqmc;
	public void setRjzzqmc(String Rjzzqmc)
	{
		this.Rjzzqmc=Rjzzqmc;
	}
	public String getRjzzqmc()
	{
		return Rjzzqmc;
	}
	public void message()
	{
		String msg="删除成功";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String Zlmc="信息提示";
		JOptionPane.showMessageDialog(null,msg,Zlmc,type);
	}
	public String execute() throws Exception
	{		
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		Statement stmt2=null;
		ResultSet rs=null;
		stmt=con.createStatement();	
		stmt2=con.createStatement();
		String sql1="select * from 软件著作权 where 软件著作权名称='"+Rjzzqmc+"'";	
		String sql2="delete  from 软件著作权 where 软件著作权名称='"+Rjzzqmc+"'";
		rs=stmt.executeQuery(sql1);
			while(rs.next())
				stmt2.executeUpdate(sql2);
		rs.close();
		stmt.close();
		stmt2.close();
		con.close();
		//message();
		return "success";
	}
}
