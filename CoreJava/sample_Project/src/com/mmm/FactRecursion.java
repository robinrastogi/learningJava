package com.mmm;

public class FactRecursion {

	public FactRecursion() {
		// TODO Auto-generated constructor stub
	}
	static int fact(int n) {
		if(n==1)
			return 1;
		return n*=fact(n-1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=fact(5);
		System.out.println(f);
	}
}
