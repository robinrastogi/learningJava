package collectionsDemo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class is prompt the user for input and return the given data as String object.
 * @Created on Jun 07, 2007
 * @author Java_Team,E&R Mysore, Infosys Technologies Limited
 * @version 1.0
 */
public class ReadData {

	/**
	 * <h3>Description :</h3> This is the static method that accepts 
	 * data from the console and returns a string on pressing the return 
	 * key.
	 * @return the string form of the data entered through the console
	 */
	public static String acceptString() {
		//the return variable initialization
		String stringData = null;
		BufferedReader input = null;
		try {
			//chaining the streams
			input = new BufferedReader(new InputStreamReader(System.in));
			//reading data from the reader
			stringData=input.readLine();
        }
        catch(IOException ioException){
			System.out.println("Error in accepting data.");
		}
		finally {
			input=null;
		}
		return stringData;
	}
}