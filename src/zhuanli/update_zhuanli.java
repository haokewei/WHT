package zhuanli;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class update_zhuanli extends ActionSupport{
	private String Zlmc;
	private String Zlbh;
	private String Zlqr;
	private String Sydw;
	private String Sj;
	private String Rymd;
	private float Gzlfz;
	public void setZlmc(String Zlmc)
	{
		this.Zlmc=Zlmc;
	}
	public String getZlmc()
	{
		return Zlmc;
	}
	public void setZlbh(String Zlbh)
	{
		this.Zlbh=Zlbh;
	}
	public String getZlbh()
	{
		return Zlbh;
	}
	public void setZlqr(String Zlqr)
	{
		this.Zlqr=Zlqr;
	}
	public String getZlqr()
	{
		return Zlqr;
	}
	
	public void setSydw(String Sydw)
	{
		this.Sydw=Sydw;
	}
	public String getSydw()
	{
		return Sydw;
	}
	
	public void setRymd(String Rymd)
	{
		this.Rymd=Rymd;
	}
	public String getRymd()
	{
		return Rymd;
	}
	
	public void setSj(String Sj)
	{
		this.Sj=Sj;
	}
	public String getSj()
	{
		return Sj;
	}
	public void setGzlfz(float Gzlfz)
	{
		this.Gzlfz=Gzlfz;
	}
	public float getGzlfz()
	{
		return Gzlfz;
	}
		public void wrong()
		{
			String msg="专利信息不完整，禁止修改";
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
			String sql1="update 专利 set 授予单位='"+Sydw+"',专利权人='"+Zlqr+"',人员名单='"+Rymd+"',工作量分值='"+Gzlfz+"',专利编号='"+Zlbh+"',时间='"+Sj+"' where 专利名称='"+Zlmc+"'";				
			if(Sydw==null||Zlqr==null||Rymd==null||Sj==null||Gzlfz==0||Zlmc==null||Zlbh==null)
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