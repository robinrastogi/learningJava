package jdbc_javaTpoint;

import java.sql.*;
public class InsertPrepared {
	public static void main(String args[]) {
		Connection con = null;
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			
//			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "postgres");
//			con.setAutoCommit(false);
			System.out.println("Opened database successfully");
			
			PreparedStatement stmt=con.prepareStatement("insert into COMPANY values(?,?,?,?,?)");
//			columns: ID, NAME, AGE, ADDRESS, SALARY
			stmt.setInt(1,2);//1 specifies the first parameter in the query
			stmt.setString(2,"Sagar");
			stmt.setInt(3,27);
			stmt.setString(4,"27/2, Silpa Park");
			stmt.setInt(5,70000);
			
			int i=stmt.executeUpdate();
			System.out.println(i+" records inserted");
			
			con.close();
		}
		catch(Exception e){ 
			System.out.println(e);
		}
	}
}