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
			String msg="ר����Ϣ����������ֹ�޸�";
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
			String sql1="update ר�� set ���赥λ='"+Sydw+"',ר��Ȩ��='"+Zlqr+"',��Ա����='"+Rymd+"',��������ֵ='"+Gzlfz+"',ר�����='"+Zlbh+"',ʱ��='"+Sj+"' where ר������='"+Zlmc+"'";				
			if(Sydw==null||Zlqr==null||Rymd==null||Sj==null||Gzlfz==0||Zlmc==null||Zlbh==null)
			{
				wrong();
				stmt.close();
				con.close();
				return "error";
			}
			else
			{
				stmt.executeUpdate(sql1);
			}
			success();
			return "success";		
		}
}