package xueshujianzhi;

import com.opensymphony.xwork2.ActionSupport;

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
		String msg="学术兼职信息不完整，禁止添加";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="学术兼职信息已存在，添加失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void success()
	{
		String msg="学术兼职信息添加成功";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	
	public String execute() throws Exception{
		setBzf();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/科研管理";
		con = DriverManager.getConnection(url,"root","tx940614");
		stmt=con.createStatement();
		String sql1="select * from 学术兼职 where 学术团体名称='"+Xsttmc+"' AND 姓名='"+Xm+"'";
		String sql2="insert into 学术兼职 "+"(学术团体名称,担任职务,任职开始时间,任职结束时间,姓名,学术量分值,标识符)"+"value("+"'"+Xsttmc+"'"+","+"'"+Drzw+"'"+","+"'"+Rzkssj+"'"+","+"'"+Rzjssj+"'"+","+"'"+Xm+"'"+","+"'"+Xslfz+"'"+","+"'"+Bzf+"'"+") ";		
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
