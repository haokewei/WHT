package keyanxiangmu;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

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
		String msg="������Ŀ��Ϣ����������ֹ�޸�";
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
				"����ʱ��='"+Jssj+"',��ͬ��='"+Htk+"',����='"+Lx+"',��������ʱ��='"+Jdyssj+"',����������֯��λ='"+Jdyszzdw+"'," +
						"�����ͬ��='"+Kthth+"',���ѿ���='"+Jfkh+"',��ע='"+Bz+"',��������ֵ='"+Gzlfz+"' where ��Ŀ����='"+Xmmc+"'";
						
		
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
