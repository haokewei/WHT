package keyanxiangmu;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;

public class add_kyxm extends ActionSupport{
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
	
	
	public void wrong1()
	{
		String msg="������Ŀ��Ϣ����������ֹ���";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="������Ŀ�Ѵ��ڣ����ʧ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void success()
	{
		String msg="������Ŀ��ӳɹ�";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	
	public String execute() throws Exception{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/���й���";
		con = DriverManager.getConnection(url,"root","tx940614");
		stmt=con.createStatement();
		String sql1="select * from ������Ŀ where ��Ŀ����='"+Xmmc+"'";
		String sql2="insert into ������Ŀ "+"(��Ŀ����,��Ŀ��Դ,��Ŀ������,��ʼʱ��,����ʱ��,��ͬ��,����,��������ʱ��,����������֯��λ,�����ͬ��,���ѿ���,��ע,��������ֵ)"
		+"value("+"'"+Xmmc+"'"+","+"'"+Xmly+"'"+","+"'"+Xmfzr+"'"+","+"'"+Kssj+"'"+","+"'"+Jssj+"'"+","+"'"+Htk+"'"+"," +
				""+"'"+Lx+"'"+","+"'"+Jdyssj+"'"+","+"'"+Jdyszzdw+"'"+","+"'"+Kthth+"'"+","+"'"+Jfkh+"'"+","+"'"+Bz+"'"+","+"'"+Gzlfz+"'"+") ";		
		if(Xmmc==null||Xmly==null||Xmfzr==null||Kssj==null||Jssj==null||Htk==0||Lx==null||Jdyssj==null||Jdyszzdw==null||Kthth==null||Jfkh==null)
		{
			wrong1();
			stmt.close();
			con.close();
			return "incomplete";
		}
		else
		{
			rs=stmt.executeQuery(sql1);
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
				stmt.executeUpdate(sql2);
				rs.close();
				stmt.close();
				con.close();
				success();
				return "success";
			}
		}
	}
}
