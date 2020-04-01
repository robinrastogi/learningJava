package jdbc_javaTpoint;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.*;

public class FetchRecord {
	public static void main( String args[] ) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "postgres");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");
	
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
//			rs is the object of ResultSet interface
			while ( rs.next() ) {
				int id = rs.getInt("id"); //column-1: id 
				String  name = rs.getString("name");
				int age  = rs.getInt("age"); //column-2: age
				String  address = rs.getString("address");
				float salary = rs.getFloat("salary"); //column-1: salary
				System.out.println( "ID = " + id );
				System.out.println( "NAME = " + name );
				System.out.println( "AGE = " + age );
				System.out.println( "ADDRESS = " + address );
				System.out.println( "SALARY = " + salary );
				System.out.println();
			}
	    
	//    delete query
			int result=stmt.executeUpdate("delete from COMPANY where id=10");
			System.out.println(result+" records affected");
			System.out.println("updated records are as below:");
//			c.commit();
			rs.close();
			stmt.close();
			c.close();
			} catch ( Exception e ) {
				System.err.println( e.getClass().getName()+": "+ e.getMessage() );
				System.exit(0);
			}
		System.out.println("Operation done successfully");
	}
}