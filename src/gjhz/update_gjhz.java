package gjhz;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;

import javax.swing.JOptionPane;

public class update_gjhz extends ActionSupport{
	private String Lb;
	private String Rymd;
	private int Rs;
	private String Kssj;
	private String Jssj;
	private String Dd;
	private String Fwmd;
	private String Bgmc;
	private String Xwbdlj;
	private boolean Xwbgbcf;
	private boolean Zpbcf;
	private float Gzlfz;
	
	public String getLb() {
		return this.Lb;
	}

	public void setLb(String Lb) {
		this.Lb = Lb;
	}

	public String getRymd() {
		return this.Rymd;
	}

	public void setRymd(String Rymd) {
		this.Rymd = Rymd;
	}

	public int getRs() {
		return this.Rs;
	}

	public void setRs(int Rs) {
		this.Rs = Rs;
	}

	public String getKssj() {
		return this.Kssj;
	}

	public void setKssj(String Kssj) {
		this.Kssj = Kssj;
	}

	public String getJssj() {
		return this.Jssj;
	}

	public void setJssj(String Jssj) {
		this.Jssj = Jssj;
	}

	public String getDd() {
		return this.Dd;
	}

	public void setDd(String Dd) {
		this.Dd = Dd;
	}

	public String getFwmd() {
		return this.Fwmd;
	}

	public void setFwmd(String Fwmd) {
		this.Fwmd = Fwmd;
	}

	public String getBgmc() {
		return this.Bgmc;
	}

	public void setBgmc(String Bgmc) {
		this.Bgmc = Bgmc;
	}

	public String getXwbdlj() {
		return this.Xwbdlj;
	}

	public void setXwbdlj(String Xwbdlj) {
		this.Xwbdlj = Xwbdlj;
	}

	public boolean isXwbgbcf() {
		return this.Xwbgbcf;
	}

	public void setXwbgbcf(boolean Xwbgbcf) {
		this.Xwbgbcf = Xwbgbcf;
	}

	public boolean isZpbcf() {
		return this.Zpbcf;
	}

	public void setZpbcf(boolean Zpbcf) {
		this.Zpbcf = Zpbcf;
	}

	public float getGzlfz() {
		return this.Gzlfz;
	}

	public void setGzlfz(float Gzlfz) {
		this.Gzlfz = Gzlfz;
	}
		public void wrong()
		{
			String msg="国际合作信息不完整，禁止修改";
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
			Connect c=new Connect();
			Connection con=c.getConnection();
			Statement stmt=null;
			stmt=con.createStatement();
			String sql1="update 国际合作 set 类别='"+Lb+"',人员名单='"+Rymd+"',人数='"+Rs+"',开始时间='"+Kssj+"',结束时间='"+Jssj+"',地点='"+Dd+"',访问目的='"+Fwmd+"',新闻报道链接='"+Xwbdlj+"',新闻报告保存否='"+Xwbgbcf+"',照片保存否='"+Zpbcf+"' where 报告名称='"+Bgmc+"'";				
			if(Lb==null||Rymd==null||Rs==0||Kssj==null||Jssj==null||Dd==null||Fwmd==null||Bgmc==null||Xwbdlj==null)
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
