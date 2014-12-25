package rjzzq;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;


public class updateaction_rjzzq extends ActionSupport{
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
			Connect c=new Connect();
			Connection con=c.getConnection();
			Statement stmt=null;
			ResultSet rs=null;
			stmt=con.createStatement();	
			String sql1="select * from 软件著作权 where 软件著作权名称='"+Rjzzqmc+"'";		
			rs=stmt.executeQuery(sql1);
			while(rs.next()){
				Rjzzqmc=rs.getString("软件著作权名称");
				Rjzzqdjh=rs.getString("软件著作权登记号");
				Zzqr=rs.getString("著作权人");
				Sydw=rs.getString("授予单位");
				Sysj=rs.getString("授予时间");
				Rymd=rs.getString("人员名单");
				Gzlfz=rs.getFloat("工作量分值");
			}
			rs.close();
			stmt.close();
			con.close();
			
			return "success";		
		}
}