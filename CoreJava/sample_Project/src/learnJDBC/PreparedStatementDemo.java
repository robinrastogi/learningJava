package learnJDBC;
a   PreparedStatementDemo.java %SystemRoot%\system32\SHELL32.dll    ;   C:\DOCUME~1\vani_kn\Desktop\ADVANC~1\DEMOPR~1\PREPAR~1.JAV �  /*
 * Date: 10-Apr-2007
 * @author E&R Dept, Infosys Technologies
   Limited
 * @version 1.0
 * Description: This file is a demo of
 * a Java program connecting to a database using PreparedStatement
  */

/**
 * class PreparedStatementDemo
 * Description: class contains main
   method
 */


import java.sql.Connection ;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;



class PreparedStatementDemo{

	public static void main(String args[]) throws Exception{

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.122.130.31:1521:training","scott", "tiger");

			PreparedStatement preparedStatement = connection.prepareStatement("select * from student where sid=?");

			preparedStatement.setInt(1, 101);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next())
                        {
		 	 System.out.println(resultSet.getInt("sid"));
		 	 System.out.println(resultSet.getString("name"));
                         System.out.println(resultSet.getInt("age"));
                         System.out.println(resultSet.getFloat("mark"));
			}//end of while

			// close the connection
		          connection.close();


		    }//end of try

		

		c