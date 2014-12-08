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
			String msg="专著信息不完整，禁止修改";
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
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/科研成果";
			con = DriverManager.getConnection(url,"root","1234");
			stmt=con.createStatement();
			String sql1="update 出版专著 set 出版社名称='"+Cbsmc+"',著者名单='"+Zzmd+"',工作量分值='"+Gzlfz+"',出版时间='"+Cbsj+"' where 专著名称='"+Zzmc+"'";				
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
