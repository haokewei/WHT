package look;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

import keyanxiangmu.*;

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
		String msg="�������пգ���ѯʧ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
		
	public String execute() throws Exception{
		Xm=getXm();
		if(Xm.length()==0){
			wrong1();
			return "error";
		}
		else{
				Connection con=null;
				Statement stmt=null;
				ResultSet rs=null;
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/���й���";
				con = DriverManager.getConnection(url,"root","tx940614");
				stmt=con.createStatement();
				String sql1="select * from ��ʦ where ���� like '%"+Xm+"%'";
				rs=stmt.executeQuery(sql1);
				if(rs.first()){
					Laoshi.add(rs.getString("����"));
					while(rs.next()){
						Laoshi.add(rs.getString("����"));
					}
				}
				rs.close();
				
				
				
				stmt.close();
				con.close();
				return "success";
			}
				
				
			
		}
}
