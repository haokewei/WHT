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
	String url="jdbc:mysql://localhost:3306/科研管理";
	con = DriverManager.getConnection(url,"root","tx940614");
	stmt=con.createStatement();
	String sql1="select * from 出版专著 where 专著名称='"+Zzmc+"'";		
	rs=stmt.executeQuery(sql1);
	while(rs.next()){
		Zzmc = rs.getString("专著名称");
		Cbsmc = rs.getString("出版社名称");
		Cbsj = rs.getString("出版时间");
		Zzmd = rs.getString("著者名单");
		Gzlfz = rs.getFloat("工作量分值");
	}
	rs.close();
	stmt.close();
	con.close();
	
	return "success";		
}
}