package cbzz;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;

public class update_cbzz extends ActionSupport{
	private String Zzmc;
	private String Cbsmc;
	private String Cbsj;
	private String Zzmd;
	private float Gzlfz;
	public void setZzmc(String Zzmc)
	{
		this.Zzmc=Zzmc;
	}
	public String getZzmc()
	{
		return Zzmc;
	}
	
	public void setCbsmc(String Cbsmc)
	{
		this.Cbsmc=Cbsmc;
	}
	public String getCbsmc()
	{
		return Cbsmc;
	}
	
	public void setZzmd(String Zzmd)
	{
		this.Zzmd=Zzmd;
	}
	public String getZzmd()
	{
		return Zzmd;
	}
	
	public void setCbsj(String Cbsj)
	{
		this.Cbsj=Cbsj;
	}
	public String getCbsj()
	{
		return Cbsj;
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
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/���й���";
			con = DriverManager.getConnection(url,"root","tx940614");
			stmt=con.createStatement();
			String sql1="update ����ר�� set ����������='"+Cbsmc+"',��������='"+Zzmd+"',��������ֵ='"+Gzlfz+"',����ʱ��='"+Cbsj+"' where ר������='"+Zzmc+"'";				
			if(Cbsmc==null||Zzmd==null||Cbsj==null||Gzlfz==0||Zzmc==null)
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