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
		String msg="�û����Ѵ���";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public void wrong2()
	{
		String msg="�����������벻һ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public void success()
	{
		String msg="ע��ɹ�";
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
		
		String sql2="insert into �û� "+"(�û���,����)"+"value("+"'"+Yhm+"'"+","+"'"+Mm+"'"+")";
		stmt.executeUpdate(sql2);

		stmt.close();
		con.close();
		success();
		return "success";		
	}
}