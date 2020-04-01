package jdbc_javaTpoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;

public class InsertMultiplePrepared {
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
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PreparedStatement stmt=con.prepareStatement("insert into COMPANY values(?,?,?,?,?)");
			
			
//			columns: ID, NAME, AGE, ADDRESS, SALARY
			do {
				System.out.println("enter id:");
				int id=Integer.parseInt(br.readLine());
				System.out.println("enter name:");
				String name=br.readLine();
				System.out.println("enter age:");
				int age=Integer.parseInt(br.readLine());
				System.out.println("enter address:");
				String address=br.readLine();
				System.out.println("enter salary:");
				float salary=Float.parseFloat(br.readLine());

				
				stmt.setInt(1,id);//1 specifies the first parameter in the query
				stmt.setString(2,name);
				stmt.setInt(3,age);
				stmt.setString(4,address);
				stmt.setFloat(5,salary);
				
				int i=stmt.executeUpdate();
				System.out.println(i+" records affected");

				System.out.println("Do you want to continue: y/n");
				String s=br.readLine();
				if(s.startsWith("n")) {
					break;
				}
			}while(true);
		
			con.close();
		}
		catch(Exception e){ 
			System.out.println(e);
		}
	}
}
