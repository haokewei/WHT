package cbzz;

import com.opensymphony.xwork2.ActionSupport;

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
		String temp=new String();
		Connection con=null;
		Statement stmt=null;
		Statement stmt2=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/���гɹ�";
		con = DriverManager.getConnection(url,"root","1234");
		stmt=con.createStatement();
		stmt2=con.createStatement();
		String sql1="select * from ����ר�� where ר������='"+Zzmc+"'";	
		String sql2="delete  from ����ר�� where ר������='"+Zzmc+"'";
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
