package jdbc_javaTpoint;

import java.sql.*;
public class UpdatePrepared {
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
			
			PreparedStatement stmt=con.prepareStatement("update company set salary=? where id=?");
//			columns: ID, NAME, AGE, ADDRESS, SALARY
			stmt.setInt(1,65000);
			stmt.setInt(2,2);
			
			int i=stmt.executeUpdate();
			System.out.println(i+" records updated");
			
			con.close();
		}
		catch(Exception e) { 
			System.out.println(e);
		}
	}
}