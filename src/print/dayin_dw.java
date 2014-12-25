

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
	Connect c=new Connect();
	Connection con=c.getConnection();
	Statement stmt=null;
	stmt=con.createStatement();
	ResultSet rs=null;
String sql ="select * from ������ͳ�Ʊ�" ;
 rs =stmt.executeQuery(sql) ;
// ��ȡ������
int CountColumnNum = rs.getMetaData().getColumnCount() ;
int i =1 ;
// ����Excel�ĵ�
HSSFWorkbook wb = new HSSFWorkbook() ;
// sheet ��Ӧһ������ҳ
HSSFSheet sheet = wb.createSheet("������ͳ��") ;
HSSFRow firstrow = sheet.createRow(0); //�±�Ϊ0���п�ʼ
HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
String[] names = new String[CountColumnNum];
names[0] ="����";
names[1] ="��λ";
names[2] ="ְ������";
names[3] ="�ڼ�";
names[4] ="��λ";
names[5] ="�ڼ���ֵ";
names[6] ="�쵼�ӷ�";
names[7] ="����ר����ֵ";
names[8] ="�񽱷�ֵ";
names[9] ="������Ŀ��ֵ";
names[10] ="ѧ����ְ��ֵ";
names[11] ="ר����ֵ";
names[12] ="���ʺ�����ֵ";
names[13] ="���о��ѷ�ֵ";
names[14] ="�������Ȩ��ֵ";
names[15] ="����ѧϰ��ֵ";
names[16] ="�ܷ�ֵ";
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
rs.close() ;
stmt.close();
con.close() ;
//success();
return "success";
}
}

