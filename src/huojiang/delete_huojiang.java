package huojiang;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;
public class delete_huojiang extends ActionSupport{
	private String Xmmc;
	public void setXmmc(String Xmmc)
	{
		this.Xmmc=Xmmc;
	}
	public String getXmmc()
	{
		return Xmmc;
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
		
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		Statement stmt2=null;
		ResultSet rs=null;
		stmt=con.createStatement();
		stmt2=con.createStatement();
		String sql1="select * from 获奖 where 项目名称='"+Xmmc+"'";	
		String sql2="delete  from 获奖 where 项目名称='"+Xmmc+"'";
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
