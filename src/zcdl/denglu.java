package zcdl;
import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class denglu extends ActionSupport{
	private String Yhm;
	private String Mm;
	private String Type;
	
	

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



	public String getType() {
		return this.Type;
	}



	public void setType(String Type) {
		this.Type = Type;
	}

	public void wrong1()
	{
		String msg="�û���������";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public void wrong2()
	{
		String msg="�û������������";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}

	public String execute() throws Exception{
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();	
		
		String sql1="select * from �û� where �û���='"+Yhm+"'";	
		String sql2="select * from ����Ա where �û���='"+Yhm+"'";
		if(Type.equals("�û�"))
		{
			rs=stmt.executeQuery(sql1);
			if(!rs.next())
			{
				rs.close();
				stmt.close();
				con.close();
				wrong1();
				return "error";
			}
			if(!Mm.equals(rs.getString("����")))
			{
				rs.close();
				stmt.close();
				con.close();
				wrong2();
				return "error";
			}
			rs.close();
			stmt.close();
			con.close();
			return "success";
		}
		
		else		// if(Type.equals("����Ա"))
		{
			rs=stmt.executeQuery(sql2);
			if(!rs.next())
			{
				rs.close();
				stmt.close();
				con.close();
				wrong1();
				return "error";
			}
			if(!Mm.equals(rs.getString("����")))
			{
				rs.close();
				stmt.close();
				con.close();
				wrong2();
				return "error";
			}
			rs.close();
			stmt.close();
			con.close();
			return "success2";
		}
		
	}
}