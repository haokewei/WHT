package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * SQL connection module
 * @author HAN
 *
 */
public class Connect {
	Connection con;//Declare a Connection object
	String driver="com.mysql.jdbc.Driver";// the MySQL driver
	String url="jdbc:mysql://localhost:3306/科研成果";// URL points to destination database to manipulate
	String user="root";//user name for the specified database
	String pwd="1234";//the corresponding password
	public Connection getConnection(){
		try {
			Class.forName(driver);// add MySQL driver
			//System.out.println("Database driver is successfully added");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection(url,user,pwd);//create a connection object
			//System.out.println("Database connection is successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args){
	}
}
