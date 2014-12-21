package look;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;



public class looklaoshi extends ActionSupport{
	private String Xm;
	public String getXm() {
		return Xm;
	}
	public void setXm(String Xm) {
		this.Xm = Xm;
	}


	List<String> Laoshi=new ArrayList();
	

	public void setLaoshi(ArrayList<String> Laoshi){
		this.Laoshi=Laoshi;
	}
	public List<String> getLaoshi(){
		return Laoshi;
	}
	

	
	public void wrong1(){
		String msg="不允许有空，查询失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
		
	public String execute() throws Exception{
		Xm=getXm();
		if(Xm.length()==0){
			wrong1();
			return "error";
		}
		else{
			Connect c=new Connect();
			Connection con=c.getConnection();
			Statement stmt=null;
			ResultSet rs=null;
			stmt=con.createStatement();	
				String sql1="select * from 老师 where 姓名 like '%"+Xm+"%'";
				rs=stmt.executeQuery(sql1);
				if(rs.first()){
					Laoshi.add(rs.getString("姓名"));
					while(rs.next()){
						Laoshi.add(rs.getString("姓名"));
					}
				}
				rs.close();
				
				
				
				stmt.close();
				con.close();
				return "success";
			}
				
				
			
		}
}
