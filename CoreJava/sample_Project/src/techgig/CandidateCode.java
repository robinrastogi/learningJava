package techgig;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
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
		int maxtwo=array[0];
		int maxone=array[1];
		int maxoneIndex=0; int maxtwoIndex=0;
		//Array is:
		for (int j=0;j<lengthOfArray;j++){
			System.out.println("== "+array[j]);
		}
//		for (int j=2;j<lengthOfArray;j++){
//			if(array[j]>maxone && array[j]>maxtwo){
//				maxtwo=maxone;
//				maxone=array[j];
//				maxoneIndex=j;
//				System.out.println("j in m1 "+j);
//			}else if(array[j]>maxtwo && array[j]<maxone){
//				maxtwo=array[j];
//				maxtwoIndex=j;
//				System.out.println("j in m2 "+j);
//			}
//		}
//		System.out.println("maxone: "+maxone);
//		System.out.println("maxtwo: "+maxtwo);
//		System.out.println("maxoneIndex: "+maxoneIndex);
//		System.out.println("maxtwoIndex: "+maxtwoIndex);
//		for (int k=maxtwoIndex;k>0;k--){
//			array[k]=array[k-1];
//		}
//		array[0]=maxtwoIndex;
//		for (int k=maxoneIndex;k>0;k--){
//			array[k]=array[k-1];
//		}
//		array[0]=maxoneIndex;
//		for(int p=0;p<lengthOfArray;p++){
//			System.out.println("array at "+p+" is: "+array[p]);;
//		}
	}
}
