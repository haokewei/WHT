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
	private String Xwbgbcf;
	private String Zpbcf;
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

	public String getXwbgbcf() {
		return this.Xwbgbcf;
	}

	public void setXwbgbcf(String Xwbgbcf) {
		this.Xwbgbcf = Xwbgbcf;
	}

	public String getZpbcf() {
		return this.Zpbcf;
	}

	public void setZpbcf(String Zpbcf) {
		this.Zpbcf = Zpbcf;
	}

	public float getGzlfz() {
		return this.Gzlfz;
	}

	public void setGzlfz(float Gzlfz) {
		this.Gzlfz = Gzlfz;
	}
	
	public String execute() throws Exception{
		String temp = new String(Bgmc.getBytes("ISO-8859-1"),"UTF-8");
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();
		String sql1="select * from 国际合作 where 报告名称='"+temp+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Lb=rs.getString("类别");
			Rymd=rs.getString("人员名单");
			Rs=rs.getInt("人数");
			Kssj=rs.getString("开始时间");
			Jssj=rs.getString("结束时间");
			Dd=rs.getString("地点");
			Fwmd=rs.getString("访问目的");
			Bgmc=rs.getString("报告名称");
			Xwbdlj=rs.getString("新闻报道链接");
			Xwbgbcf=rs.getString("新闻报告保存否");
			Zpbcf=rs.getString("照片保存否");
			Gzlfz=rs.getFloat("工作量分值");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}
