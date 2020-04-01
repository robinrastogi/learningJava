package techgig;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModalValue {

	/**
	 * @param args
	 */
	public static void main(String args[] ) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int ar[];
		while ((line = stdin.readLine()) != null){
			Scanner scanner = new Scanner(System.in);
			int lengthOfArray = scanner.nextInt();
			int ar[] = new int[lengthOfArray];
			for(int i=0;i<lengthOfArray;i++){
				ar[i] = scanner.nextInt();
			}
			scanner.close();
		}
		for(int j=0;j<ar.length;j++){
			
		}
//		System.out.println(hm);
	}
}
