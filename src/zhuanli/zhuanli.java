package zhuanli;

import com.opensymphony.xwork2.ActionSupport;



import connect.Connect;

import java.sql.*;


public class zhuanli extends ActionSupport{
	private String Zlmc;
	private String Zlbh;
	private String Zlqr;
	private String Sydw;
	private String Sj;
	private String Rymd;
	private float Gzlfz;
	public void setZlmc(String Zlmc) throws Exception
	{
		this.Zlmc=Zlmc;
	}
	public String getZlmc()
	{
		return Zlmc;
	}
	public void setZlbh(String Zlbh)
	{
		this.Zlbh=Zlbh;
	}
	public String getZlbh()
	{
		return Zlbh;
	}
	public void setZlqr(String Zlqr)
	{
		this.Zlqr=Zlqr;
	}
	public String getZlqr()
	{
		return Zlqr;
	}
	
	public void setSydw(String Sydw)
	{
		this.Sydw=Sydw;
	}
	public String getSydw()
	{
		return Sydw;
	}
	
	public void setRymd(String Rymd)
	{
		this.Rymd=Rymd;
	}
	public String getRymd()
	{
		return Rymd;
	}
	
	public void setSj(String Sj)
	{
		this.Sj=Sj;
	}
	public String getSj()
	{
		return Sj;
	}
	public void setGzlfz(float Gzlfz)
	{
		this.Gzlfz=Gzlfz;
	}
	public float getGzlfz()
	{
		return Gzlfz;
	}
	
	public String execute() throws Exception{
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();	
		String sql1="select * from ר�� where ר������='"+Zlmc+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Zlmc=rs.getString("ר������");
			Zlbh=rs.getString("ר�����");
			Zlqr=rs.getString("ר��Ȩ��");
			Sydw=rs.getString("���赥λ");
			Gzlfz=rs.getFloat("��������ֵ");
			Sj=rs.getString("ʱ��");
			Rymd=rs.getString("��Ա����");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}
