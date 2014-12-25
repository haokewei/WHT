

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
public class print_dw extends ActionSupport{
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
	String Zwzc="b";
	int Gj=0;
	String Gw="b";
	float Gjfz=0;
	float Ldjf=0;
	float Zfz=0;
	float HJ[]={1,(float)0.9,(float)0.8,(float)0.7,(float)0.6,(float)0.5,(float)0.4,(float)0.3,(float)0.2,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1};
	float ZL[]={1,(float)0.6,(float)0.3,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1,(float)0.1};
	float x1=0;
	float x2=0;
	String sql6="select * from 老师 ";	
	String sql12="delete from 工作量统计表 ";
	String sql7="insert into 工作量统计表 "+"(姓名,单位,职务职称,岗级,岗位,岗级分值,领导加分,出版专著分值,获奖分值,科研项目分值,学术兼职分值,专利分值,国际合作分值,科研经费分值,软件著作权分值,进修学习分值,总分值)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+"'"+Zwzc+"'"+","+""+Gj+""+","+"'"+Gw+"'"+","+""+Gjfz+""+","+""+Ldjf+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+Zfz+""+") ";	
	stmt=con.createStatement();
	stmt1=con.createStatement();
	stmt2=con.createStatement();
	stmt3=con.createStatement();
	stmt3.executeUpdate(sql12);
	rs0=stmt.executeQuery(sql6);
	if(rs0.first()){
		Xm=rs0.getString("姓名");
		Dw=rs0.getString("单位");
		Zwzc=rs0.getString("职务职称");
		Gj=rs0.getInt("岗级");
		Gw=rs0.getString("岗位");
		Gjfz=rs0.getFloat("岗级分值");
		Ldjf=rs0.getFloat("领导加分");
		Zfz=Gjfz+Ldjf;
		sql7="insert into 工作量统计表 "+"(姓名,单位,职务职称,岗级,岗位,岗级分值,领导加分,出版专著分值,获奖分值,科研项目分值,学术兼职分值,专利分值,国际合作分值,科研经费分值,软件著作权分值,进修学习分值,总分值)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+"'"+Zwzc+"'"+","+""+Gj+""+","+"'"+Gw+"'"+","+""+Gjfz+""+","+""+Ldjf+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+Zfz+""+") ";		
		stmt1.executeUpdate(sql7);
		while(rs0.next()){
			
			Xm=rs0.getString("姓名");
			Dw=rs0.getString("单位");
			sql7="insert into 工作量统计表 "+"(姓名,单位,职务职称,岗级,岗位,岗级分值,领导加分,出版专著分值,获奖分值,科研项目分值,学术兼职分值,专利分值,国际合作分值,科研经费分值,软件著作权分值,进修学习分值,总分值)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+"'"+Zwzc+"'"+","+""+Gj+""+","+"'"+Gw+"'"+","+""+Gjfz+""+","+""+Ldjf+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+Zfz+""+") ";		
			stmt1.execute(sql7);
			}
	}
	rs0.close();
	
	if(Time.length()==0){
		return "incomplete";
	}
	else{
			
			String xingming;
			String sql0;
			String sql8;
			float shuliang;
			float zongshuliang;
			String sql1="select * from 科研项目 where 鉴定验收时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql1);
			if(rs.first()){
				xingming=rs.getString("项目负责人");
				sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				if(rs0.first())
				{
					shuliang=rs0.getFloat("科研项目分值")+rs.getFloat("工作量分值");
					zongshuliang=rs0.getFloat("总分值")+rs.getFloat("工作量分值");
					sql8="update 工作量统计表 set 科研项目分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stmt2.executeUpdate(sql8);
				}
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("项目负责人");
					sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						shuliang=rs0.getFloat("科研项目分值")+rs.getFloat("工作量分值");
						zongshuliang=rs0.getFloat("总分值")+rs.getFloat("工作量分值");
						sql8="update 工作量统计表 set 科研项目分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
					sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						
						shuliang=rs0.getFloat("出版专著分值")+rs.getFloat("工作量分值");
						zongshuliang=rs0.getFloat("总分值")+rs.getFloat("工作量分值");
						sql8="update 工作量统计表 set 出版专著分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
						sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
						rs0=stmt1.executeQuery(sql0);
						if(rs0.first())
						{
							
							shuliang=rs0.getFloat("出版专著分值")+rs.getFloat("工作量分值");
							zongshuliang=rs0.getFloat("总分值")+rs.getFloat("工作量分值");
							sql8="update 工作量统计表 set 出版专著分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
					sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						shuliang=rs0.getFloat("获奖分值")+rs.getFloat("工作量分值")*HJ[i];
						zongshuliang=rs0.getFloat("总分值")+rs.getFloat("工作量分值")*HJ[i];
						sql8="update 工作量统计表 set 获奖分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
						sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
						rs0=stmt1.executeQuery(sql0);
						if(rs0.first())
						{
							shuliang=rs0.getFloat("获奖分值")+rs.getFloat("工作量分值")*HJ[i];
							zongshuliang=rs0.getFloat("总分值")+rs.getFloat("工作量分值")*HJ[i];
							sql8="update 工作量统计表 set 获奖分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
				sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				if(rs0.first())
				{
					shuliang=rs0.getFloat("学术兼职分值")+rs.getFloat("学术量分值");
					zongshuliang=rs0.getFloat("总分值")+rs.getFloat("学术量分值");
					sql8="update 工作量统计表 set 学术兼职分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stmt2.executeUpdate(sql8);
				}
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("姓名");
					sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						shuliang=rs0.getFloat("学术兼职分值")+rs.getFloat("学术量分值");
						zongshuliang=rs0.getFloat("总分值")+rs.getFloat("学术量分值");
						sql8="update 工作量统计表 set 学术兼职分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
					sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first()){
						shuliang=rs0.getFloat("专利分值")+rs.getFloat("工作量分值")*ZL[i];
						zongshuliang=rs0.getFloat("总分值")+rs.getFloat("工作量分值")*ZL[i];
						sql8="update 工作量统计表 set 专利分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
						sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
						rs0=stmt1.executeQuery(sql0);
						if(rs0.first()){
							shuliang=rs0.getFloat("专利分值")+rs.getFloat("工作量分值")*ZL[i];
							zongshuliang=rs0.getFloat("总分值")+rs.getFloat("工作量分值")*ZL[i];
							sql8="update 工作量统计表 set 专利分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
					sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						
						shuliang=rs0.getFloat("国际合作分值")+r1.getFloat("工作量分值");
						zongshuliang=rs0.getFloat("总分值")+r1.getFloat("工作量分值");
						sq1="update 工作量统计表 set 国际合作分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
						sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
						rs0=stmt2.executeQuery(sql0);
						if(rs0.first()){
							
							shuliang=rs0.getFloat("国际合作分值")+r1.getFloat("工作量分值");
							zongshuliang=rs0.getFloat("总分值")+r1.getFloat("工作量分值");
							sq1="update 工作量统计表 set 国际合作分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
					sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						shuliang=rs0.getFloat("进修学习分值")+r2.getFloat("工作量分值");
						zongshuliang=rs0.getFloat("总分值")+r2.getFloat("工作量分值");
						sq2="update 工作量统计表 set 进修学习分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
						sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
						rs0=stmt2.executeQuery(sql0);
						if(rs0.first()){
							shuliang=rs0.getFloat("进修学习分值")+r2.getFloat("工作量分值");
							zongshuliang=rs0.getFloat("总分值")+r2.getFloat("工作量分值");
							sq2="update 工作量统计表 set 进修学习分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
				sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
				rs0=stmt2.executeQuery(sql0);
				if(rs0.first())
				{
					shuliang=rs0.getFloat("科研经费分值")+r3.getFloat("工作量分值");
					zongshuliang=rs0.getFloat("总分值")+r3.getFloat("工作量分值");
					sq3="update 工作量统计表 set 科研经费分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stm3.executeUpdate(sq3);
				}
				rs0.close();
				while(r3.next()){
					xingming=r3.getString("项目负责人");
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first())
					{
						shuliang=rs0.getFloat("科研经费分值")+r3.getFloat("工作量分值");
						zongshuliang=rs0.getFloat("总分值")+r3.getFloat("工作量分值");
						sq3="update 工作量统计表 set 科研经费分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
					sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						shuliang=rs0.getFloat("软件著作权分值")+r4.getFloat("工作量分值");
						zongshuliang=rs0.getFloat("总分值")+r4.getFloat("工作量分值");
						sq4="update 工作量统计表 set 软件著作权分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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
						sql0="select * from 工作量统计表  where 姓名 = '"+xingming+"'";
						rs0=stmt2.executeQuery(sql0);
						if(rs0.first()){
							shuliang=rs0.getFloat("软件著作权分值")+r4.getFloat("工作量分值");
							zongshuliang=rs0.getFloat("总分值")+r4.getFloat("工作量分值");
							sq4="update 工作量统计表 set 软件著作权分值='"+shuliang+"',总分值='"+zongshuliang+"' where 姓名='"+xingming+"'";
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

