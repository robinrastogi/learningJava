package com.mmm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Program for displaying first 10 elements of Fibonacci series.

public class Fibonacci {
	static int n1=0,n2=1,n3=0; 
	
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the range of series: ");
			int c = Integer.parseInt(br.readLine());
			System.out.println("count entered is: "+c);
			System.out.println("calling by non-recursive method...");
			Fibonacci f=new Fibonacci();
			f.fibbo(c);
			System.out.println("calling by recursive method...");
			Fibonacci.fibboR(c);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void fibbo(int count){
		int i,f0=1,f1=1,f2=0;
		System.out.println(f0);
		for(i=1;i<count;i++) {
			//for(i=1;i<=n;i++) {
			f2=f0+f1;
			f0=f1;
			f1=f2;
			//f2=f0;
			System.out.println(f2);
		}
	}

	static void fibboR(int count){ 
		if(count>0){    
			n3 = n1 + n2;
			n1 = n2;    
			n2 = n3;    
			System.out.print(" "+n3);
			fibboR(count-1);    
		}    
	}
}



