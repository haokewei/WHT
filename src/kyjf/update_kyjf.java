package kyjf;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class update_kyjf extends ActionSupport{
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
		
		String sql1="update ������Ŀ set ��Ŀ��Դ='"+Xmly+"',��Ŀ������='"+Xmfzr+"',��ʼʱ��='"+Kssj+"'," +
				"����ʱ��='"+Jssj+"',��ͬ��='"+Htk+"',���='"+Nf+"',����='"+Dk+"',δ����='"+Wdk+"'," +
						"�����ͬ��='"+Kthth+"',���ѿ���='"+Jfkh+"',��ע='"+Bz+"',��������ֵ='"+Gzlfz+"' where ��Ŀ����='"+Xmmc+"'";
						
		
		if(Xmly==null||Xmfzr==null||Kssj==null||Jssj==null||Htk==0||Nf==null||Dk==0||Wdk==0||Kthth==null||Jfkh==null)
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
