package keyanxiangmu;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;


public class keyanxiangmu extends ActionSupport{
	private String Xmmc;
	private String Xmly;
	private String Xmfzr;
	private String Kssj;
	private String Jssj;
	private float Htk;
	private String Lx;
	private String Jdyssj;
	private String Jdyszzdw;
	private String Kthth;
	private String Jfkh;
	private String Bz;
	private float Gzlfz;
	
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
	
	public void setLx(String Lx)
	{
		this.Lx = Lx;
	}
	public String getLx()
	{
		return this.Lx;
	}
	
	public void setJdyssj(String Jdyssj)
	{
		this.Jdyssj = Jdyssj;
	}
	public String getJdyssj()
	{
		return this.Jdyssj;
	}
	
	public void setJdyszzdw(String Jdyszzdw)
	{
		this.Jdyszzdw = Jdyszzdw;
	}
	public String getJdyszzdw()
	{
		return this.Jdyszzdw;
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
	
	public String execute() throws Exception{
		String temp = new String(Xmmc.getBytes("ISO-8859-1"),"UTF-8");
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();
		String sql1="select * from ������Ŀ where ��Ŀ����='"+temp+"'";		
		rs=stmt.executeQuery(sql1);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA");
		while(rs.next()){
			System.out.println("BBBBBBBBBBBBBBBBBBBBBBB");
			Xmmc = rs.getString("��Ŀ����");
			Xmly = rs.getString("��Ŀ��Դ");
			Xmfzr = rs.getString("��Ŀ������");
			Kssj = rs.getString("��ʼʱ��");
			Jssj = rs.getString("����ʱ��");
			Htk = rs.getFloat("��ͬ��");
			Lx = rs.getString("����");
			Jdyssj = rs.getString("��������ʱ��");
			Jdyszzdw = rs.getString("����������֯��λ");
			Kthth = rs.getString("�����ͬ��");
			Jfkh = rs.getString("���ѿ���");
			Bz = rs.getString("��ע");
			Gzlfz = rs.getFloat("��������ֵ");
			System.out.println("CCCCCCCCCCCCCCCCCCCCCCc");
		}
		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDD");
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}



