

package print;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
public void success()
{
	String msg="导出成功";
	int type=JOptionPane.YES_NO_CANCEL_OPTION;
	String title="信息提示";
	JOptionPane.showMessageDialog(null,msg,title,type);
}
public void wrong1(){
	String msg="不允许为空，统计导出失败";
	int type=JOptionPane.YES_NO_CANCEL_OPTION;
	String title="信息提示";
	JOptionPane.showMessageDialog(null,msg,title,type);
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
	int x1=0;
	String x2="";
	String sql6="select * from 老师 ";	
	String sql12="delete from 个人统计 ";
	String sql7="insert into 个人统计 "+"(姓名,单位,出版专著数量,出版专著明细,获奖数量,获奖明细,科研项目数量,科研项目明细,学术兼职数量,学术兼职明细,专利数量,专利明细,总数量)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";	
	stmt=con.createStatement();
	stmt1=con.createStatement();
	stmt2=con.createStatement();
	stmt3=con.createStatement();
	stmt3.executeUpdate(sql12);
	rs0=stmt.executeQuery(sql6);
	if(rs0.first()){
		Xm=rs0.getString("姓名");
		Dw=rs0.getString("单位");
		sql7="insert into 个人统计 "+"(姓名,单位,出版专著数量,出版专著明细,获奖数量,获奖明细,科研项目数量,科研项目明细,学术兼职数量,学术兼职明细,专利数量,专利明细,总数量)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";
		stmt1.executeUpdate(sql7);
		while(rs0.next()){
			
			Xm=rs0.getString("姓名");
			Dw=rs0.getString("单位");
			sql7="insert into 个人统计 "+"(姓名,单位,出版专著数量,出版专著明细,获奖数量,获奖明细,科研项目数量,科研项目明细,学术兼职数量,学术兼职明细,专利数量,专利明细,总数量)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";
			stmt1.execute(sql7);
			}
	}
	rs0.close();
	
	if(Time.length()==0){
		wrong1();
		return "error";
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
				rs0.next();
				mingxi=rs0.getString("科研项目明细").concat(rs.getString("项目名称"));
				shuliang=rs0.getInt("科研项目数量")+1;
				zongshuliang=rs0.getInt("总数量")+1;
				sql8="update 个人统计 set 科研项目明细='"+mingxi+"',科研项目数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("项目负责人");
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("科研项目明细").concat(",".concat(rs.getString("项目名称")));
					shuliang=rs0.getInt("科研项目数量")+1;
					zongshuliang=rs0.getInt("总数量")+1;
					sql8="update 个人统计 set 科研项目明细='"+mingxi+"',科研项目数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			String sql2="select * from 出版专著 where 出版时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql2);
			if(rs.first()){
				xingming=rs.getString("著者名单");
				sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("出版专著明细").concat(rs.getString("专著名称"));
				shuliang=rs0.getInt("出版专著数量")+1;
				zongshuliang=rs0.getInt("总数量")+1;
				sql8="update 个人统计 set 出版专著明细='"+mingxi+"',出版专著数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					
					xingming=rs.getString("著者名单");
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("出版专著明细").concat(",".concat(rs.getString("专著名称")));
					shuliang=rs0.getInt("出版专著数量")+1;
					zongshuliang=rs0.getInt("总数量")+1;
					sql8="update 个人统计 set 出版专著明细='"+mingxi+"',出版专著数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			String sql3="select * from 获奖 where 获奖时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql3);
			if(rs.first()){
				xingming=rs.getString("获奖人员名单");
				sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("获奖明细").concat(rs.getString("项目名称").concat(","));
				shuliang=rs0.getInt("获奖数量")+1;
				zongshuliang=rs0.getInt("总数量")+1;
				sql8="update 个人统计 set 获奖明细='"+mingxi+"',获奖数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("获奖人员名单");
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("获奖明细").concat(rs.getString("项目名称").concat(","));
					shuliang=rs0.getInt("获奖数量")+1;
					zongshuliang=rs0.getInt("总数量")+1;
					sql8="update 个人统计 set 获奖明细='"+mingxi+"',获奖数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			String sql4="select * from 学术兼职 where 任职开始时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql4);
			if(rs.first()){
				xingming=rs.getString("姓名");
				sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("学术兼职明细").concat(rs.getString("学术团体名称").concat(","));
				shuliang=rs0.getInt("学术兼职数量")+1;
				zongshuliang=rs0.getInt("总数量")+1;
				sql8="update 个人统计 set 学术兼职明细='"+mingxi+"',学术兼职数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("姓名");
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("学术兼职明细").concat(rs.getString("学术团体名称").concat(","));
					shuliang=rs0.getInt("学术兼职数量")+1;
					zongshuliang=rs0.getInt("总数量")+1;
					sql8="update 个人统计 set 学术兼职明细='"+mingxi+"',学术兼职数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			String sql5="select * from 专利 where 时间 = '"+Time+"'";
			rs=stmt.executeQuery(sql5);
			if(rs.first()){
				xingming=rs.getString("专利权人");
				sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("专利明细").concat(rs.getString("专利名称").concat(","));
				shuliang=rs0.getInt("专利数量")+1;
				zongshuliang=rs0.getInt("总数量")+1;
				sql8="update 个人统计 set 专利明细='"+mingxi+"',专利数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("专利权人");
					sql0="select * from 个人统计  where 姓名 = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("专利明细").concat(rs.getString("专利名称").concat(","));
					shuliang=rs0.getInt("专利数量")+1;
					zongshuliang=rs0.getInt("总数量")+1;
					sql8="update 个人统计 set 专利明细='"+mingxi+"',专利数量='"+shuliang+"',总数量='"+zongshuliang+"' where 姓名='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			
			
		}
	
	
	
	
	
	
	
	
		
String sql ="select * from 个人统计" ;
 rs =stmt.executeQuery(sql) ;
// 获取总列数
int CountColumnNum = rs.getMetaData().getColumnCount() ;
int i =1 ;
// 创建Excel文档
HSSFWorkbook wb = new HSSFWorkbook() ;
// sheet 对应一个工作页
HSSFSheet sheet = wb.createSheet("个人科研成果统计") ;
HSSFRow firstrow = sheet.createRow(0); //下标为0的行开始
HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
String[] names = new String[CountColumnNum];
names[0] ="姓名";
names[1] ="单位";
names[2] ="出版专著数量";
names[3] ="出版专著明细";
names[4] ="获奖数量";
names[5] ="获奖明细";
names[6] ="科研项目数量";
names[7] ="科研项目明细";
names[8] ="学术兼职数量";
names[9] ="学术兼职明细";
names[10] ="专利数量";
names[11] ="专利明细";
names[12] ="总数量";
for(int j= 0 ;j<CountColumnNum; j++){
firstcell[j] = firstrow.createCell((short)j);
firstcell[j].setCellValue(new HSSFRichTextString(names[j]));
}
while(rs.next())
{
// 创建电子表格的一行
HSSFRow row = sheet.createRow(i) ; // 下标为1的行开始
for(int j=0;j<CountColumnNum;j++)
{
// 在一行内循环
HSSFCell cell = row.createCell((short) j) ;
// 设置表格的编码集，使支持中文
//// 先判断数据库中的数据类型
// 将结果集里的值放入电子表格中
cell.setCellValue(new HSSFRichTextString(rs.getString(j+1))) ;
}
i++ ;
}
// 创建文件输出流，准备输出电子表格
OutputStream out = new FileOutputStream(Lujing) ;
wb.write(out) ;
out.close() ;
rs.close() ;
stmt.close();
stmt1.close();
stmt2.close();
stmt3.close();
con.close() ;
success();
return "success";
}
}

