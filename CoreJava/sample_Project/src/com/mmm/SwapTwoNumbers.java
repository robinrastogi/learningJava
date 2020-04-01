package com.mmm;

public class SwapTwoNumbers {

	public SwapTwoNumbers() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40,b=5;
//		a=a*b;
//		b=a/b;
//		a=a/b;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
