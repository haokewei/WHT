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
	ResultSet rs=null;
	stmt=con.createStatement();	
	Time=getTime();
	
String sql ="select * from 单位统计" ;
 rs =stmt.executeQuery(sql) ;
// 获取总列数
int CountColumnNum = rs.getMetaData().getColumnCount() ;
int i =1 ;
// 创建Excel文档
HSSFWorkbook wb = new HSSFWorkbook() ;
// sheet 对应一个工作页
HSSFSheet sheet = wb.createSheet("单位科研成果统计") ;
HSSFRow firstrow = sheet.createRow(0); //下标为0的行开始
HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
String[] names = new String[CountColumnNum];
names[0] ="单位";
names[1] ="出版专著数量";
names[2] ="出版专著明细";
names[3] ="获奖数量";
names[4] ="获奖明细";
names[5] ="科研项目数量";
names[6] ="科研项目明细";
names[7] ="学术兼职数量";
names[8] ="学术兼职明细";
names[9] ="专利数量";
names[10] ="专利明细";
names[11] ="总数量";
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
System.out.println("统计结果导出成功") ;
rs.close() ;
stmt.close();
con.close() ;
success();
return "success";
}
}