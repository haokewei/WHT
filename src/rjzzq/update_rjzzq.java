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
			String msg="��Ϣ����������ֹ�޸�";
			int type=JOptionPane.YES_NO_CANCEL_OPTION;
			String title="��Ϣ��ʾ";
			JOptionPane.showMessageDialog(null,msg,title,type);
		}
		public void success()
		{
			String msg="�޸ĳɹ�";
			int type=JOptionPane.YES_NO_CANCEL_OPTION;
			String title="��Ϣ��ʾ";
			JOptionPane.showMessageDialog(null,msg,title,type);
		}
		public String execute() throws Exception{
			Connect c=new Connect();
			Connection con=c.getConnection();
			Statement stmt=null;
			stmt=con.createStatement();	
			String sql1="update �������Ȩ set �������Ȩ�ǼǺ�='"+Rjzzqdjh+"',����Ȩ��='"+Zzqr+"',��Ա����='"+Rymd+"',���赥λ='"+Sydw+"',����ʱ��='"+Sysj+"',��������ֵ='"+Gzlfz+"' where �������Ȩ����='"+Rjzzqmc+"'";				
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