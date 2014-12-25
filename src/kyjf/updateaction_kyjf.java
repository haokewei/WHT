package kyjf;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;


public class updateaction_kyjf extends ActionSupport{
	private String Xmmc;
	private String Xmly;
	private String Xmfzr;
	private String Kssj;
	private String Jssj;
	private float Htk;
	private String Nf;
	private float Dk;
	private float Wdk;
	private String Kthth;
	private String Jfkh;
	private String Bz;
	private float Gzlfz;
	private String Bzf;
	
	public void setXmmc (String Xmmc) throws Exception
	{
		this.Xmmc = Xmmc;
	}
	public String getXmmc()
	{
		return this.Xmmc;
	}
	
	public void setXmly(String Xmly)
	{
		this.Xmly = Xmly;
	}
	public String getXmly()
	{
		return this.Xmly;
	}
	
	public void setXmfzr(String Xmfzr)
	{
		this.Xmfzr = Xmfzr;
	}
	public String getXmfzr()
	{
		return this.Xmfzr;
	}
	
	public void setKssj(String Kssj)
	{
		this.Kssj = Kssj;
	}
	public String getKssj()
	{
		return this.Kssj;
	}
	
	public void setJssj(String Jssj)
	{
		this.Jssj = Jssj;
	}
	public String getJssj()
	{
		return this.Jssj;
	}
	
	public void setHtk(float Htk)
	{
		this.Htk = Htk;
	}
	public float getHtk()
	{
		return this.Htk;
	}
	
	public void setNf(String Nf)
	{
		this.Nf = Nf;
	}
	public String getNf()
	{
		return this.Nf;
	}
	
	public void setDk(float Dk)
	{
		this.Dk = Dk;
	}
	public float getDk()
	{
		return this.Dk;
	}
	
	public void setWdk(float Wdk)
	{
		this.Wdk = Wdk;
	}
	public float getWdk()
	{
		return this.Wdk;
	}
	
	public void setKthth(String Kthth)
	{
		this.Kthth = Kthth;
	}
	public String getKthth()
	{
		return this.Kthth;
	}
	
	public void setJfkh(String Jfkh)
	{
		this.Jfkh = Jfkh;
	}
	public String getJfkh()
	{
		return this.Jfkh;
	}
	
	public void setBz(String Bz)
	{
		this.Bz = Bz;
	}
	public String getBz()
	{
		return this.Bz;
	}
	
	public void setGzlfz(float Gzlfz)
	{
		this.Gzlfz = Gzlfz;
	}
	public float getGzlfz()
	{
		return this.Gzlfz;
	}
	
	public void setBzf(String Bzf)
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
		String sql1="select * from 科研经费 where 标识符='"+temp+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Xmmc = rs.getString("项目名称");
			Xmly = rs.getString("项目来源");
			Xmfzr = rs.getString("项目负责人");
			Kssj = rs.getString("开始时间");
			Jssj = rs.getString("结束时间");
			Htk = rs.getFloat("合同款");
			Nf = rs.getString("年份");
			Dk = rs.getFloat("到款");
			Wdk = rs.getFloat("未到款");
			Kthth = rs.getString("课题合同号");
			Jfkh = rs.getString("经费卡号");
			Bz = rs.getString("备注");
			Gzlfz = rs.getFloat("工作量分值");
			Bzf = rs.getString("标识符");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
	
	
}