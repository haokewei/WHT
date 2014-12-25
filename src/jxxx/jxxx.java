package jxxx;
import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;


public class jxxx extends ActionSupport{
	private String Jxxxdw;
	private String Jxxxnr;
	private String Kssj;
	private String Jssj;
	private String Ryxm;
	private float Gzlfz;
	private String Bzf;
	
	public String getJxxxdw() {
		return this.Jxxxdw;
	}

	public void setJxxxdw(String Jxxxdw) {
		this.Jxxxdw = Jxxxdw;
	}

	public String getJxxxnr() {
		return this.Jxxxnr;
	}

	public void setJxxxnr(String Jxxxnr) {
		this.Jxxxnr = Jxxxnr;
	}

	public String getKssj() {
		return this.Kssj;
	}

	public void setKssj(String Kssj) {
		this.Kssj = Kssj;
	}

	public String getJssj() {
		return this.Jssj;
	}

	public void setJssj(String Jssj) {
		this.Jssj = Jssj;
	}

	public String getRyxm() {
		return this.Ryxm;
	}

	public void setRyxm(String Ryxm) {
		this.Ryxm = Ryxm;
	}

	public float getGzlfz() {
		return this.Gzlfz;
	}

	public void setGzlfz(float Gzlfz) {
		this.Gzlfz = Gzlfz;
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
		String temp = new String(Bzf.getBytes("ISO-8859-1"),"UTF-8");
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();
		String sql1="select * from 进修学习 where 标识符='"+temp+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Jxxxdw = rs.getString("进修学习单位");
			Jxxxnr = rs.getString("进修学习内容");
			Kssj = rs.getString("开始时间");
			Jssj = rs.getString("结束时间");
			Ryxm = rs.getString("人员姓名");
			Gzlfz = rs.getFloat("工作量分值");
			Bzf = rs.getString("标识符");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}