package cbzz;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;


public class updateaction_cbzz extends ActionSupport{
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
		
		public String execute() throws Exception{
			
			Zzmc=getZzmc();
			String temp = new String(Zzmc.getBytes("ISO-8859-1"),"UTF-8");
			Connect c=new Connect();
			Connection con=c.getConnection();
			Statement stmt=null;
			ResultSet rs=null;
			stmt=con.createStatement();
			String sql1="select * from ����ר�� where ר������='"+temp+"'";
			rs=stmt.executeQuery(sql1);
			while(rs.next()){
			Zzmc=rs.getString("ר������");
			Cbsmc=rs.getString("����������");
			Gzlfz=rs.getFloat("��������ֵ");
			Cbsj=rs.getString("����ʱ��");
			Zzmd=rs.getString("��������");
			}
			rs.close();
			stmt.close();
			con.close();
			
			return "success";		
		}
}
