package zhuanli;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class add_zhuanli extends ActionSupport{
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
	
	public void wrong1()
	{
		String msg="��Ϣ����������ֹ���";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="ר����Ϣ�Ѵ��ڣ����ʧ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void success()
	{
		String msg="��ӳɹ�";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	
	public String execute() throws Exception{
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		stmt=con.createStatement();		
		String sql2="select * from ר�� where ר������='"+Zlmc+"'";		
		String sql3="insert into ר�� "+"(ר������,ר�����,���赥λ,ר��Ȩ��,��Ա����,ʱ��,��������ֵ)"+"value("+"'"+Zlmc+"'"+","+"'"+Zlbh+"'"+","+"'"+Sydw+"'"+","+"'"+Zlqr+"'"+","+"'"+Rymd+"'"+","+"'"+Sj+"'"+","+"'"+Gzlfz+"'"+") ";		
		if(Sydw==null||Zlqr==null||Rymd==null||Sj==null||Gzlfz==0||Zlmc==null||Zlbh==null)
		{
			wrong1();
			stmt.close();
			con.close();
			return "incomplete";
		}
		else
		{
			rs=stmt.executeQuery(sql2);
			if(rs.next())
			{
				wrong2();
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
			success();
			return "success";
			}
		}
	}
}
