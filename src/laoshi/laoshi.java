package laoshi;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;

public class laoshi extends ActionSupport{
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
	
	public String execute() throws Exception{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/科研管理";
		con = DriverManager.getConnection(url,"root","tx940614");
		stmt=con.createStatement();
		String sql1="select * from 老师 where 姓名='"+Xm+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Xm=rs.getString("姓名");
			Dw=rs.getString("单位");
			Zwzc=rs.getString("职务职称");
			Gjfz=rs.getFloat("岗级分值");
			Gw=rs.getString("岗位");
			Gj=rs.getInt("岗级");
			Ldjf=rs.getFloat("领导加分");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}
