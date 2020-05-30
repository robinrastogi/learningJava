package basicsOfInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeString {

	public static void main(String[] args) throws Exception  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		StringBuilder str = new StringBuilder(input);
		String reverse = str.reverse().toString();
		
		System.out.println("input: " + input);
		System.out.println("output: " + reverse);
		
		if(input.equals(reverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
