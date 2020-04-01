package techgig;
import java.io.*;
public class LeapYears {
	public static void main(String args[] ) throws Exception {
		//		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		//		String line = ""; int year=0;
		//		while ((line = stdin.readLine()) != null){
		//			year=Integer.parseInt(line);
		//		}
		for(int year=1900;year<=2020;year++){
			if(year%4 == 0 && year%100 != 0 || year%400 == 0){
				System.out.println("True "+year);
			}
		}
	}
}
