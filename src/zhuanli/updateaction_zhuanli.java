package zhuanli;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

public class updateaction_zhuanli extends ActionSupport{
	private String Zlmc;
	private String Zlbh;
	private String Zlqr;
	private String Sydw;
	private String Sj;
	private String Rymd;
	private float Gzlfz;
	public void setZlmc(String Zlmc)
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
			String tempID=new String();
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/科研成果";
			con = DriverManager.getConnection(url,"root","1234");
			stmt=con.createStatement();
			String sql1="select * from 专利 where 专利名称='"+Zlmc+"'";		
			rs=stmt.executeQuery(sql1);
			while(rs.next()){
			Zlmc=rs.getString("专利名称");
			Zlbh=rs.getString("专利编号");
			Zlqr=rs.getString("专利权人");
			Sydw=rs.getString("授予单位");
			Gzlfz=rs.getFloat("工作量分值");
			Sj=rs.getString("时间");
			Rymd=rs.getString("人员名单");
			}
			rs.close();
			stmt.close();
			con.close();
			
			return "success";		
		}
}