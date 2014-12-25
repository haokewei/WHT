package kyjf;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class add_kyjf extends ActionSupport{
	private String Xmmc;
	private String Xmly;
	private String Xmfzr;
	private String Kssj;
	private String Jssj;
	private float Htk;
	private String Nf;
	private float Dk;
	private float Wdk;
	private String Kthth;
	private String Jfkh;
	private String Bz;
	private float Gzlfz;
	private String Bzf;
	
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
	
	public void setNf(String Nf)
	{
		this.Nf = Nf;
	}
	public String getNf()
	{
		return this.Nf;
	}
	
	public void setDk(float Dk)
	{
		this.Dk = Dk;
	}
	public float getDk()
	{
		return this.Dk;
	}
	
	public void setWdk(float Wdk)
	{
		this.Wdk = Wdk;
	}
	public float getWdk()
	{
		return this.Wdk;
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
	
	public void setBzf()
	{
		this.Bz = Nf +" " + Xmmc;
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
		String msg="项目已存在，添加失败";
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
		setBzf();
		String sql1="select * from 科研经费 where 标识符='"+Bzf+"'";
		String sql2="insert into 科研经费 "+"(项目名称,项目来源,项目负责人,开始时间,结束时间,合同款,年份,到款,未到款,课题合同号,经费卡号,备注,工作量分值，标识符)"
		+"value("+"'"+Xmmc+"'"+","+"'"+Xmly+"'"+","+"'"+Xmfzr+"'"+","+"'"+Kssj+"'"+","+"'"+Jssj+"'"+","+"'"+Htk+"'"+"," +
				""+"'"+Nf+"'"+","+"'"+Dk+"'"+","+"'"+Wdk+"'"+","+"'"+Kthth+"'"+","+"'"+Jfkh+"'"+","+"'"+Bz+"'"+","+"'"+Gzlfz+"'"+","+"'"+Bzf+"'"+") ";		
		if(Xmmc==null||Xmly==null||Xmfzr==null||Kssj==null||Jssj==null||Htk==0||Nf==null||Dk==0||Wdk==0||Kthth==null||Jfkh==null||Bzf==null)
		{
			//wrong1();
			stmt.close();
			con.close();
			return "incomplete";
		}
		else
		{
			rs=stmt.executeQuery(sql1);
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
				stmt.executeUpdate(sql2);
				rs.close();
				stmt.close();
				con.close();
				//success();
				return "success";
			}
		}
	}
}
