package gjhz;


import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

public class gjhz extends ActionSupport{
	private String Lb;
	private String Rymd;
	private int Rs;
	private String Kssj;
	private String Jssj;
	private String Dd;
	private String Fwmd;
	private String Bgmc;
	private String Xwbdlj;
	private boolean Xwbgbcf;
	private boolean Zpbcf;
	private float Gzlfz;
	
	public String getLb() {
		return this.Lb;
	}

	public void setLb(String Lb) {
		this.Lb = Lb;
	}

	public String getRymd() {
		return this.Rymd;
	}

	public void setRymd(String Rymd) {
		this.Rymd = Rymd;
	}

	public int getRs() {
		return this.Rs;
	}

	public void setRs(int Rs) {
		this.Rs = Rs;
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

	public String getDd() {
		return this.Dd;
	}

	public void setDd(String Dd) {
		this.Dd = Dd;
	}

	public String getFwmd() {
		return this.Fwmd;
	}

	public void setFwmd(String Fwmd) {
		this.Fwmd = Fwmd;
	}

	public String getBgmc() {
		return this.Bgmc;
	}

	public void setBgmc(String Bgmc) {
		this.Bgmc = Bgmc;
	}

	public String getXwbdlj() {
		return this.Xwbdlj;
	}

	public void setXwbdlj(String Xwbdlj) {
		this.Xwbdlj = Xwbdlj;
	}

	public boolean isXwbgbcf() {
		return this.Xwbgbcf;
	}

	public void setXwbgbcf(boolean Xwbgbcf) {
		this.Xwbgbcf = Xwbgbcf;
	}

	public boolean isZpbcf() {
		return this.Zpbcf;
	}

	public void setZpbcf(boolean Zpbcf) {
		this.Zpbcf = Zpbcf;
	}

	public float getGzlfz() {
		return this.Gzlfz;
	}

	public void setGzlfz(float Gzlfz) {
		this.Gzlfz = Gzlfz;
	}
	
	public String execute() throws Exception{
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();
		String sql1="select * from ���ʺ��� where ��������='"+Bgmc+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Lb=rs.getString("���");
			Rymd=rs.getString("��Ա����");
			Rs=rs.getInt("����");
			Kssj=rs.getString("��ʼʱ��");
			Jssj=rs.getString("����ʱ��");
			Dd=rs.getString("�ص�");
			Fwmd=rs.getString("����Ŀ��");
			Bgmc=rs.getString("��������");
			Xwbdlj=rs.getString("���ű�������");
			Xwbgbcf=rs.getBoolean("���ű��汣���");
			Zpbcf=rs.getBoolean("��Ƭ�����");
			Gzlfz=rs.getFloat("��������ֵ");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}
