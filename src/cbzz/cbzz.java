package cbzz;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;
public class cbzz extends ActionSupport{
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
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/���й���";
	con = DriverManager.getConnection(url,"root","tx940614");
	stmt=con.createStatement();
	String sql1="select * from ����ר�� where ר������='"+Zzmc+"'";		
	rs=stmt.executeQuery(sql1);
	while(rs.next()){
		Zzmc = rs.getString("ר������");
		Cbsmc = rs.getString("����������");
		Cbsj = rs.getString("����ʱ��");
		Zzmd = rs.getString("��������");
		Gzlfz = rs.getFloat("��������ֵ");
	}
	rs.close();
	stmt.close();
	con.close();
	
	return "success";		
}
}