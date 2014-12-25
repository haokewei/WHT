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
		String msg="不允许全为空，查询失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
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
					kyxm += " and 项目负责人 like '%"+Name+"%'";
					cbzz += " and 著者名单 like '%"+Name+"%'";
					huojiang += " and 获奖人员名单 like '%"+Name+"%'";
					xsjz += " and 姓名 like '%"+Name+"%'";
					zhuanli += " and 人员名单 like '%"+Name+"%'";
					kyjf += " and 项目负责人 like '%"+Name+"%'";
					jxxx += " and 人员姓名 like '%"+Name+"%'";
					gjhz += " and 人员名单 like '%"+Name+"%'";
					rjzzq += " and 人员名单 like '%"+Name+"%'";
				}
				if(Time.length()!=0)
				{
					kyxm += " and 鉴定验收时间 like '%"+Time+"%'";
					cbzz += " and 出版时间 like '%"+Time+"%'";
					huojiang += " and 获奖时间 like '%"+Time+"%'";
					xsjz += " and 任职开始时间 like '%"+Time+"%'";
					zhuanli += " and 时间 like '%"+Time+"%'";
					kyjf += " and 年份 like '%"+Time+"%'";
					jxxx += " and 开始时间 like '%"+Time+"%'";
					gjhz += " and 开始时间 like '%"+Time+"%'";
					rjzzq += " and 授予时间 like '%"+Time+"%'";
				}
				if(Title.length()!=0)
				{
					kyxm += " and 项目名称 like '%"+Title+"%'";
					cbzz += " and 专著名称 like '%"+Title+"%'";
					huojiang += " and 项目名称 like '%"+Title+"%'";
					xsjz += " and 学术团体名称 like '%"+Title+"%'";
					zhuanli += " and 专利名称 like '%"+Title+"%'";
					kyjf += " and 项目名称 like '%"+Title+"%'";
					jxxx += " and 进修学习内容 like '%"+Title+"%'";
					gjhz += " and 报告名称 like '%"+Title+"%'";
					rjzzq += " and 软件著作权名称 like '%"+Title+"%'";
				}
				if(kyxm.equals(""))
					sql1="select * from 科研项目";
				else
					sql1="select * from 科研项目 where" + kyxm.substring(kyxm.indexOf(" and")+4);
				if(cbzz.equals(""))
					sql2="select * from 出版专著";
				else
					sql2="select * from 出版专著 where" + cbzz.substring(cbzz.indexOf(" and")+4);
				if(huojiang.equals(""))
					sql3="select * from 获奖";
				else
					sql3="select * from 获奖 where" + huojiang.substring(huojiang.indexOf(" and")+4);
				if(xsjz.equals(""))
					sql4="select * from 学术兼职";
				else
					sql4="select * from 学术兼职 where" + xsjz.substring(xsjz.indexOf(" and")+4);
				if(zhuanli.equals(""))
					sql5="select * from 专利";
				else
					sql5="select * from 专利 where" + zhuanli.substring(zhuanli.indexOf(" and")+4);
				if(jxxx.equals(""))
					sql6="select * from 进修学习";
				else
					sql6="select * from 进修学习 where" + jxxx.substring(jxxx.indexOf(" and")+4);
				if(gjhz.equals(""))
					sql7="select * from 国际合作";
				else
					sql7="select * from 国际合作 where" + gjhz.substring(gjhz.indexOf(" and")+4);
				if(gjhz.equals(""))
					sql8="select * from 科研经费";
				else
					sql8="select * from 科研经费 where" + kyjf.substring(kyjf.indexOf(" and")+4);
				if(rjzzq.equals(""))
					sql9="select * from 软件著作权";
				else
					sql9="select * from 软件著作权 where" + rjzzq.substring(rjzzq.indexOf(" and")+4);
				if(Type.length()==0)
				{
					rs=stmt.executeQuery(sql1);
					if(rs.first()){
						Xmlb1.add(rs.getString("项目名称"));
						while(rs.next()){
							Xmlb1.add(rs.getString("项目名称"));
						}
						if(Xmlb1 != null)
							setF1("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql2);
					if(rs.first()){
						Xmlb2.add(rs.getString("专著名称"));
						while(rs.next()){
							Xmlb2.add(rs.getString("专著名称"));
						}
						if(Xmlb2 != null)
							setF2("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql3);
					if(rs.first()){
						Xmlb3.add(rs.getString("项目名称"));
						while(rs.next()){
							Xmlb3.add(rs.getString("项目名称"));
						}
						if(Xmlb3 != null)
							setF3("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql4);
					if(rs.first()){
						Xmlb4.add(rs.getString("标识符"));
						while(rs.next()){
							Xmlb4.add(rs.getString("标识符"));
						}
						if(Xmlb4 != null)
							setF4("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql5);
					if(rs.first()){
						Xmlb5.add(rs.getString("专利名称"));
						while(rs.next()){
							Xmlb5.add(rs.getString("专利名称"));
						}
						if(Xmlb5 != null)
							setF5("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql6);
					if(rs.first()){
						Xmlb6.add(rs.getString("标识符"));
						while(rs.next()){
							Xmlb6.add(rs.getString("标识符"));
						}
						if(Xmlb6 != null)
							setF6("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql7);
					if(rs.first()){
						Xmlb7.add(rs.getString("报告名称"));
						while(rs.next()){
							Xmlb7.add(rs.getString("报告名称"));
						}
						if(Xmlb7 != null)
							setF7("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql8);
					if(rs.first()){
						Xmlb8.add(rs.getString("标识符"));
						while(rs.next()){
							Xmlb8.add(rs.getString("标识符"));
						}
						if(Xmlb8 != null)
							setF8("1");
					}
					rs.close();
					
					rs=stmt.executeQuery(sql9);
					if(rs.first()){
						Xmlb9.add(rs.getString("软件著作权名称"));
						while(rs.next()){
							Xmlb9.add(rs.getString("软件著作权名称"));
						}
						if(Xmlb9 != null)
							setF9("1");
					}
					rs.close();
				} else{
					if(Type.equals("科研项目"))
					{
						rs=stmt.executeQuery(sql1);
						if(rs.first()){
							Xmlb1.add(rs.getString("项目名称"));
							while(rs.next()){
								Xmlb1.add(rs.getString("项目名称"));
							}
							if(Xmlb1 != null)
							{
								setF1("1");
								
							}
						}
						
						rs.close();
					}
					else if(Type.equals("出版专著"))
					{
						rs=stmt.executeQuery(sql2);
						if(rs.first()){
							Xmlb2.add(rs.getString("专著名称"));
							while(rs.next()){
								Xmlb2.add(rs.getString("专著名称"));
							}
							if(Xmlb2 != null)
								setF2("1");
						}
						rs.close();
					}
					else if(Type.equals("获奖"))
					{
						rs=stmt.executeQuery(sql3);
						if(rs.first()){
							Xmlb3.add(rs.getString("项目名称"));
							while(rs.next()){
								Xmlb3.add(rs.getString("项目名称"));
							}
							if(Xmlb3 != null)
								setF3("1");
						}
						rs.close();
					}
					else if(Type.equals("学术兼职"))
					{
						rs=stmt.executeQuery(sql4);
						if(rs.first()){
							Xmlb4.add(rs.getString("标识符"));
							while(rs.next()){
								Xmlb4.add(rs.getString("标识符"));
							}
							if(Xmlb4 != null)
								setF4("1");
						}
						rs.close();
					}
					else if(Type.equals("专利"))
					{
						rs=stmt.executeQuery(sql5);
						if(rs.first()){
							Xmlb5.add(rs.getString("专利名称"));
							while(rs.next()){
								Xmlb5.add(rs.getString("专利名称"));
							}
							if(Xmlb5 != null)
								setF5("1");
						}
						rs.close();
					}
					else if(Type.equals("进修学习"))
					{
						rs=stmt.executeQuery(sql6);
						if(rs.first()){
							Xmlb6.add(rs.getString("标识符"));
							while(rs.next()){
								Xmlb6.add(rs.getString("标识符"));
							}
							if(Xmlb6 != null)
								setF6("1");
						}
						rs.close();
					}
					else if(Type.equals("国际合作"))
					{
						rs=stmt.executeQuery(sql7);
						if(rs.first()){
							Xmlb7.add(rs.getString("报告名称"));
							while(rs.next()){
								Xmlb7.add(rs.getString("报告名称"));
							}
							if(Xmlb7 != null)
								setF7("1");
						}
						rs.close();
					}
					else if(Type.equals("科研经费"))
					{
						rs=stmt.executeQuery(sql8);
						if(rs.first()){
							Xmlb8.add(rs.getString("标识符"));
							while(rs.next()){
								Xmlb8.add(rs.getString("标识符"));
							}
							if(Xmlb8 != null)
								setF8("1");
						}
						rs.close();
					}
					else if(Type.equals("软件著作权"))
					{
						rs=stmt.executeQuery(sql9);
						if(rs.first()){
							Xmlb9.add(rs.getString("软件著作权名称"));
							while(rs.next()){
								Xmlb9.add(rs.getString("软件著作权名称"));
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
	
