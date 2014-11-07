package huojiang;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

import javax.swing.JOptionPane;

public class update_huojiang extends ActionSupport{
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
		public void wrong()
		{
			String msg="获奖信息不完整，禁止修改";
			int type=JOptionPane.YES_NO_CANCEL_OPTION;
			String title="信息提示";
			JOptionPane.showMessageDialog(null,msg,title,type);
		}
		public void success()
		{
			String msg="修改成功";
			int type=JOptionPane.YES_NO_CANCEL_OPTION;
			String title="信息提示";
			JOptionPane.showMessageDialog(null,msg,title,type);
		}
		public String execute() throws Exception{
			String tempID=new String();
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/科研管理";
			con = DriverManager.getConnection(url,"root","tx940614");
			stmt=con.createStatement();
			String sql1="update 获奖 set 获奖类别='"+Hjlb+"',获奖等级='"+Hjdj+"',获奖人员名单='"+Hjrymd+"',工作量分值='"+Gzlfz+"',获奖时间='"+Hjsj+"' where 项目名称='"+Xmmc+"'";				
			if(Hjlb==null||Hjdj==null||Hjrymd==null||Hjsj==null||Gzlfz==0||Xmmc==null)
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
