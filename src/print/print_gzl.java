

package print;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.opensymphony.xwork2.ActionSupport;

import connect.Connect;
public class print_gzl extends ActionSupport{
private String Lujing;
private String Time;

public String getTime() {
	return Time;
}
public void setTime(String Time) {
	this.Time = Time;
}
public String getLujing() {
	return Lujing;
}
public void setLujing(String lujing) {
	this.Lujing = lujing;
}
public String execute() throws Exception
{
	Connect c=new Connect();
	Connection con=c.getConnection();
	Statement stmt=null;
	Statement stmt1=null;
	Statement stmt2=null;
	Statement stmt3=null;
	ResultSet rs=null;
	ResultSet rs0=null;
	Time=getTime();
	String Xm="b";
	String Dw="b";
	float HJ[]={1,(float)0.9,(float)0.8,(float)0.7,(float)0.6,(float)0.5,(float)0.4,(float)0.3,(float)0.2,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1};
	float ZL[]={1,(float)0.6,(float)0.3,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1};
	int x1=0;
	String x2="";
	String sql6="select * from 老师 ";	
	String sql12="delete from 个人统计 ";
	String sql7="insert into 个人统计 "+"(姓名,单位,出版专著数量,出版专著明细,获奖数量,获奖明细,科研项目数量,科研项目明细,学术兼职数量,学术兼职明细,专利数量,专利明细,国际合作数量,国际合作明细,科研经费数量,科研经费明细,软件著作权数量,软件著作权明细,进修学习数量,进修学习明细,总数量)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";	
	stmt=con.createStatement();
	stmt1=con.createStatement();
	stmt2=con.createStatement();
	stmt3=con.createStatement();
	stmt3.executeUpdate(sql12);
	rs0=stmt.executeQuery(sql6);
	if(rs0.first()){
		Xm=rs0.getString("姓名");
		Dw=rs0.getString("单位");
		sql7="insert into 个人统计 "+"(姓名,单位,出版专著数量,出版专著明细,获奖数量,获奖明细,科研项目数量,科研项目明细,学术兼职数量,学术兼职明细,专利数量,专利明细,国际合作数量,国际合作明细,科研经费数量,科研经费明细,软件著作权数量,软件著作权明细,进修学习数量,进修学习明细,总数量)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";
		stmt1.executeUpdate(sql7);
		while(rs0.next()){
			
			Xm=rs0.getString("姓名");
			Dw=rs0.getString("单位");
			sql7="insert into 个人统计 "+"(姓名,单位,出版专著数量,出版专著明细,获奖数量,获奖明细,科研项目数量,科研项目明细,学术兼职数量,学术兼职明细,专利数量,专利明细,国际合作数量,国际合作明细,科研经费数量,科研经费明细,软件著作权数量,软件著作权明细,进修学习数量,进修学习明细,总数量)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";
			stmt1.execute(sql7);
			}
	}
	rs0.close();
	
	if(Time.length()==0){
		return "incomplete";
	}
	else{
			
			String xingming;
			String mingxi;
			String sql0;
			String sql8;
			int shuliang;
			int zongshuliang;
			String sql1="select * from 科研项目 where 鉴定验收时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql1);
			if(rs.first()){
				xingming=rs.getString("项目负责人");
				sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				if(rs0.first())
				{
					mingxi=rs0.getString("科研项目明细").concat(",".concat(rs.getString("项目名称")));
					shuliang=rs0.getInt("科研项目数量")+1;
					zongshuliang=rs0.getInt("总数量")+1;
					sql8="update 个人统计 set 科研项目明细='"+mingxi+"',科研项目数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stmt2.executeUpdate(sql8);
				}
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("项目负责人");
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						mingxi=rs0.getString("科研项目明细").concat(",".concat(rs.getString("项目名称")));
						shuliang=rs0.getInt("科研项目数量")+1;
						zongshuliang=rs0.getInt("总数量")+1;
						sql8="update 个人统计 set 科研项目明细='"+mingxi+"',科研项目数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
			}
			rs.close();
			
			String sql2="select * from 出版专著 where 出版时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql2);
			if(rs.first()){
				String temp=rs.getString("著者名单");
				String[] temp1=temp.split(",");
				int i=0;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						mingxi=rs0.getString("出版专著明细").concat(rs.getString("专著名称").concat(","));
						shuliang=rs0.getInt("出版专著数量")+1;
						zongshuliang=rs0.getInt("总数量")+1;
						sql8="update 个人统计 set 出版专著明细='"+mingxi+"',出版专著数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
				while(rs.next()){
					temp=rs.getString("著者名单");
					temp1=temp.split(",");
					i=0;
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
						rs0=stmt1.executeQuery(sql0);
						if(rs0.first())
						{
							mingxi=rs0.getString("出版专著明细").concat(rs.getString("专著名称").concat(","));
							shuliang=rs0.getInt("出版专著数量")+1;
							zongshuliang=rs0.getInt("总数量")+1;
							sql8="update 个人统计 set 出版专著明细='"+mingxi+"',出版专著数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
							stmt2.executeUpdate(sql8);
						}
						rs0.close();
					}
				}
			}
			rs.close();
			
			String sql3="select * from 获奖 where 获奖时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql3);
			if(rs.first()){
				String temp=rs.getString("获奖人员名单");
				String[] temp1=temp.split(",");
				int i=0;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						mingxi=rs0.getString("获奖明细").concat(rs.getString("项目名称").concat(","));
						shuliang=rs0.getInt("获奖数量")+1;
						zongshuliang=rs0.getInt("总数量")+1;
						sql8="update 个人统计 set 获奖明细='"+mingxi+"',获奖数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
				while(rs.next()){
					temp=rs.getString("获奖人员名单");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
						rs0=stmt1.executeQuery(sql0);
						if(rs0.first())
						{
							mingxi=rs0.getString("获奖明细").concat(rs.getString("项目名称").concat(","));
							shuliang=rs0.getInt("获奖数量")+1;
							zongshuliang=rs0.getInt("总数量")+1;
							sql8="update 个人统计 set 获奖明细='"+mingxi+"',获奖数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
							stmt2.executeUpdate(sql8);
						}
						rs0.close();
					}
				}
			}
			rs.close();
			
			String sql4="select * from 学术兼职 where 任职开始时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql4);
			if(rs.first()){
				xingming=rs.getString("姓名");
				sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				if(rs0.first())
				{
					mingxi=rs0.getString("学术兼职明细").concat(rs.getString("学术团体名称").concat(","));
					shuliang=rs0.getInt("学术兼职数量")+1;
					zongshuliang=rs0.getInt("总数量")+1;
					sql8="update 个人统计 set 学术兼职明细='"+mingxi+"',学术兼职数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stmt2.executeUpdate(sql8);
				}
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("姓名");
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						mingxi=rs0.getString("学术兼职明细").concat(rs.getString("学术团体名称").concat(","));
						shuliang=rs0.getInt("学术兼职数量")+1;
						zongshuliang=rs0.getInt("总数量")+1;
						sql8="update 个人统计 set 学术兼职明细='"+mingxi+"',学术兼职数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
			}
			rs.close();
			
			String sql5="select * from 专利 where 时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql5);
			if(rs.first()){
				String temp=rs.getString("人员名单");
				String[] temp1=temp.split(",");
				int i;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first()){
						mingxi=rs0.getString("专利明细").concat(rs.getString("专利名称").concat(","));
						shuliang=rs0.getInt("专利数量")+1;
						zongshuliang=rs0.getInt("总数量")+1;
						sql8="update 个人统计 set 专利明细='"+mingxi+"',专利数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
				while(rs.next()){
					temp=rs.getString("人员名单");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
						rs0=stmt1.executeQuery(sql0);
						if(rs0.first()){
							mingxi=rs0.getString("专利明细").concat(rs.getString("专利名称").concat(","));
							shuliang=rs0.getInt("专利数量")+1;
							zongshuliang=rs0.getInt("总数量")+1;
							sql8="update 个人统计 set 专利明细='"+mingxi+"',专利数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
							stmt2.executeUpdate(sql8);
						}
						rs0.close();
					}
				}
			}
			rs.close();
			
			String sq1="select * from 国际合作 where 开始时间 = '"+Time+"'";
			Statement stm1=null;
			Statement stm2=null;
			Statement stm3=null;
			ResultSet r1=null;
			stm1=con.createStatement();
			stm2=con.createStatement();
			stm3=con.createStatement();
			r1=stm1.executeQuery(sq1);
			if(r1.first()){
				String temp=r1.getString("人员名单");
				String[] temp1=temp.split(",");
				int i;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						mingxi=rs0.getString("国际合作明细").concat(r1.getString("报告名称").concat(","));
						shuliang=rs0.getInt("国际合作数量")+1;
						zongshuliang=rs0.getInt("总数量")+1;
						sq1="update 个人统计 set 国际合作明细='"+mingxi+"',国际合作数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
						stm3.executeUpdate(sq1);
					}
					rs0.close();
				}
				while(r1.next()){
					temp=r1.getString("人员名单");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
						rs0=stmt2.executeQuery(sql0);
						if(rs0.first()){
							mingxi=rs0.getString("国际合作明细").concat(r1.getString("报告名称").concat(","));
							shuliang=rs0.getInt("国际合作数量")+1;
							zongshuliang=rs0.getInt("总数量")+1;
							sq1="update 个人统计 set 国际合作明细='"+mingxi+"',国际合作数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
							stm3.executeUpdate(sq1);
						}
						rs0.close();
					}
				}
			}
			r1.close();
			
			String sq2="select * from 进修学习 where 开始时间 = '"+Time+"'";
	
			ResultSet r2=null;
			r2=stm1.executeQuery(sq2);
			if(r2.first()){
				String temp=r2.getString("人员姓名");
				String[] temp1=temp.split(",");
				int i;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						mingxi=rs0.getString("进修学习明细").concat(r2.getString("进修学习内容").concat(","));
						shuliang=rs0.getInt("进修学习数量")+1;
						zongshuliang=rs0.getInt("总数量")+1;
						sq2="update 个人统计 set 进修学习明细='"+mingxi+"',进修学习数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
						stm3.executeUpdate(sq2);
					}
					rs0.close();
				}
				while(r2.next()){
					temp=r2.getString("人员姓名");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
						rs0=stmt2.executeQuery(sql0);
						if(rs0.first()){
							mingxi=rs0.getString("进修学习明细").concat(r2.getString("进修学习内容").concat(","));
							shuliang=rs0.getInt("进修学习数量")+1;
							zongshuliang=rs0.getInt("总数量")+1;
							sq2="update 个人统计 set 进修学习明细='"+mingxi+"',进修学习数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
							stm3.executeUpdate(sq2);
						}
						rs0.close();
					}
				}
			}
			r2.close();
			
			
			String sq3="select * from 科研经费 where 年份 = '"+Time+"'";
			
			ResultSet r3=null;
			
			r3=stm1.executeQuery(sq3);
			if(r3.first()){
				xingming=r3.getString("项目负责人");
				sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
				rs0=stmt2.executeQuery(sql0);
				if(rs0.first())
				{
					mingxi=rs0.getString("科研经费明细").concat(r3.getString("项目名称").concat(","));
					shuliang=rs0.getInt("科研经费数量")+1;
					zongshuliang=rs0.getInt("总数量")+1;
					sq3="update 个人统计 set 科研经费明细='"+mingxi+"',科研经费数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stm3.executeUpdate(sq3);
				}
				rs0.close();
				while(r3.next()){
					xingming=r3.getString("项目负责人");
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						mingxi=rs0.getString("科研经费明细").concat(r3.getString("项目名称").concat(","));
						shuliang=rs0.getInt("科研经费数量")+1;
						zongshuliang=rs0.getInt("总数量")+1;
						sq3="update 个人统计 set 科研经费明细='"+mingxi+"',科研经费数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
						stm3.executeUpdate(sq3);
					}
					rs0.close();
				}
			}
			r3.close();
			
			String sq4="select * from 软件著作权 where 授予时间 = '"+Time+"'";
			
			ResultSet r4=null;
			
			r4=stm1.executeQuery(sq4);
			if(r4.first()){
				String temp=r4.getString("人员名单");
				String[] temp1=temp.split(",");
				int i;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						mingxi=rs0.getString("软件著作权明细").concat(r4.getString("软件著作权名称").concat(","));
						shuliang=rs0.getInt("软件著作权数量")+1;
						zongshuliang=rs0.getInt("总数量")+1;
						sq4="update 个人统计 set 软件著作权明细='"+mingxi+"',软件著作权数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
						stm3.executeUpdate(sq4);
					}
					rs0.close();
				}
				while(r4.next()){
					temp=r4.getString("人员名单");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
						rs0=stmt2.executeQuery(sql0);
						if(rs0.first()){
							mingxi=rs0.getString("软件著作权明细").concat(r4.getString("软件著作权名称").concat(","));
							shuliang=rs0.getInt("软件著作权数量")+1;
							zongshuliang=rs0.getInt("总数量")+1;
							sq4="update 个人统计 set 软件著作权明细='"+mingxi+"',软件著作权数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
							stm3.executeUpdate(sq4);
						}
						rs0.close();
					}
				}
			}
			r4.close();
			
		}
	
	
	
	
	
	
	
	
		

stmt.close();
stmt1.close();
stmt2.close();
stmt3.close();
con.close() ;
return "success";
}
}

