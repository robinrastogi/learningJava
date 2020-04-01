package com.mmm;

public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=242;
		int n=a,b=a,rev=0;
		while(n>0) {
			a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		if(rev==b)
			System.out.println("it is Palindrome");
		else
			System.out.println("it is not palindrome");
	}

}
