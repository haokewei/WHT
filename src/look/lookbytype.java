package look;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;


public class lookbytype extends ActionSupport{
	private String Type;
	public String getType() {
		return Type;
	}
	public void setType(String Type) {
		this.Type = Type;
	}


	List<String> Xmlb1=new ArrayList();
	

	public void setXmlb1(ArrayList<String> Xmlb1){
		this.Xmlb1=Xmlb1;
	}
	public List<String> getXmlb1(){
		return Xmlb1;
	}
	
	
	public void wrong1(){
		String msg="不允许有空，查询失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public void wrong2(){
		String msg="输入不准确，查询失败，请参照提示类别";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public String execute() throws Exception{
		Type=getType();
		if(Type.length()==0){
			wrong1();
			return "error";
		}
		else{
			Connect c=new Connect();
			Connection con=c.getConnection();
			Statement stmt=null;
			ResultSet rs=null;
			stmt=con.createStatement();	
				
				if (Type.equals("科研项目") )
				{
				String sql1="select * from 科研项目";
				rs=stmt.executeQuery(sql1);
				if(rs.first()){
					Xmlb1.add(rs.getString("项目名称"));
					while(rs.next()){
						Xmlb1.add(rs.getString("项目名称"));
					}
				}
				rs.close();
				}
				
				else if(Type.equals("出版专著"))
				{
				String sql2="select * from 出版专著 ";
				rs=stmt.executeQuery(sql2);
				if(rs.first()){
					Xmlb1.add(rs.getString("专著名称"));
					while(rs.next()){
						Xmlb1.add(rs.getString("专著名称"));
					}
				}
				rs.close();
				}
				
				else if(Type.equals("获奖"))
				{
				String sql3="select * from 获奖";
				rs=stmt.executeQuery(sql3);
				if(rs.first()){
					Xmlb1.add(rs.getString("项目名称"));
					while(rs.next()){
						Xmlb1.add(rs.getString("项目名称"));
					}
				}
				rs.close();
				}
				
				
				else if(Type.equals("学术兼职"))
				{
				String sql4="select * from 学术兼职 ";
				rs=stmt.executeQuery(sql4);
				if(rs.first()){
					Xmlb1.add(rs.getString("标识符"));
					while(rs.next()){
						Xmlb1.add(rs.getString("标识符"));
					}
				}
				rs.close();
				}
				
				else if(Type.equals("专利"))
				{
				String sql5="select * from 专利 ";
				rs=stmt.executeQuery(sql5);
				if(rs.first()){
					Xmlb1.add(rs.getString("专利名称"));
					while(rs.next()){
						Xmlb1.add(rs.getString("专利名称"));
					}
				}
				rs.close();
				}
				else
				{
					wrong2();
					stmt.close();
					con.close();
					return "error";
				}
				stmt.close();
				con.close();
				return "success";
			}
				
				
			
		}
}
