package huojiang;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

public class updateaction_huojiang extends ActionSupport{
	private String Xmmc;
	private String Hjlb;
	private String Hjdj;
	private String Hjsj;
	private String Hjrymd;
	private float Gzlfz;
	public void setXmmc(String Xmmc)
	{
		this.Xmmc=Xmmc;
	}
	public String getXmmc()
	{
		return Xmmc;
	}
	
	public void setHjlb(String Hjlb)
	{
		this.Hjlb=Hjlb;
	}
	public String getHjlb()
	{
		return Hjlb;
	}
	public void setHjdj(String Hjdj)
	{
		this.Hjdj=Hjdj;
	}
	public String getHjdj()
	{
		return Hjdj;
	}
	public void setHjrymd(String Hjrymd)
	{
		this.Hjrymd=Hjrymd;
	}
	public String getHjrymd()
	{
		return Hjrymd;
	}
	
	public void setHjsj(String Hjsj)
	{
		this.Hjsj=Hjsj;
	}
	public String getHjsj()
	{
		return Hjsj;
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
			Connect c=new Connect();
			Connection con=c.getConnection();
			Statement stmt=null;
			ResultSet rs=null;
			stmt=con.createStatement();
			String sql1="select * from �� where ��Ŀ����='"+Xmmc+"'";		
			rs=stmt.executeQuery(sql1);
			while(rs.next()){
			Xmmc=rs.getString("��Ŀ����");
			Hjlb=rs.getString("�����");
			Hjdj=rs.getString("�񽱵ȼ�");
			Gzlfz=rs.getFloat("��������ֵ");
			Hjsj=rs.getString("��ʱ��");
			Hjrymd=rs.getString("����Ա����");
			}
			rs.close();
			stmt.close();
			con.close();
			
			return "success";		
		}
}
