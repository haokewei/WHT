package laoshi;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class add_laoshi extends ActionSupport{
	private String Xm;
	private String Dw;
	private String Zwzc;
	private String Gw;
	private int Gj;
	private float Ldjf;
	private float Gjfz;
	public void setXm(String Xm)
	{
		this.Xm=Xm;
	}
	public String getXm()
	{
		return Xm;
	}
	
	public void setDw(String Dw)
	{
		this.Dw=Dw;
	}
	public String getDw()
	{
		return Dw;
	}
	public void setZwzc(String Zwzc)
	{
		this.Zwzc=Zwzc;
	}
	public String getZwzc()
	{
		return Zwzc;
	}
	public void setLdjf(float Ldjf)
	{
		this.Ldjf=Ldjf;
	}
	public float getLdjf()
	{
		return Ldjf;
	}
	
	public void setGw(String Gw)
	{
		this.Gw=Gw;
	}
	public String getGw()
	{
		return Gw;
	}
	public void setGj(int Gj)
	{
		this.Gj=Gj;
	}
	public int getGj()
	{
		return Gj;
	}
	public void setGjfz(float Gjfz)
	{
		this.Gjfz=Gjfz;
	}
	public float getGjfz()
	{
		return Gjfz;
	}
	
	public void wrong1()
	{
		String msg="信息不完整，禁止添加";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="老师已存在，添加失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void success()
	{
		String msg="添加成功";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	
	public String execute() throws Exception{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/科研成果";
		con = DriverManager.getConnection(url,"root","1234");
		stmt=con.createStatement();		
		String sql2="select * from 老师 where 姓名='"+Xm+"' ";		
		String sql3="insert into 老师 "+"(姓名,单位,职务职称,领导加分,岗位,岗级,岗级分值)"+"value("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+"'"+Zwzc+"'"+","+"'"+Ldjf+"'"+","+"'"+Gw+"'"+","+"'"+Gj+"'"+","+"'"+Gjfz+"'"+") ";		
		if(Dw==null||Zwzc==null||Ldjf==0||Gw==null||Gj==0||Gjfz==0||Xm==null)
		{
			wrong1();
			stmt.close();
			con.close();
			return "incomplete";
		}
		else
		{
			rs=stmt.executeQuery(sql2);
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
			stmt.executeUpdate(sql3);
			success();
			rs.close();
			stmt.close();
			con.close();
			return "success";
			}
		}
	}
}
