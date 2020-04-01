package techgig;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class MaxDiffInArr {
	//	static int array[];
	//	static int lengthOfArray=0;
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int lengthOfArray = scanner.nextInt();
		System.out.println("length "+ lengthOfArray);
		int array[] = new int[lengthOfArray];
		for(int i=0;i<lengthOfArray;i++){
			array[i] = scanner.nextInt();
		}
		scanner.close();
		//Array is:
		for (int j=0;j<lengthOfArray;j++){
			System.out.println("== "+array[j]);
		}
		int max=array[0];
		int min=array[0];
		for (int j=0;j<lengthOfArray;j++){
			if (array[j]>max){
				max=array[j];
			}
			if(array[j]<min){
				min=array[j];
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		System.out.println("max Difference is: "+(max-min));
	}
}
