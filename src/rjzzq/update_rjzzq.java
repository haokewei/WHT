package rjzzq;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class update_rjzzq extends ActionSupport{
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
		public void wrong()
		{
			String msg="信息不完整，禁止修改";
			int type=JOptionPane.YES_NO_CANCEL_OPTION;
			String title="信息提示";
			JOptionPane.showMessageDialog(null,msg,title,type);
		}
		public void success()
		{
			String msg="修改成功";
			int type=JOptionPane.YES_NO_CANCEL_OPTION;
			String title="信息提示";
			JOptionPane.showMessageDialog(null,msg,title,type);
		}
		public String execute() throws Exception{
			Connect c=new Connect();
			Connection con=c.getConnection();
			Statement stmt=null;
			stmt=con.createStatement();	
			String sql1="update 软件著作权 set 软件著作权登记号='"+Rjzzqdjh+"',著作权人='"+Zzqr+"',人员名单='"+Rymd+"',授予单位='"+Sydw+"',授予时间='"+Sysj+"',工作量分值='"+Gzlfz+"' where 软件著作权名称='"+Rjzzqmc+"'";				
			if(Sydw==null||Rjzzqdjh==null||Rymd==null||Sysj==null||Gzlfz==0||Sydw==null||Rjzzqmc==null)
			{
				//wrong();
				stmt.close();
				con.close();
				return "error";
			}
			else
			{
				stmt.executeUpdate(sql1);
			}
			//success();
			return "success";		
		}
}