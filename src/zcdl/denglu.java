package zcdl;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;

public class denglu extends ActionSupport{
	private String Yhm;
	private String Mm;
	//private String Type;
	
	

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


/*
	public String getType() {
		return this.Type;
	}



	public void setType(String Type) {
		this.Type = Type;
	}
*/
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
	public void success()
	{
		String msg="��¼�ɹ�";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}

	public String execute() throws Exception{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/���гɹ�";
		con = DriverManager.getConnection(url,"root","1234");
		stmt=con.createStatement();
		
		String sql1="select * from �û� where �û���='"+Yhm+"'";	
		//String sql2="select * from ����Ա where �û���='"+Yhm+"'";
		//if(Type.equals("�û�"))
		//{
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
			success();
			return "success";
		//}
		/*
		else		// if(Type.equals("����Ա"))
		{
			rs=stmt.executeQuery(sql2);
			if(rs==null)
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
			success();
			return "success";
		}
		*/
	}
}