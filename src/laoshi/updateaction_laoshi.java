package laoshi;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

public class updateaction_laoshi extends ActionSupport{
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
			String tempID=new String();
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/���й���";
			con = DriverManager.getConnection(url,"root","tx940614");
			stmt=con.createStatement();
			String sql1="select * from ��ʦ where ����='"+Xm+"'";		
			rs=stmt.executeQuery(sql1);
			while(rs.next()){
			Xm=rs.getString("����");
			Dw=rs.getString("��λ");
			Zwzc=rs.getString("ְ��ְ��");
			Gjfz=rs.getFloat("�ڼ���ֵ");
			Gw=rs.getString("��λ");
			Gj=rs.getInt("�ڼ�");
			Ldjf=rs.getFloat("�쵼�ӷ�");
			}
			
			rs.close();
			stmt.close();
			con.close();
			
			return "success";		
		}
}
