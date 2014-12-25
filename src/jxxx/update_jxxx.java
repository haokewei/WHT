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
		setBzf();
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		stmt=con.createStatement();
		System.out.println(Ryxm + "  AAAAAAAAAAA   " + Bzf);
		String sql1="update 进修学习 set 进修学习单位='"+Jxxxdw+"',进修学习内容='"+Jxxxnr+"',开始时间='"+Kssj+"',结束时间='"+Jssj+"',人员姓名='"+Ryxm+"',工作量分值='"+Gzlfz+"' where 标识符='"+Bzf+"'";
		if(Jxxxdw==null||Jxxxnr==null||Kssj==null||Jssj==null||Ryxm==null||Gzlfz==0)
		{
			//wrong();
			stmt.close();
			con.close();
			return "error";
		}
		else{	
			stmt.executeUpdate(sql1);
			//success();
			return "success";		
		}
	}
}
