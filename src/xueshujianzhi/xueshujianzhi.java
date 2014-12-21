package xueshujianzhi;
import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;


public class xueshujianzhi extends ActionSupport{
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
	
	public void setBzf (String Bzf)
	{
		this.Bzf = Bzf;
	}
	public String getBzf()
	{
		return this.Bzf;
	}
	public String execute() throws Exception{
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();	
		String sql1="select * from 学术兼职 where 标识符='"+Bzf+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Xsttmc = rs.getString("学术团体名称");
			Drzw = rs.getString("担任职务");
			Xm = rs.getString("姓名");
			Rzkssj = rs.getString("任职开始时间");
			Rzjssj = rs.getString("任职结束时间");
			Xslfz = rs.getFloat("学术量分值");
			Bzf = rs.getString("标识符");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}