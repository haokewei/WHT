package look;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

import keyanxiangmu.*;

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
		String msg="�������пգ���ѯʧ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public void wrong2(){
		String msg="���벻׼ȷ����ѯʧ�ܣ��������ʾ���";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public String execute() throws Exception{
		Type=getType();
		if(Type.length()==0){
			wrong1();
			return "error";
		}
		else{
				Connection con=null;
				Statement stmt=null;
				ResultSet rs=null;
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/���гɹ�";
				con = DriverManager.getConnection(url,"root","1234");
				stmt=con.createStatement();
				
				if (Type.equals("������Ŀ") )
				{
				String sql1="select * from ������Ŀ";
				rs=stmt.executeQuery(sql1);
				if(rs.first()){
					Xmlb1.add(rs.getString("��Ŀ����"));
					while(rs.next()){
						Xmlb1.add(rs.getString("��Ŀ����"));
					}
				}
				rs.close();
				}
				
				else if(Type.equals("����ר��"))
				{
				String sql2="select * from ����ר�� ";
				rs=stmt.executeQuery(sql2);
				if(rs.first()){
					Xmlb1.add(rs.getString("ר������"));
					while(rs.next()){
						Xmlb1.add(rs.getString("ר������"));
					}
				}
				rs.close();
				}
				
				else if(Type.equals("��"))
				{
				String sql3="select * from ��";
				rs=stmt.executeQuery(sql3);
				if(rs.first()){
					Xmlb1.add(rs.getString("��Ŀ����"));
					while(rs.next()){
						Xmlb1.add(rs.getString("��Ŀ����"));
					}
				}
				rs.close();
				}
				
				
				else if(Type.equals("ѧ����ְ"))
				{
				String sql4="select * from ѧ����ְ ";
				rs=stmt.executeQuery(sql4);
				if(rs.first()){
					Xmlb1.add(rs.getString("��ʶ��"));
					while(rs.next()){
						Xmlb1.add(rs.getString("��ʶ��"));
					}
				}
				rs.close();
				}
				
				else if(Type.equals("ר��"))
				{
				String sql5="select * from ר�� ";
				rs=stmt.executeQuery(sql5);
				if(rs.first()){
					Xmlb1.add(rs.getString("ר������"));
					while(rs.next()){
						Xmlb1.add(rs.getString("ר������"));
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
