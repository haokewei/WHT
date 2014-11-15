

 package print;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;

import org.apache.poi.hssf.usermodel.HSSFCell;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class MySql2Excel {
public MySql2Excel() throws Exception
{
Connection con = null ;
DBConnection db = new DBConnection() ;
con = db.getDB() ;
String sql ="select * from students" ;
ResultSet rs = con.createStatement().executeQuery(sql) ;
// 获取总列数
int CountColumnNum = rs.getMetaData().getColumnCount() ;
int i =1 ;
// 创建Excel文档
HSSFWorkbook wb = new HSSFWorkbook() ;
// sheet 对应一个工作页
HSSFSheet sheet = wb.createSheet("student表中的数据") ;
HSSFRow firstrow = sheet.createRow(0); //下标为0的行开始
HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
String[] names = new String[CountColumnNum];
names[0] ="ID";
names[1] ="学号";
names[2] ="姓名";
names[3] ="性别";
names[4] ="班级";
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
OutputStream out = new FileOutputStream("E:\\person.xls") ;
wb.write(out) ;
out.close() ;
System.out.println("数据库导出成功") ;
rs.close() ;
con.close() ;
}
public static void main(String[] args)
{
try {
@SuppressWarnings("unused")
MySql2Excel excel = new MySql2Excel() ;
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}