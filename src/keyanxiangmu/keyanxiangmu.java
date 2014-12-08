package keyanxiangmu;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;

public class keyanxiangmu extends ActionSupport{
	private String Xmmc;
	private String Xmly;
	private String Xmfzr;
	private String Kssj;
	private String Jssj;
	private float Htk;
	private String Lx;
	private String Jdyssj;
	private String Jdyszzdw;
	private String Kthth;
	private String Jfkh;
	private String Bz;
	private float Gzlfz;
	
	public void setXmmc (String Xmmc) throws Exception
	{
		this.Xmmc = Xmmc;
	}
	public String getXmmc()
	{
		return this.Xmmc;
	}
	
	public void setXmly(String Xmly)
	{
		this.Xmly = Xmly;
	}
	public String getXmly()
	{
		return this.Xmly;
	}
	
	public void setXmfzr(String Xmfzr)
	{
		this.Xmfzr = Xmfzr;
	}
	public String getXmfzr()
	{
		return this.Xmfzr;
	}
	
	public void setKssj(String Kssj)
	{
		this.Kssj = Kssj;
	}
	public String getKssj()
	{
		return this.Kssj;
	}
	
	public void setJssj(String Jssj)
	{
		this.Jssj = Jssj;
	}
	public String getJssj()
	{
		return this.Jssj;
	}
	
	public void setHtk(float Htk)
	{
		this.Htk = Htk;
	}
	public float getHtk()
	{
		return this.Htk;
	}
	
	public void setLx(String Lx)
	{
		this.Lx = Lx;
	}
	public String getLx()
	{
		return this.Lx;
	}
	
	public void setJdyssj(String Jdyssj)
	{
		this.Jdyssj = Jdyssj;
	}
	public String getJdyssj()
	{
		return this.Jdyssj;
	}
	
	public void setJdyszzdw(String Jdyszzdw)
	{
		this.Jdyszzdw = Jdyszzdw;
	}
	public String getJdyszzdw()
	{
		return this.Jdyszzdw;
	}
	
	public void setKthth(String Kthth)
	{
		this.Kthth = Kthth;
	}
	public String getKthth()
	{
		return this.Kthth;
	}
	
	public void setJfkh(String Jfkh)
	{
		this.Jfkh = Jfkh;
	}
	public String getJfkh()
	{
		return this.Jfkh;
	}
	
	public void setBz(String Bz)
	{
		this.Bz = Bz;
	}
	public String getBz()
	{
		return this.Bz;
	}
	
	public void setGzlfz(float Gzlfz)
	{
		this.Gzlfz = Gzlfz;
	}
	public float getGzlfz()
	{
		return this.Gzlfz;
	}
	
	public String execute() throws Exception{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/科研成果";
		con = DriverManager.getConnection(url,"root","1234");
		stmt=con.createStatement();
		String sql1="select * from 科研项目 where 项目名称='"+Xmmc+"'";		
		rs=stmt.executeQuery(sql1);
		while(rs.next()){
			Xmmc = rs.getString("项目名称");
			Xmly = rs.getString("项目来源");
			Xmfzr = rs.getString("项目负责人");
			Kssj = rs.getString("开始时间");
			Jssj = rs.getString("结束时间");
			Htk = rs.getFloat("合同款");
			Lx = rs.getString("类型");
			Jdyssj = rs.getString("鉴定验收时间");
			Jdyszzdw = rs.getString("鉴定验收组织单位");
			Kthth = rs.getString("课题合同号");
			Jfkh = rs.getString("经费卡号");
			Bz = rs.getString("备注");
			Gzlfz = rs.getFloat("工作量分值");
		}
		rs.close();
		stmt.close();
		con.close();
		
		return "success";		
	}
}



