package cbzz;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;
public class delete_cbzz extends ActionSupport{
	private String Zzmc;
	public void setZzmc(String Zzmc)
	{
		this.Zzmc=Zzmc;
	}
	public String getZzmc()
	{
		return Zzmc;
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
		String temp = new String(Zzmc.getBytes("ISO-8859-1"),"UTF-8");
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		Statement stmt2=null;
		ResultSet rs=null;
		stmt=con.createStatement();
		stmt2=con.createStatement();
		String sql1="select * from ����ר�� where ר������='"+temp+"'";	
		String sql2="delete  from ����ר�� where ר������='"+temp+"'";
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
