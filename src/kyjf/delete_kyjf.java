package kyjf;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class delete_kyjf extends ActionSupport{
	private String Xmmc;
	private String Nf;
	public String getLf() {
		return this.Nf;
	}
	public void setLf(String Nf) {
		this.Nf = Nf;
	}
	public void setXmmc(String Xmmc)
	{
		this.Xmmc=Xmmc;
	}
	public String getXmmc()
	{
		return Xmmc;
	}
	
	
	public void message()
	{
		String msg="ɾ���ɹ�";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public String execute() throws Exception
	{		
		Connect c=new Connect();
		Connection con=c.getConnection();
		Statement stmt=null;
		stmt=con.createStatement();
		String sql1="delete  from ������Ŀ where ��Ŀ����='"+Xmmc+"' and ���='"+Nf+"'";
		stmt.executeUpdate(sql1);
		stmt.close();
		con.close();
		message();
		return "success";
	}
}
