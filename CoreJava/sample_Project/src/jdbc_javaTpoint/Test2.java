package jdbc_javaTpoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test2 {
	public static void main(String ar[]) {
		try {
//			String database="student.mdb";//Here database exists in the current directory
//			String database="student.mdb";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + database + ";DriverID=22;READONLY=true";
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.accdb)};DBQ=F:\\Robin\\myStudy\\Java\\student.accdb;";
//			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=F:\\Robin\\myStudy\\Java\\javatpoint.com\\JDBC\\accesswithoutdsn\\student.mdb;";
			
//			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection(url);
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from students");
//			ResultSet rs=st.executeQuery("select * from employee where empname='robin'");
			while(rs.next()) {
				System.out.println(rs.getString(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getString(4));
			}
		}
		catch(Exception ee) {
			System.out.println(ee);
		}
	}
}
