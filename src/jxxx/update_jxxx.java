package jxxx;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class update_jxxx extends ActionSupport{
	private String Jxxxdw;
	private String Jxxxnr;
	private String Kssj;
	private String Jssj;
	private String Ryxm;
	private float Gzlfz;
	private String Bzf;
	
	public String getJxxxdw() {
		return this.Jxxxdw;
	}

	public void setJxxxdw(String Jxxxdw) {
		this.Jxxxdw = Jxxxdw;
	}

	public String getJxxxnr() {
		return this.Jxxxnr;
	}

	public void setJxxxnr(String Jxxxnr) {
		this.Jxxxnr = Jxxxnr;
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

	public String getRyxm() {
		return this.Ryxm;
	}

	public void setRyxm(String Ryxm) {
		this.Ryxm = Ryxm;
	}

	public float getGzlfz() {
		return this.Gzlfz;
	}

	public void setGzlfz(float Gzlfz) {
		this.Gzlfz = Gzlfz;
	}
	
	public void setBzf ()
	{
		this.Bzf = Jxxxdw + " " + Ryxm;
	}
	
	public String getBzf()
	{
		return this.Bzf;
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
		String sql1="update ����ѧϰ set ����ѧϰ��λ='"+Jxxxdw+"',����ѧϰ����='"+Jxxxnr+"',��ʼʱ��='"+Kssj+"',����ʱ��='"+Jssj+"',��Ա����='"+Ryxm+"',��������ֵ='"+Gzlfz+"' where ��ʶ��='"+Bzf+"'";
		if(Jxxxdw==null||Jxxxnr==null||Kssj==null||Jssj==null||Ryxm==null||Gzlfz==0)
		{
			wrong();
			stmt.close();
			con.close();
			return "error";
		}
		else{	
			stmt.executeUpdate(sql1);
			success();
			return "success";		
		}
	}
}
