package look;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;


public class lookbyadvanced extends ActionSupport{
	
	private String Name="";
	private String Title="";
	private String Time="";
	private String Type="";
	private String F1="";
	private String F2="";
	private String F3="";
	private String F4="";
	private String F5="";
	private String F6="";
	private String F7="";
	private String F8="";
	private String F9="";
	public String getF1() {
		return F1;
	}
	public void setF1(String f1) {
		F1 = f1;
	}
	public String getF2() {
		return F2;
	}
	public void setF2(String f2) {
		F2 = f2;
	}
	public String getF3() {
		return F3;
	}
	public void setF3(String f3) {
		F3 = f3;
	}
	public String getF4() {
		return F4;
	}
	public void setF4(String f4) {
		F4 = f4;
	}
	public String getF5() {
		return F5;
	}
	public void setF5(String f5) {
		F5 = f5;
	}
	public String getF6() {
		return F6;
	}
	public void setF6(String f6) {
		F6 = f6;
	}
	public String getF7() {
		return F7;
	}
	public void setF7(String f7) {
		F7 = f7;
	}
	public String getF8() {
		return F8;
	}
	public void setF8(String f8) {
		F8 = f8;
	}
	
	public String getF9() {
		return F9;
	}
	public void setF9(String f9) {
		F9 = f9;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String Time) {
		this.Time = Time;
	}
	public String getType() {
		return Type;
	}
	public void setType(String Type) {
		this.Type = Type;
	}

	List<String> Xmlb1=new ArrayList();
	List<String> Xmlb2=new ArrayList();
	List<String> Xmlb3=new ArrayList();
	List<String> Xmlb4=new ArrayList();
	List<String> Xmlb5=new ArrayList();
	List<String> Xmlb6=new ArrayList();
	List<String> Xmlb7=new ArrayList();
	List<String> Xmlb8=new ArrayList();
	List<String> Xmlb9=new ArrayList();
	
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
	public List<String> getXmlb6() {
		return Xmlb6;
	}
	public void setXmlb6(List<String> Xmlb6) {
		this.Xmlb6 = Xmlb6;
	}
	public List<String> getXmlb7() {
		return Xmlb7;
	}
	public void setXmlb7(List<String> Xmlb7) {
		this.Xmlb7 = Xmlb7;
	}
	public List<String> getXmlb8() {
		return Xmlb8;
	}
	public void setXmlb8(List<String> Xmlb8) {
		this.Xmlb8 = Xmlb8;
	}
	public List<String> getXmlb9() {
		return Xmlb9;
	}
	public void setXmlb9(List<String> Xmlb9) {
		this.Xmlb9 = Xmlb9;
	}

	
	public void wrong1(){
		String msg="������ȫΪ�գ���ѯʧ��";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="��Ϣ��ʾ";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
		
	public String execute() throws Exception{
		Name = getName();
		Title = getTitle();
		Type = getType();
		Time = getTime();
		if(Name.length()==0 && Title.length()==0 && Time.length()==0 && Type.length()==0){
			wrong1();
			return "error";
		}
		else{
			Connect c=new Connect();
			Connection con=c.getConnection();
			Statement stmt=null;
			ResultSet rs=null;
			stmt=con.createStatement();	
				String kyxm="";
				String cbzz="";
				String huojiang="";
				String xsjz="";
				String zhuanli="";
				String kyjf="";
				String jxxx="";
				String gjhz="";
				String rjzzq="";
				String sql1="",sql2="",sql3="",sql4="",sql5="",sql6="",sql7="",sql8="",sql9="";
				if(Name.length()!=0)
				{	
					kyxm += " and ��Ŀ������ like '%"+Name+"%'";
					cbzz += " and �������� like '%"+Name+"%'";
					huojiang += " and ����Ա���� like '%"+Name+"%'";
					xsjz += " and ���� like '%"+Name+"%'";
					zhuanli += " and ��Ա���� like '%"+Name+"%'";
					kyjf += " and ��Ŀ������ like '%"+Name+"%'";
					jxxx += " and ��Ա���� like '%"+Name+"%'";
					gjhz += " and ��Ա���� like '%"+Name+"%'";
					rjzzq += " and ��Ա���� like '%"+Name+"%'";
				}
				if(Time.length()!=0)
				{
					kyxm += " and ��������ʱ�� like '%"+Time+"%'";
					cbzz += " and ����ʱ�� like '%"+Time+"%'";
					huojiang += " and ��ʱ�� like '%"+Time+"%'";
					xsjz += " and ��ְ��ʼʱ�� like '%"+Time+"%'";
					zhuanli += " and ʱ�� like '%"+Time+"%'";
					kyjf += " and ��� like '%"+Time+"%'";
					jxxx += " and ��ʼʱ�� like '%"+Time+"%'";
					gjhz += " and ��ʼʱ�� like '%"+Time+"%'";
					rjzzq += " and ����ʱ�� like '%"+Time+"%'";
				}
				if(Title.length()!=0)
				{
					kyxm += " and ��Ŀ���� like '%"+Title+"%'";
					cbzz += " and ר������ like '%"+Title+"%'";
					huojiang += " and ��Ŀ���� like '%"+Title+"%'";
					xsjz += " and ѧ���������� like '%"+Title+"%'";
					zhuanli += " and ר������ like '%"+Title+"%'";
					kyjf += " and ��Ŀ���� like '%"+Title+"%'";
					jxxx += " and ����ѧϰ���� like '%"+Title+"%'";
					gjhz += " and �������� like '%"+Title+"%'";
					rjzzq += " and �������Ȩ���� like '%"+Title+"%'";
				}
				if(kyxm.equals(""))
					sql1="select * from ������Ŀ";
				else
					sql1="select * from ������Ŀ where" + kyxm.substring(kyxm.indexOf(" and")+4);
				if(cbzz.equals(""))
					sql2="select * from ����ר��";
				else
					sql2="select * from ����ר�� where" + cbzz.substring(cbzz.indexOf(" and")+4);
				if(huojiang.equals(""))
					sql3="select * from ��";
				else
					sql3="select * from �� where" + huojiang.substring(huojiang.indexOf(" and")+4);
				if(xsjz.equals(""))
					sql4="select * from ѧ����ְ";
				else
					sql4="select * from ѧ����ְ where" + xsjz.substring(xsjz.indexOf(" and")+4);
				if(zhuanli.equals(""))
					sql5="select * from ר��";
				else
					sql5="select * from ר�� where" + zhuanli.substring(zhuanli.indexOf(" and")+4);
				if(jxxx.equals(""))
					sql6="select * from ����ѧϰ";
				else
					sql6="select * from ����ѧϰ where" + jxxx.substring(jxxx.indexOf(" and")+4);
				if(gjhz.equals(""))
					sql7="select * from ���ʺ���";
				else
					sql7="select * from ���ʺ��� where" + gjhz.substring(gjhz.indexOf(" and")+4);
				if(gjhz.equals(""))
					sql8="select * from ���о���";
				else
					sql8="select * from ���о��� where" + kyjf.substring(kyjf.indexOf(" and")+4);
				if(rjzzq.equals(""))
					sql9="select * from �������Ȩ";
				else
					sql9="select * from �������Ȩ where" + rjzzq.substring(rjzzq.indexOf(" and")+4);
				if(Type.length()==0)
				{
					rs=stmt.executeQuery(sql1);
					if(rs.first()){
						Xmlb1.add(rs.getString("��Ŀ����"));
						while(rs.next()){
							Xmlb1.add(rs.getString("��Ŀ����"));
						}
						if(Xmlb1 != null)
							setF1("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql2);
					if(rs.first()){
						Xmlb2.add(rs.getString("ר������"));
						while(rs.next()){
							Xmlb2.add(rs.getString("ר������"));
						}
						if(Xmlb2 != null)
							setF2("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql3);
					if(rs.first()){
						Xmlb3.add(rs.getString("��Ŀ����"));
						while(rs.next()){
							Xmlb3.add(rs.getString("��Ŀ����"));
						}
						if(Xmlb3 != null)
							setF3("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql4);
					if(rs.first()){
						Xmlb4.add(rs.getString("��ʶ��"));
						while(rs.next()){
							Xmlb4.add(rs.getString("��ʶ��"));
						}
						if(Xmlb4 != null)
							setF4("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql5);
					if(rs.first()){
						Xmlb5.add(rs.getString("ר������"));
						while(rs.next()){
							Xmlb5.add(rs.getString("ר������"));
						}
						if(Xmlb5 != null)
							setF5("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql6);
					if(rs.first()){
						Xmlb6.add(rs.getString("��ʶ��"));
						while(rs.next()){
							Xmlb6.add(rs.getString("��ʶ��"));
						}
						if(Xmlb6 != null)
							setF6("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql7);
					if(rs.first()){
						Xmlb7.add(rs.getString("��������"));
						while(rs.next()){
							Xmlb7.add(rs.getString("��������"));
						}
						if(Xmlb7 != null)
							setF7("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql8);
					if(rs.first()){
						Xmlb8.add(rs.getString("��ʶ��"));
						while(rs.next()){
							Xmlb8.add(rs.getString("��ʶ��"));
						}
						if(Xmlb8 != null)
							setF8("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql9);
					if(rs.first()){
						Xmlb9.add(rs.getString("�������Ȩ����"));
						while(rs.next()){
							Xmlb9.add(rs.getString("�������Ȩ����"));
						}
						if(Xmlb9 != null)
							setF9("1");
					}
					rs.close();
				} else{
					if(Type.equals("������Ŀ"))
					{
						rs=stmt.executeQuery(sql1);
						if(rs.first()){
							Xmlb1.add(rs.getString("��Ŀ����"));
							while(rs.next()){
								Xmlb1.add(rs.getString("��Ŀ����"));
							}
							if(Xmlb1 != null)
							{
								setF1("1");
								
							}
						}
						
						rs.close();
					}
					else if(Type.equals("����ר��"))
					{
						rs=stmt.executeQuery(sql2);
						if(rs.first()){
							Xmlb2.add(rs.getString("ר������"));
							while(rs.next()){
								Xmlb2.add(rs.getString("ר������"));
							}
							if(Xmlb2 != null)
								setF2("1");
						}
						rs.close();
					}
					else if(Type.equals("��"))
					{
						rs=stmt.executeQuery(sql3);
						if(rs.first()){
							Xmlb3.add(rs.getString("��Ŀ����"));
							while(rs.next()){
								Xmlb3.add(rs.getString("��Ŀ����"));
							}
							if(Xmlb3 != null)
								setF3("1");
						}
						rs.close();
					}
					else if(Type.equals("ѧ����ְ"))
					{
						rs=stmt.executeQuery(sql4);
						if(rs.first()){
							Xmlb4.add(rs.getString("��ʶ��"));
							while(rs.next()){
								Xmlb4.add(rs.getString("��ʶ��"));
							}
							if(Xmlb4 != null)
								setF4("1");
						}
						rs.close();
					}
					else if(Type.equals("ר��"))
					{
						rs=stmt.executeQuery(sql5);
						if(rs.first()){
							Xmlb5.add(rs.getString("ר������"));
							while(rs.next()){
								Xmlb5.add(rs.getString("ר������"));
							}
							if(Xmlb5 != null)
								setF5("1");
						}
						rs.close();
					}
					else if(Type.equals("����ѧϰ"))
					{
						rs=stmt.executeQuery(sql6);
						if(rs.first()){
							Xmlb6.add(rs.getString("��ʶ��"));
							while(rs.next()){
								Xmlb6.add(rs.getString("��ʶ��"));
							}
							if(Xmlb6 != null)
								setF6("1");
						}
						rs.close();
					}
					else if(Type.equals("���ʺ���"))
					{
						rs=stmt.executeQuery(sql7);
						if(rs.first()){
							Xmlb7.add(rs.getString("��������"));
							while(rs.next()){
								Xmlb7.add(rs.getString("��������"));
							}
							if(Xmlb7 != null)
								setF7("1");
						}
						rs.close();
					}
					else if(Type.equals("���о���"))
					{
						rs=stmt.executeQuery(sql8);
						if(rs.first()){
							Xmlb8.add(rs.getString("��ʶ��"));
							while(rs.next()){
								Xmlb8.add(rs.getString("��ʶ��"));
							}
							if(Xmlb8 != null)
								setF8("1");
						}
						rs.close();
					}
					else if(Type.equals("�������Ȩ"))
					{
						rs=stmt.executeQuery(sql9);
						if(rs.first()){
							Xmlb9.add(rs.getString("�������Ȩ����"));
							while(rs.next()){
								Xmlb9.add(rs.getString("�������Ȩ����"));
							}
							if(Xmlb9 != null)
								setF9("1");
						}
						rs.close();
					}
				}
				stmt.close();
				con.close();
				return "success";
			}
				
				
			
		}
}
	
