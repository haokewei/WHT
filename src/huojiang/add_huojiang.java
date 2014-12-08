package huojiang;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class add_huojiang extends ActionSupport{
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
	
	public void wrong1()
	{
		String msg="信息不完整，禁止添加";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="获奖信息已存在，添加失败";
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
		String sql2="select * from 获奖  where 项目名称='"+Xmmc+"' ";		
		String sql3="insert into 获奖  "+"(项目名称,获奖类别,获奖等级,获奖人员名单,获奖时间,工作量分值)"+"value("+"'"+Xmmc+"'"+","+"'"+Hjlb+"'"+","+"'"+Hjdj+"'"+","+"'"+Hjrymd+"'"+","+"'"+Hjsj+"'"+","+"'"+Gzlfz+"'"+") ";		
		if(Hjlb==null||Hjrymd==null||Hjsj==null||Gzlfz==0||Xmmc==null)
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
