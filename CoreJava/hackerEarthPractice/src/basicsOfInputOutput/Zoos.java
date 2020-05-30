package basicsOfInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zoos {

	public static void main(String args[] ) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		char[] inputArr = input.toCharArray();
		int z=0;
		int o=0;
		for(int i=0; i<inputArr.length;i++) {
			if(inputArr[i] == 'z' ) {
				z++;
			} else if(inputArr[i] == 'o' ) {
				o++;
			}
		}
		if((2*z) == o) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
