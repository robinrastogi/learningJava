package serialization_ex;
import java.io.*;  

public class Depersist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/Project Documents/f.txt"));  
		Student s=(Student)in.readObject();  
		System.out.println(s.id+" "+s.name);  
		in.close();  
		}
		catch(Exception e) {
			
		}
	}

}
