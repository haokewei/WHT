package keyanxiangmu;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;

public class update_kyxm extends ActionSupport{
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
	
	
	public void wrong()
	{
		String msg="科研项目信息不完整，禁止修改";
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
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/科研成果";
		con = DriverManager.getConnection(url,"root","1234");
		stmt=con.createStatement();
		
		String sql1="update 科研项目 set 项目来源='"+Xmly+"',项目负责人='"+Xmfzr+"',开始时间='"+Kssj+"'," +
				"结束时间='"+Jssj+"',合同款='"+Htk+"',类型='"+Lx+"',鉴定验收时间='"+Jdyssj+"',鉴定验收组织单位='"+Jdyszzdw+"'," +
						"课题合同号='"+Kthth+"',经费卡号='"+Jfkh+"',备注='"+Bz+"',工作量分值='"+Gzlfz+"' where 项目名称='"+Xmmc+"'";
						
		
		if(Xmly==null||Xmfzr==null||Kssj==null||Jssj==null||Htk==0||Lx==null||Jdyssj==null||Jdyszzdw==null||Kthth==null||Jfkh==null)
		{
			wrong();
			stmt.close();
			con.close();
			return "error";
		}
		else{
			stmt.executeUpdate(sql1);
			success();
			stmt.close();
			con.close();
			return "success";		
		}
	}
	
}
