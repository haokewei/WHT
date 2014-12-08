package zhuanli;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;
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
		String msg="信息不完整，禁止添加";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="专利信息已存在，添加失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void success()
	{
		String msg="添加成功";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	
	public String execute() throws Exception{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/科研成果";
		con = DriverManager.getConnection(url,"root","1234");
		stmt=con.createStatement();		
		String sql2="select * from 专利 where 专利名称='"+Zlmc+"'";		
		String sql3="insert into 专利 "+"(专利名称,专利编号,授予单位,专利权人,人员名单,时间,工作量分值)"+"value("+"'"+Zlmc+"'"+","+"'"+Zlbh+"'"+","+"'"+Sydw+"'"+","+"'"+Zlqr+"'"+","+"'"+Rymd+"'"+","+"'"+Sj+"'"+","+"'"+Gzlfz+"'"+") ";		
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
