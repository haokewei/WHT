package keyanxiangmu;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;

public class delete_kyxm extends ActionSupport{
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
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/科研管理";
		con = DriverManager.getConnection(url,"root","tx940614");
		stmt=con.createStatement();
		String sql1="delete  from 科研项目 where 项目名称='"+Xmmc+"'";
		stmt.executeUpdate(sql1);
		stmt.close();
		con.close();
		message();
		return "success";
	}
}
