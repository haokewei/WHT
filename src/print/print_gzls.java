

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
public class print_gzls extends ActionSupport{
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
	String sql7="insert into ����ͳ�� "+"(����,��λ,����ר������,����ר����ϸ,������,����ϸ,������Ŀ����,������Ŀ��ϸ,ѧ����ְ����,ѧ����ְ��ϸ,ר������,ר����ϸ,���ʺ�������,���ʺ�����ϸ,���о�������,���о�����ϸ,�������Ȩ����,�������Ȩ��ϸ,����ѧϰ����,����ѧϰ��ϸ,������)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";	
	stmt=con.createStatement();
	stmt1=con.createStatement();
	stmt2=con.createStatement();
	stmt3=con.createStatement();
	stmt3.executeUpdate(sql12);
	rs0=stmt.executeQuery(sql6);
	if(rs0.first()){
		Xm=rs0.getString("����");
		Dw=rs0.getString("��λ");
		sql7="insert into ����ͳ�� "+"(����,��λ,����ר������,����ר����ϸ,������,����ϸ,������Ŀ����,������Ŀ��ϸ,ѧ����ְ����,ѧ����ְ��ϸ,ר������,ר����ϸ,���ʺ�������,���ʺ�����ϸ,���о�������,���о�����ϸ,�������Ȩ����,�������Ȩ��ϸ,����ѧϰ����,����ѧϰ��ϸ,������)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";
		stmt1.executeUpdate(sql7);
		while(rs0.next()){
			
			Xm=rs0.getString("����");
			Dw=rs0.getString("��λ");
			sql7="insert into ����ͳ�� "+"(����,��λ,����ר������,����ר����ϸ,������,����ϸ,������Ŀ����,������Ŀ��ϸ,ѧ����ְ����,ѧ����ְ��ϸ,ר������,ר����ϸ,���ʺ�������,���ʺ�����ϸ,���о�������,���о�����ϸ,�������Ȩ����,�������Ȩ��ϸ,����ѧϰ����,����ѧϰ��ϸ,������)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+","+"'"+x2+"'"+","+""+x1+""+") ";
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
				mingxi=rs0.getString("������Ŀ��ϸ").concat(",".concat(rs.getString("��Ŀ����")));
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
				mingxi=rs0.getString("����ר����ϸ").concat(rs.getString("ר������").concat(","));
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
					mingxi=rs0.getString("����ר����ϸ").concat(rs.getString("ר������").concat(","));
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
			
			String sq1="select * from ���ʺ��� where ��ʼʱ�� = '"+Time+"'";
			Statement stm1=null;
			Statement stm2=null;
			Statement stm3=null;
			ResultSet r1=null;
			stm1=con.createStatement();
			stm2=con.createStatement();
			stm3=con.createStatement();
			r1=stm1.executeQuery(sq1);
			if(r1.first()){
				xingming=r1.getString("��Ա����");
				sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
				rs0=stmt2.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("���ʺ�����ϸ").concat(r1.getString("��������").concat(","));
				shuliang=rs0.getInt("���ʺ�������")+1;
				zongshuliang=rs0.getInt("������")+1;
				sq1="update ����ͳ�� set ���ʺ�����ϸ='"+mingxi+"',���ʺ�������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
				stm3.executeUpdate(sq1);
				rs0.close();
				while(r1.next()){
					xingming=r1.getString("��Ա����");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("���ʺ�����ϸ").concat(r1.getString("��������").concat(","));
					shuliang=rs0.getInt("���ʺ�������")+1;
					zongshuliang=rs0.getInt("������")+1;
					sq1="update ����ͳ�� set ���ʺ�����ϸ='"+mingxi+"',���ʺ�������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
					stm3.executeUpdate(sq1);
					rs0.close();
				}
			}
			r1.close();
			
			String sq2="select * from ����ѧϰ where ��ʼʱ�� = '"+Time+"'";
	
			ResultSet r2=null;
			r2=stm1.executeQuery(sq2);
			if(r2.first()){
				xingming=r2.getString("��Ա����");
				sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
				rs0=stmt2.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("����ѧϰ��ϸ").concat(r2.getString("����ѧϰ����").concat(","));
				shuliang=rs0.getInt("����ѧϰ����")+1;
				zongshuliang=rs0.getInt("������")+1;
				sq2="update ����ͳ�� set ����ѧϰ��ϸ='"+mingxi+"',����ѧϰ����='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
				stm3.executeUpdate(sq2);
				rs0.close();
				while(r2.next()){
					xingming=r2.getString("��Ա����");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("����ѧϰ��ϸ").concat(r2.getString("����ѧϰ����").concat(","));
					shuliang=rs0.getInt("����ѧϰ����")+1;
					zongshuliang=rs0.getInt("������")+1;
					sq2="update ����ͳ�� set ����ѧϰ��ϸ='"+mingxi+"',����ѧϰ����='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
					stm3.executeUpdate(sq2);
					rs0.close();
				}
			}
			r2.close();
			
			
			String sq3="select * from ���о��� where ��� = '"+Time+"'";
			
			ResultSet r3=null;
			
			r3=stm1.executeQuery(sq3);
			if(r3.first()){
				xingming=r3.getString("��Ŀ������");
				sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
				rs0=stmt2.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("���о�����ϸ").concat(r3.getString("��Ŀ����").concat(","));
				shuliang=rs0.getInt("���о�������")+1;
				zongshuliang=rs0.getInt("������")+1;
				sq3="update ����ͳ�� set ���о�����ϸ='"+mingxi+"',���о�������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
				stm3.executeUpdate(sq3);
				rs0.close();
				while(r3.next()){
					xingming=r3.getString("��Ŀ������");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("���о�����ϸ").concat(r3.getString("��Ŀ����").concat(","));
					shuliang=rs0.getInt("���о�������")+1;
					zongshuliang=rs0.getInt("������")+1;
					sq3="update ����ͳ�� set ���о�����ϸ='"+mingxi+"',���о�������='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
					stm3.executeUpdate(sq3);
					rs0.close();
				}
			}
			r3.close();
			
			String sq4="select * from �������Ȩ where ����ʱ�� = '"+Time+"'";
			
			ResultSet r4=null;
			
			r4=stm1.executeQuery(sq4);
			if(r4.first()){
				xingming=r4.getString("��Ա����");
				sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
				rs0=stmt2.executeQuery(sql0);
				rs0.next();
				mingxi=rs0.getString("�������Ȩ��ϸ").concat(r4.getString("�������Ȩ����").concat(","));
				shuliang=rs0.getInt("�������Ȩ����")+1;
				zongshuliang=rs0.getInt("������")+1;
				sq4="update ����ͳ�� set �������Ȩ��ϸ='"+mingxi+"',�������Ȩ����='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
				stm3.executeUpdate(sq4);
				rs0.close();
				while(r4.next()){
					xingming=r4.getString("��Ա����");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					rs0.next();
					mingxi=rs0.getString("�������Ȩ��ϸ").concat(r4.getString("�������Ȩ����").concat(","));
					shuliang=rs0.getInt("�������Ȩ����")+1;
					zongshuliang=rs0.getInt("������")+1;
					sq4="update ����ͳ�� set �������Ȩ��ϸ='"+mingxi+"',�������Ȩ����='"+shuliang+"',������='"+zongshuliang+"' where ����='"+xingming+"'";
					stm3.executeUpdate(sq4);
					rs0.close();
				}
			}
			r4.close();
			
		}
	
	
	

rs.close() ;
stmt.close();
stmt1.close();
stmt2.close();
stmt3.close();
con.close() ;

return "success";
}
}

