

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
// ��ȡ������
int CountColumnNum = rs.getMetaData().getColumnCount() ;
int i =1 ;
// ����Excel�ĵ�
HSSFWorkbook wb = new HSSFWorkbook() ;
// sheet ��Ӧһ������ҳ
HSSFSheet sheet = wb.createSheet("student���е�����") ;
HSSFRow firstrow = sheet.createRow(0); //�±�Ϊ0���п�ʼ
HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
String[] names = new String[CountColumnNum];
names[0] ="ID";
names[1] ="ѧ��";
names[2] ="����";
names[3] ="�Ա�";
names[4] ="�༶";
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
OutputStream out = new FileOutputStream("E:\\person.xls") ;
wb.write(out) ;
out.close() ;
System.out.println("���ݿ⵼���ɹ�") ;
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