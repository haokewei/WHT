package xueshujianzhi;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class add_xsjz extends ActionSupport{
	private String Xsttmc;
	private String Drzw;
	private String Rzkssj;
	private String Rzjssj;
	private String Xm;
	private float Xslfz;
	private String Bzf;
	
	public void setXsttmc (String Xsttmc) throws Exception
	{
		this.Xsttmc = Xsttmc;
	}
	public String getXsttmc()
	{
		return this.Xsttmc;
	}
	
	public void setDrzw (String Drzw)
	{
		this.Drzw = Drzw;
	}
	public String getDrzw()
	{
		return this.Drzw;
	}
	
	public void setRzkssj (String Rzkssj)
	{
		this.Rzkssj = Rzkssj;
	}
	public String getRzkssj()
	{
		return this.Rzkssj;
	}
	
	public void setRzjssj (String Rzjssj)
	{
		this.Rzjssj = Rzjssj;
	}
	public String getRzjssj()
	{
		return this.Rzjssj;
	}
	
	public void setXm (String Xm)
	{
		this.Xm = Xm;
	}
	public String getXm()
	{
		return this.Xm;
	}
	
	public void setXslfz (float Xslfz)
	{
		this.Xslfz = Xslfz;
	}
	public float getXslfz()
	{
		return this.Xslfz;
	}
	
	public void setBzf ()
	{
		this.Bzf = Xsttmc + " " + Xm;
	}
	public String getBzf()
	{
		return this.Bzf;
	}
	
	public void wrong1()
	{
		String msg="ѧ����ְ��Ϣ����������ֹ���";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="ѧ����ְ��Ϣ�Ѵ��ڣ����ʧ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void success()
	{
		String msg="ѧ����ְ��Ϣ��ӳɹ�";
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
		String sql1="select * from ѧ����ְ where ѧ����������='"+Xsttmc+"' AND ����='"+Xm+"'";
		String sql2="insert into ѧ����ְ "+"(ѧ����������,����ְ��,��ְ��ʼʱ��,��ְ����ʱ��,����,ѧ������ֵ,��ʶ��)"+"value("+"'"+Xsttmc+"'"+","+"'"+Drzw+"'"+","+"'"+Rzkssj+"'"+","+"'"+Rzjssj+"'"+","+"'"+Xm+"'"+","+"'"+Xslfz+"'"+","+"'"+Bzf+"'"+") ";		
		if(Xsttmc==null||Drzw==null||Rzkssj==null||Rzjssj==null||Xm==null)
		{
			wrong1();
			stmt.close();
			con.close();
			return "incomplete";
		}
		else
		{
			rs=stmt.executeQuery(sql1);
			if(rs.next())
			{
				wrong2();
				rs.close();
				stmt.close();
				con.close();
				return "error";
			}
			else
			{
				stmt.executeUpdate(sql2);
				rs.close();
				stmt.close();
				con.close();
				success();
				return "success";
			}
		}
	}
}
