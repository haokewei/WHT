package rjzzq;

import com.opensymphony.xwork2.ActionSupport;




import connect.Connect;

import java.sql.*;


public class rjzzq extends ActionSupport{
	private String Rjzzqmc;
	private String Rjzzqdjh;
	private String Zzqr;
	private String Sydw;
	private String Sysj;
	private String Rymd;
	private float Gzlfz; 
	
	public String getRjzzqmc() {
		return this.Rjzzqmc;
	}

	public void setRjzzqmc(String Rjzzqmc) {
		this.Rjzzqmc = Rjzzqmc;
	}

	public String getRjzzqdjh() {
		return this.Rjzzqdjh;
	}

	public void setRjzzqdjh(String Rjzzqdjh) {
		this.Rjzzqdjh = Rjzzqdjh;
	}

	public String getZzqr() {
		return this.Zzqr;
	}

	public void setZzqr(String Zzqr) {
		this.Zzqr = Zzqr;
	}

	public String getSydw() {
		return this.Sydw;
	}

	public void setSydw(String Sydw) {
		this.Sydw = Sydw;
	}

	public String getSysj() {
		return this.Sysj;
	}

	public void setSysj(String Sysj) {
		this.Sysj = Sysj;
	}

	public String getRymd() {
		return this.Rymd;
	}

	public void setRymd(String Rymd) {
		this.Rymd = Rymd;
	}

	public float getGzlfz() {
		return this.Gzlfz;
	}

	public void setGzlfz(float Gzlfz) {
		this.Gzlfz = Gzlfz;
	}
	
	public String execute() throws Exception{
		String temp = new String(Rjzzqmc.getBytes("ISO-8859-1"),"UTF-8");
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();	
		String sql1="select * from �������Ȩ where �������Ȩ����='"+temp+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Rjzzqmc=rs.getString("�������Ȩ����");
			Rjzzqdjh=rs.getString("�������Ȩ�ǼǺ�");
			Zzqr=rs.getString("����Ȩ��");
			Sydw=rs.getString("���赥λ");
			Sysj=rs.getString("����ʱ��");
			Rymd=rs.getString("��Ա����");
			Gzlfz=rs.getFloat("��������ֵ");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}
