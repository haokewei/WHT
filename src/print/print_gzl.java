

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
	String sql6="select * from ��ʦ ";	
	String sql12="delete from ����ͳ�� ";
	String sql7="insert into ����ͳ�� "+"(����,��λ,����ר������,����ר����ϸ,������,����ϸ,������Ŀ����,������Ŀ��ϸ,ѧ����ְ����,ѧ����ְ��ϸ,ר������,ר����ϸ,������)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";	
	stmt=con.createStatement();
	stmt1=con.createStatement();
	stmt2=con.createStatement();
	stmt3=con.createStatement();
	stmt3.executeUpdate(sql12);
	rs0=stmt.executeQuery(sql6);
	if(rs0.first()){
		Xm=rs0.getString("����");
		Dw=rs0.getString("��λ");
		sql7="insert into ����ͳ�� "+"(����,��λ,����ר������,����ר����ϸ,������,����ϸ,������Ŀ����,������Ŀ��ϸ,ѧ����ְ����,ѧ����ְ��ϸ,ר������,ר����ϸ,������)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";
		stmt1.executeUpdate(sql7);
		while(rs0.next()){
			
			Xm=rs0.getString("����");
			Dw=rs0.getString("��λ");
			sql7="insert into ����ͳ�� "+"(����,��λ,����ר������,����ר����ϸ,������,����ϸ,������Ŀ����,������Ŀ��ϸ,ѧ����ְ����,ѧ����ְ��ϸ,ר������,ר����ϸ,������)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";
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
			String sql1="select * from ������Ŀ where ��������ʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql1);
			if(rs.first()){
				xingming=rs.getString("��Ŀ������");
				sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("������Ŀ��ϸ").concat(rs.getString("��Ŀ����"));
				shuliang=rs0.getInt("������Ŀ����")+1;
				zongshuliang=rs0.getInt("������")+1;
				sql8="update ����ͳ�� set ������Ŀ��ϸ='"+mingxi+"',������Ŀ����='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("��Ŀ������");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("������Ŀ��ϸ").concat(",".concat(rs.getString("��Ŀ����")));
					shuliang=rs0.getInt("������Ŀ����")+1;
					zongshuliang=rs0.getInt("������")+1;
					sql8="update ����ͳ�� set ������Ŀ��ϸ='"+mingxi+"',������Ŀ����='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			String sql2="select * from ����ר�� where ����ʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql2);
			if(rs.first()){
				xingming=rs.getString("��������");
				sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("����ר����ϸ").concat(rs.getString("ר������"));
				shuliang=rs0.getInt("����ר������")+1;
				zongshuliang=rs0.getInt("������")+1;
				sql8="update ����ͳ�� set ����ר����ϸ='"+mingxi+"',����ר������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					
					xingming=rs.getString("��������");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("����ר����ϸ").concat(",".concat(rs.getString("ר������")));
					shuliang=rs0.getInt("����ר������")+1;
					zongshuliang=rs0.getInt("������")+1;
					sql8="update ����ͳ�� set ����ר����ϸ='"+mingxi+"',����ר������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			String sql3="select * from �� where ��ʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql3);
			if(rs.first()){
				xingming=rs.getString("����Ա����");
				sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("����ϸ").concat(rs.getString("��Ŀ����").concat(","));
				shuliang=rs0.getInt("������")+1;
				zongshuliang=rs0.getInt("������")+1;
				sql8="update ����ͳ�� set ����ϸ='"+mingxi+"',������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("����Ա����");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("����ϸ").concat(rs.getString("��Ŀ����").concat(","));
					shuliang=rs0.getInt("������")+1;
					zongshuliang=rs0.getInt("������")+1;
					sql8="update ����ͳ�� set ����ϸ='"+mingxi+"',������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			String sql4="select * from ѧ����ְ where ��ְ��ʼʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql4);
			if(rs.first()){
				xingming=rs.getString("����");
				sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("ѧ����ְ��ϸ").concat(rs.getString("ѧ����������").concat(","));
				shuliang=rs0.getInt("ѧ����ְ����")+1;
				zongshuliang=rs0.getInt("������")+1;
				sql8="update ����ͳ�� set ѧ����ְ��ϸ='"+mingxi+"',ѧ����ְ����='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("����");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("ѧ����ְ��ϸ").concat(rs.getString("ѧ����������").concat(","));
					shuliang=rs0.getInt("ѧ����ְ����")+1;
					zongshuliang=rs0.getInt("������")+1;
					sql8="update ����ͳ�� set ѧ����ְ��ϸ='"+mingxi+"',ѧ����ְ����='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			String sql5="select * from ר�� where ʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql5);
			if(rs.first()){
				xingming=rs.getString("ר��Ȩ��");
				sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("ר����ϸ").concat(rs.getString("ר������").concat(","));
				shuliang=rs0.getInt("ר������")+1;
				zongshuliang=rs0.getInt("������")+1;
				sql8="update ����ͳ�� set ר����ϸ='"+mingxi+"',ר������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
				stmt2.executeUpdate(sql8);
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("ר��Ȩ��");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("ר����ϸ").concat(rs.getString("ר������").concat(","));
					shuliang=rs0.getInt("ר������")+1;
					zongshuliang=rs0.getInt("������")+1;
					sql8="update ����ͳ�� set ר����ϸ='"+mingxi+"',ר������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
					stmt2.executeUpdate(sql8);
					rs0.close();
				}
			}
			rs.close();
			
			
			
		}
	
	
	
	
	
	
	
	
		
String sql ="select * from ����ͳ��" ;
 rs =stmt.executeQuery(sql) ;
// ��ȡ������
int CountColumnNum = rs.getMetaData().getColumnCount() ;
int i =1 ;
// ����Excel�ĵ�
HSSFWorkbook wb = new HSSFWorkbook() ;
// sheet ��Ӧһ������ҳ
HSSFSheet sheet = wb.createSheet("���˿��гɹ�ͳ��") ;
HSSFRow firstrow = sheet.createRow(0); //�±�Ϊ0���п�ʼ
HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
String[] names = new String[CountColumnNum];
names[0] ="����";
names[1] ="��λ";
names[2] ="����ר������";
names[3] ="����ר����ϸ";
names[4] ="������";
names[5] ="����ϸ";
names[6] ="������Ŀ����";
names[7] ="������Ŀ��ϸ";
names[8] ="ѧ����ְ����";
names[9] ="ѧ����ְ��ϸ";
names[10] ="ר������";
names[11] ="ר����ϸ";
names[12] ="������";
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
stmt1.close();
stmt2.close();
stmt3.close();
con.close() ;
success();
return "success";
}
}

