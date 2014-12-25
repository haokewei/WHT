package rjzzq;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;
public class add_rjzzq extends ActionSupport{
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

	public void wrong1()
	{
		String msg="信息不完整，禁止添加";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="软件著作权信息已存在，添加失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void success()
	{
		String msg="添加成功";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	
	public String execute() throws Exception{
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();
		String sql2="select * from 软件著作权 where 软件著作权名称='"+Rjzzqmc+"'";		
		String sql3="insert into 软件著作权 "+"(软件著作权名称,软件著作权登记号,著作权人,授予单位,授予时间,人员名单,工作量分值)"+"value("+"'"+Rjzzqmc+"'"+","+"'"+Rjzzqdjh+"'"+","+"'"+Zzqr+"'"+","+"'"+Sydw+"'"+","+"'"+Sysj+"'"+","+"'"+Rymd+"'"+","+"'"+Gzlfz+"'"+") ";		
		if(Rjzzqmc==null||Rjzzqdjh==null||Zzqr==null||Sydw==null||Sysj==null||Rymd==null||Gzlfz==0)
		{
			//wrong1();
			stmt.close();
			con.close();
			return "incomplete";
		}
		else
		{
			rs=stmt.executeQuery(sql2);
			if(rs.next())
			{
				//wrong2();
				rs.close();
				stmt.close();
				con.close();
				return "error";
			}
			else
			{
			stmt.executeUpdate(sql3);
			rs.close();
			stmt.close();
			con.close();
			//success();
			return "success";
			}
		}
	}
}
