package huojiang;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

public class updateaction_huojiang extends ActionSupport{
	private String Xmmc;
	private String Hjlb;
	private String Hjdj;
	private String Hjsj;
	private String Hjrymd;
	private float Gzlfz;
	public void setXmmc(String Xmmc)
	{
		this.Xmmc=Xmmc;
	}
	public String getXmmc()
	{
		return Xmmc;
	}
	
	public void setHjlb(String Hjlb)
	{
		this.Hjlb=Hjlb;
	}
	public String getHjlb()
	{
		return Hjlb;
	}
	public void setHjdj(String Hjdj)
	{
		this.Hjdj=Hjdj;
	}
	public String getHjdj()
	{
		return Hjdj;
	}
	public void setHjrymd(String Hjrymd)
	{
		this.Hjrymd=Hjrymd;
	}
	public String getHjrymd()
	{
		return Hjrymd;
	}
	
	public void setHjsj(String Hjsj)
	{
		this.Hjsj=Hjsj;
	}
	public String getHjsj()
	{
		return Hjsj;
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
			String sql1="select * from 获奖 where 项目名称='"+Xmmc+"'";		
			rs=stmt.executeQuery(sql1);
			while(rs.next()){
			Xmmc=rs.getString("项目名称");
			Hjlb=rs.getString("获奖类别");
			Hjdj=rs.getString("获奖等级");
			Gzlfz=rs.getFloat("工作量分值");
			Hjsj=rs.getString("获奖时间");
			Hjrymd=rs.getString("获奖人员名单");
			}
			rs.close();
			stmt.close();
			con.close();
			
			return "success";		
		}
}
