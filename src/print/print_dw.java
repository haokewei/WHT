

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
	String sql6="select * from ��ʦ ";	
	String sql12="delete from ������ͳ�Ʊ� ";
	String sql7="insert into ������ͳ�Ʊ� "+"(����,��λ,ְ��ְ��,�ڼ�,��λ,�ڼ���ֵ,�쵼�ӷ�,����ר����ֵ,�񽱷�ֵ,������Ŀ��ֵ,ѧ����ְ��ֵ,ר����ֵ,���ʺ�����ֵ,���о��ѷ�ֵ,�������Ȩ��ֵ,����ѧϰ��ֵ,�ܷ�ֵ)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+"'"+Zwzc+"'"+","+""+Gj+""+","+"'"+Gw+"'"+","+""+Gjfz+""+","+""+Ldjf+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+Zfz+""+") ";	
	stmt=con.createStatement();
	stmt1=con.createStatement();
	stmt2=con.createStatement();
	stmt3=con.createStatement();
	stmt3.executeUpdate(sql12);
	rs0=stmt.executeQuery(sql6);
	if(rs0.first()){
		Xm=rs0.getString("����");
		Dw=rs0.getString("��λ");
		Zwzc=rs0.getString("ְ��ְ��");
		Gj=rs0.getInt("�ڼ�");
		Gw=rs0.getString("��λ");
		Gjfz=rs0.getFloat("�ڼ���ֵ");
		Ldjf=rs0.getFloat("�쵼�ӷ�");
		Zfz=Gjfz+Ldjf;
		sql7="insert into ������ͳ�Ʊ� "+"(����,��λ,ְ��ְ��,�ڼ�,��λ,�ڼ���ֵ,�쵼�ӷ�,����ר����ֵ,�񽱷�ֵ,������Ŀ��ֵ,ѧ����ְ��ֵ,ר����ֵ,���ʺ�����ֵ,���о��ѷ�ֵ,�������Ȩ��ֵ,����ѧϰ��ֵ,�ܷ�ֵ)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+"'"+Zwzc+"'"+","+""+Gj+""+","+"'"+Gw+"'"+","+""+Gjfz+""+","+""+Ldjf+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+Zfz+""+") ";		
		stmt1.executeUpdate(sql7);
		while(rs0.next()){
			
			Xm=rs0.getString("����");
			Dw=rs0.getString("��λ");
			sql7="insert into ������ͳ�Ʊ� "+"(����,��λ,ְ��ְ��,�ڼ�,��λ,�ڼ���ֵ,�쵼�ӷ�,����ר����ֵ,�񽱷�ֵ,������Ŀ��ֵ,ѧ����ְ��ֵ,ר����ֵ,���ʺ�����ֵ,���о��ѷ�ֵ,�������Ȩ��ֵ,����ѧϰ��ֵ,�ܷ�ֵ)"+"values("+"'"+Xm+"'"+","+"'"+Dw+"'"+","+"'"+Zwzc+"'"+","+""+Gj+""+","+"'"+Gw+"'"+","+""+Gjfz+""+","+""+Ldjf+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+x1+""+","+""+x2+""+","+""+Zfz+""+") ";		
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
			String sql1="select * from ������Ŀ where ��������ʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql1);
			if(rs.first()){
				xingming=rs.getString("��Ŀ������");
				sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				if(rs0.first())
				{
					shuliang=rs0.getFloat("������Ŀ��ֵ")+rs.getFloat("��������ֵ");
					zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("��������ֵ");
					sql8="update ������ͳ�Ʊ� set ������Ŀ��ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
					stmt2.executeUpdate(sql8);
				}
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("��Ŀ������");
					sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						shuliang=rs0.getFloat("������Ŀ��ֵ")+rs.getFloat("��������ֵ");
						zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("��������ֵ");
						sql8="update ������ͳ�Ʊ� set ������Ŀ��ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
			}
			rs.close();
			
			String sql2="select * from ����ר�� where ����ʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql2);
			if(rs.first()){
				String temp=rs.getString("��������");
				String[] temp1=temp.split(",");
				int i=0;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						
						shuliang=rs0.getFloat("����ר����ֵ")+rs.getFloat("��������ֵ");
						zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("��������ֵ");
						sql8="update ������ͳ�Ʊ� set ����ר����ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
				while(rs.next()){
					temp=rs.getString("��������");
					temp1=temp.split(",");
					i=0;
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
						rs0=stmt1.executeQuery(sql0);
						if(rs0.first())
						{
							
							shuliang=rs0.getFloat("����ר����ֵ")+rs.getFloat("��������ֵ");
							zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("��������ֵ");
							sql8="update ������ͳ�Ʊ� set ����ר����ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
							stmt2.executeUpdate(sql8);
						}
						rs0.close();
					}
				}
			}
			rs.close();
			
			String sql3="select * from �� where ��ʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql3);
			if(rs.first()){
				String temp=rs.getString("����Ա����");
				String[] temp1=temp.split(",");
				int i=0;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						shuliang=rs0.getFloat("�񽱷�ֵ")+rs.getFloat("��������ֵ")*HJ[i];
						zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("��������ֵ")*HJ[i];
						sql8="update ������ͳ�Ʊ� set �񽱷�ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
				while(rs.next()){
					temp=rs.getString("����Ա����");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
						rs0=stmt1.executeQuery(sql0);
						if(rs0.first())
						{
							shuliang=rs0.getFloat("�񽱷�ֵ")+rs.getFloat("��������ֵ")*HJ[i];
							zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("��������ֵ")*HJ[i];
							sql8="update ������ͳ�Ʊ� set �񽱷�ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
							stmt2.executeUpdate(sql8);
						}
						rs0.close();
					}
				}
			}
			rs.close();
			
			String sql4="select * from ѧ����ְ where ��ְ��ʼʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql4);
			if(rs.first()){
				xingming=rs.getString("����");
				sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
				rs0=stmt1.executeQuery(sql0);
				if(rs0.first())
				{
					shuliang=rs0.getFloat("ѧ����ְ��ֵ")+rs.getFloat("ѧ������ֵ");
					zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("ѧ������ֵ");
					sql8="update ������ͳ�Ʊ� set ѧ����ְ��ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
					stmt2.executeUpdate(sql8);
				}
				rs0.close();
				while(rs.next()){
					xingming=rs.getString("����");
					sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first())
					{
						shuliang=rs0.getFloat("ѧ����ְ��ֵ")+rs.getFloat("ѧ������ֵ");
						zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("ѧ������ֵ");
						sql8="update ������ͳ�Ʊ� set ѧ����ְ��ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
			}
			rs.close();
			
			String sql5="select * from ר�� where ʱ�� = '"+Time+"'";
			rs=stmt.executeQuery(sql5);
			if(rs.first()){
				String temp=rs.getString("��Ա����");
				String[] temp1=temp.split(",");
				int i;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
					rs0=stmt1.executeQuery(sql0);
					if(rs0.first()){
						shuliang=rs0.getFloat("ר����ֵ")+rs.getFloat("��������ֵ")*ZL[i];
						zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("��������ֵ")*ZL[i];
						sql8="update ������ͳ�Ʊ� set ר����ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
						stmt2.executeUpdate(sql8);
					}
					rs0.close();
				}
				while(rs.next()){
					temp=rs.getString("��Ա����");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
						rs0=stmt1.executeQuery(sql0);
						if(rs0.first()){
							shuliang=rs0.getFloat("ר����ֵ")+rs.getFloat("��������ֵ")*ZL[i];
							zongshuliang=rs0.getFloat("�ܷ�ֵ")+rs.getFloat("��������ֵ")*ZL[i];
							sql8="update ������ͳ�Ʊ� set ר����ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
							stmt2.executeUpdate(sql8);
						}
						rs0.close();
					}
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
				String temp=r1.getString("��Ա����");
				String[] temp1=temp.split(",");
				int i;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						
						shuliang=rs0.getFloat("���ʺ�����ֵ")+r1.getFloat("��������ֵ");
						zongshuliang=rs0.getFloat("�ܷ�ֵ")+r1.getFloat("��������ֵ");
						sq1="update ������ͳ�Ʊ� set ���ʺ�����ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
						stm3.executeUpdate(sq1);
					}
					rs0.close();
				}
				while(r1.next()){
					temp=r1.getString("��Ա����");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
						rs0=stmt2.executeQuery(sql0);
						if(rs0.first()){
							
							shuliang=rs0.getFloat("���ʺ�����ֵ")+r1.getFloat("��������ֵ");
							zongshuliang=rs0.getFloat("�ܷ�ֵ")+r1.getFloat("��������ֵ");
							sq1="update ������ͳ�Ʊ� set ���ʺ�����ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
							stm3.executeUpdate(sq1);
						}
						rs0.close();
					}
				}
			}
			r1.close();
			
			String sq2="select * from ����ѧϰ where ��ʼʱ�� = '"+Time+"'";
	
			ResultSet r2=null;
			r2=stm1.executeQuery(sq2);
			if(r2.first()){
				String temp=r2.getString("��Ա����");
				String[] temp1=temp.split(",");
				int i;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						shuliang=rs0.getFloat("����ѧϰ��ֵ")+r2.getFloat("��������ֵ");
						zongshuliang=rs0.getFloat("�ܷ�ֵ")+r2.getFloat("��������ֵ");
						sq2="update ������ͳ�Ʊ� set ����ѧϰ��ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
						stm3.executeUpdate(sq2);
					}
					rs0.close();
				}
				while(r2.next()){
					temp=r2.getString("��Ա����");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
						rs0=stmt2.executeQuery(sql0);
						if(rs0.first()){
							shuliang=rs0.getFloat("����ѧϰ��ֵ")+r2.getFloat("��������ֵ");
							zongshuliang=rs0.getFloat("�ܷ�ֵ")+r2.getFloat("��������ֵ");
							sq2="update ������ͳ�Ʊ� set ����ѧϰ��ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
							stm3.executeUpdate(sq2);
						}
						rs0.close();
					}
				}
			}
			r2.close();
			
			
			String sq3="select * from ���о��� where ��� = '"+Time+"'";
			
			ResultSet r3=null;
			
			r3=stm1.executeQuery(sq3);
			if(r3.first()){
				xingming=r3.getString("��Ŀ������");
				sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
				rs0=stmt2.executeQuery(sql0);
				if(rs0.first())
				{
					shuliang=rs0.getFloat("���о��ѷ�ֵ")+r3.getFloat("��������ֵ");
					zongshuliang=rs0.getFloat("�ܷ�ֵ")+r3.getFloat("��������ֵ");
					sq3="update ������ͳ�Ʊ� set ���о��ѷ�ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
					stm3.executeUpdate(sq3);
				}
				rs0.close();
				while(r3.next()){
					xingming=r3.getString("��Ŀ������");
					sql0="select * from ����ͳ��  where ���� = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first())
					{
						shuliang=rs0.getFloat("���о��ѷ�ֵ")+r3.getFloat("��������ֵ");
						zongshuliang=rs0.getFloat("�ܷ�ֵ")+r3.getFloat("��������ֵ");
						sq3="update ������ͳ�Ʊ� set ���о��ѷ�ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
						stm3.executeUpdate(sq3);
					}
					rs0.close();
				}
			}
			r3.close();
			
			String sq4="select * from �������Ȩ where ����ʱ�� = '"+Time+"'";
			
			ResultSet r4=null;
			
			r4=stm1.executeQuery(sq4);
			if(r4.first()){
				String temp=r4.getString("��Ա����");
				String[] temp1=temp.split(",");
				int i;
				for(i=0;i<temp1.length;i++)
				{
					xingming=temp1[i];
					sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
					rs0=stmt2.executeQuery(sql0);
					if(rs0.first()){
						shuliang=rs0.getFloat("�������Ȩ��ֵ")+r4.getFloat("��������ֵ");
						zongshuliang=rs0.getFloat("�ܷ�ֵ")+r4.getFloat("��������ֵ");
						sq4="update ������ͳ�Ʊ� set �������Ȩ��ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
						stm3.executeUpdate(sq4);
					}
					rs0.close();
				}
				while(r4.next()){
					temp=r4.getString("��Ա����");
					temp1=temp.split(",");
					for(i=0;i<temp1.length;i++)
					{
						xingming=temp1[i];
						sql0="select * from ������ͳ�Ʊ�  where ���� = '"+xingming+"'";
						rs0=stmt2.executeQuery(sql0);
						if(rs0.first()){
							shuliang=rs0.getFloat("�������Ȩ��ֵ")+r4.getFloat("��������ֵ");
							zongshuliang=rs0.getFloat("�ܷ�ֵ")+r4.getFloat("��������ֵ");
							sq4="update ������ͳ�Ʊ� set �������Ȩ��ֵ='"+shuliang+"',�ܷ�ֵ='"+zongshuliang+"' where ����='"+xingming+"'";
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

