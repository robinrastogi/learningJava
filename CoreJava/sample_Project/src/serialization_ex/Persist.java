package serialization_ex;
import java.io.*;

public class Persist {

	/**
	 * @param args
	 */

	public static void main(String args[])throws Exception{
		Student s1 =new Student(2181,"raasdnjasdvnasdvvi");

		FileOutputStream fout=new FileOutputStream("D:/Project Documents/f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();

		System.out.println("success");
	}

}
