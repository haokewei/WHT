package gjhz;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;
public class delete_gjhz extends ActionSupport{
	private String Bgmc;;
	public void setBgmc(String Bgmc)
	{
		this.Bgmc=Bgmc;
	}
	public String getBgmc()
	{
		return Bgmc;
	}
	public void message()
	{
		String msg="ɾ���ɹ�";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
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
		String sql1="select * from ���ʺ��� where ��������='"+Bgmc+"'";	
		String sql2="delete  from ���ʺ��� where ��������='"+Bgmc+"'";
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