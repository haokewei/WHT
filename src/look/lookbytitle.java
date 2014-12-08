package look;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

import keyanxiangmu.*;

public class lookbytitle extends ActionSupport{
	private String Title;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}


	List<String> Xmlb1=new ArrayList();
	List<String> Xmlb2=new ArrayList();
	List<String> Xmlb3=new ArrayList();
	List<String> Xmlb4=new ArrayList();
	List<String> Xmlb5=new ArrayList();
	

	public void setXmlb1(ArrayList<String> Xmlb1){
		this.Xmlb1=Xmlb1;
	}
	public List<String> getXmlb1(){
		return Xmlb1;
	}
	public List<String> getXmlb2() {
		return Xmlb2;
	}
	public void setXmlb2(List<String> Xmlb2) {
		this.Xmlb2 = Xmlb2;
	}
	public List<String> getXmlb3() {
		return Xmlb3;
	}
	public void setXmlb3(List<String> Xmlb3) {
		this.Xmlb3 = Xmlb3;
	}
	public List<String> getXmlb4() {
		return Xmlb4;
	}
	public void setXmlb4(List<String> Xmlb4) {
		this.Xmlb4 = Xmlb4;
	}
	public List<String> getXmlb5() {
		return Xmlb5;
	}
	public void setXmlb5(List<String> Xmlb5) {
		this.Xmlb5 = Xmlb5;
	}


	
	public void wrong1(){
		String msg="不允许有空，查询失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
		
	public String execute() throws Exception{
		Title=getTitle();
		if(Title.length()==0){
			wrong1();
			return "error";
		}
		else{
				Connection con=null;
				Statement stmt=null;
				ResultSet rs=null;
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/科研成果";
				con = DriverManager.getConnection(url,"root","1234");
				stmt=con.createStatement();
				String sql1="select * from 科研项目 where 项目名称 like '%"+Title+"%'";
				rs=stmt.executeQuery(sql1);
				if(rs.first()){
					Xmlb1.add(rs.getString("项目名称"));
					while(rs.next()){
						Xmlb1.add(rs.getString("项目名称"));
					}
				}
				rs.close();
				
				String sql2="select * from 出版专著 where 专著名称 like '%"+Title+"%'";
				rs=stmt.executeQuery(sql2);
				if(rs.first()){
					Xmlb2.add(rs.getString("专著名称"));
					while(rs.next()){
						Xmlb2.add(rs.getString("专著名称"));
					}
				}
				rs.close();
				
				String sql3="select * from 获奖 where 项目名称 like '%"+Title+"%'";
				rs=stmt.executeQuery(sql3);
				if(rs.first()){
					Xmlb3.add(rs.getString("项目名称"));
					while(rs.next()){
						Xmlb3.add(rs.getString("项目名称"));
					}
				}
				rs.close();
				
				String sql4="select * from 学术兼职 where 学术团体名称 like '%"+Title+"%'";
				rs=stmt.executeQuery(sql4);
				if(rs.first()){
					Xmlb4.add(rs.getString("标识符"));
					while(rs.next()){
						Xmlb4.add(rs.getString("标识符"));
					}
				}
				rs.close();
				
				String sql5="select * from 专利 where 专利名称 like '%"+Title+"%'";
				rs=stmt.executeQuery(sql5);
				if(rs.first()){
					Xmlb5.add(rs.getString("专利名称"));
					while(rs.next()){
						Xmlb5.add(rs.getString("专利名称"));
					}
				}
				rs.close();
				
				stmt.close();
				con.close();
				return "success";
			}
				
				
			
		}
}
