package jxxx;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;
public class add_jxxx extends ActionSupport{
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

	public void wrong1()
	{
		String msg="信息不完整，禁止添加";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="获奖信息已存在，添加失败";
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
		setBzf();
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();	
		String sql2="select * from 进修学习 where 人员姓名='"+Ryxm+"' and 进修学习单位='"+Jxxxdw+"'";		
		String sql3="insert into 进修学习 "+"(进修学习单位,进修学习内容,开始时间,结束时间,人员姓名,工作量分值,标识符)"+"value("+"'"+Jxxxdw+"'"+","+"'"+Jxxxnr+"'"+","+"'"+Kssj+"'"+","+"'"+Jssj+"'"+","+"'"+Ryxm+"'"+","+"'"+Gzlfz+"'"+","+"'"+Bzf+"'"+") ";		
		if(Jxxxdw==null||Jxxxnr==null||Kssj==null||Jssj==null||Ryxm==null||Gzlfz==0||Bzf==null)
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
