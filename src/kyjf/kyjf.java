package kyjf;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;


public class kyjf extends ActionSupport{
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
		String sql1="select * from ���о��� where ��ʶ��='"+temp+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Xmmc = rs.getString("��Ŀ����");
			Xmly = rs.getString("��Ŀ��Դ");
			Xmfzr = rs.getString("��Ŀ������");
			Kssj = rs.getString("��ʼʱ��");
			Jssj = rs.getString("����ʱ��");
			Htk = rs.getFloat("��ͬ��");
			Nf = rs.getString("���");
			Dk = rs.getFloat("����");
			Wdk = rs.getFloat("δ����");
			Kthth = rs.getString("�����ͬ��");
			Jfkh = rs.getString("���ѿ���");
			Bz = rs.getString("��ע");
			Gzlfz = rs.getFloat("��������ֵ");
			Bzf = rs.getString("��ʶ��");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}



