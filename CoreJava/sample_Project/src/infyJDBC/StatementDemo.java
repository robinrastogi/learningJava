/*
 * Date: 02-Apr-2007
 * @author E&R Dept, Infosys Technologies
   Limited
 * @version 1.0
 * Description: This file is a demo of
 * a Java program connecting to a database
  */

/**
 * class StatementDemo 
 * Description: class contains main
   method
 */


import java.sql.Connection ;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


class StatementDemo {
	public static void main(String args[]) {
	try{
	       Class.forName("oracle.jdbc.driver.OracleDriver");

	       Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.122.130.31:1521:training","scott", "tiger");


               Statement statement = connection.createStatement();

	       ResultSet resultSet = statement.executeQuery("select * from student");

               while(resultSet.next()){

		   System.out.println(resultSet.getInt("SID"));
		   System.out.println(resultSet.getString("NAME"));
		   System.out.println(resultSet.getString("EMAILID"));
                   System.out.println(resultSet.getFloat("MARK"));
                   System.out.println("");
              } // end of while
        }end of try

	 // close the connection
          connection.close();

       catch(Exception exception) {
	    System.out.println(exception);
       }//end of catch
    }//end of main
}//end of StatementDemo

