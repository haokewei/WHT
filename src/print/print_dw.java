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
	String msg="�����ɹ�";
	int type=JOptionPane.YES_NO_CANCEL_OPTION;
	String title="��Ϣ��ʾ";
	JOptionPane.showMessageDialog(null,msg,title,type);
}
public void wrong1(){
	String msg="������Ϊ�գ�ͳ�Ƶ���ʧ��";
	int type=JOptionPane.YES_NO_CANCEL_OPTION;
	String title="��Ϣ��ʾ";
	JOptionPane.showMessageDialog(null,msg,title,type);
}
public String execute() throws Exception
{
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/���гɹ�";
	Time=getTime();
	con = DriverManager.getConnection(url,"root","1234");
	stmt=con.createStatement();
	
String sql ="select * from ��λͳ��" ;
 rs =stmt.executeQuery(sql) ;
// ��ȡ������
int CountColumnNum = rs.getMetaData().getColumnCount() ;
int i =1 ;
// ����Excel�ĵ�
HSSFWorkbook wb = new HSSFWorkbook() ;
// sheet ��Ӧһ������ҳ
HSSFSheet sheet = wb.createSheet("��λ���гɹ�ͳ��") ;
HSSFRow firstrow = sheet.createRow(0); //�±�Ϊ0���п�ʼ
HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
String[] names = new String[CountColumnNum];
names[0] ="��λ";
names[1] ="����ר������";
names[2] ="����ר����ϸ";
names[3] ="������";
names[4] ="����ϸ";
names[5] ="������Ŀ����";
names[6] ="������Ŀ��ϸ";
names[7] ="ѧ����ְ����";
names[8] ="ѧ����ְ��ϸ";
names[9] ="ר������";
names[10] ="ר����ϸ";
names[11] ="������";
for(int j= 0 ;j<CountColumnNum; j++){
firstcell[j] = firstrow.createCell((short)j);
firstcell[j].setCellValue(new HSSFRichTextString(names[j]));
}
while(rs.next())
{
// �������ӱ���һ��
HSSFRow row = sheet.createRow(i) ; // �±�Ϊ1���п�ʼ
for(int j=0;j<CountColumnNum;j++)
{
// ��һ����ѭ��
HSSFCell cell = row.createCell((short) j) ;
// ���ñ��ı��뼯��ʹ֧������
//// ���ж����ݿ��е���������
// ����������ֵ������ӱ����
cell.setCellValue(new HSSFRichTextString(rs.getString(j+1))) ;
}
i++ ;
}
// �����ļ��������׼��������ӱ��
OutputStream out = new FileOutputStream(Lujing) ;
wb.write(out) ;
out.close() ;
System.out.println("ͳ�ƽ�������ɹ�") ;
rs.close() ;
stmt.close();
con.close() ;
success();
return "success";
}
}