

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
public class dayin_dw extends ActionSupport{
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
	stmt=con.createStatement();
	ResultSet rs=null;
String sql ="select * from 工作量统计表" ;
 rs =stmt.executeQuery(sql) ;
// 获取总列数
int CountColumnNum = rs.getMetaData().getColumnCount() ;
int i =1 ;
// 创建Excel文档
HSSFWorkbook wb = new HSSFWorkbook() ;
// sheet 对应一个工作页
HSSFSheet sheet = wb.createSheet("工作量统计") ;
HSSFRow firstrow = sheet.createRow(0); //下标为0的行开始
HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
String[] names = new String[CountColumnNum];
names[0] ="姓名";
names[1] ="单位";
names[2] ="职务名称";
names[3] ="岗级";
names[4] ="岗位";
names[5] ="岗级分值";
names[6] ="领导加分";
names[7] ="出版专著分值";
names[8] ="获奖分值";
names[9] ="科研项目分值";
names[10] ="学术兼职分值";
names[11] ="专利分值";
names[12] ="国际合作分值";
names[13] ="科研经费分值";
names[14] ="软件著作权分值";
names[15] ="进修学习分值";
names[16] ="总分值";
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
con.close() ;
//success();
return "success";
}
}

