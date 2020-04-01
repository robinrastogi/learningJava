package com.mmm;

public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	void fact(int n){
		int fact=1;
		for (int i=1;i<=n;i++){
			fact = fact*i;
			}
//		for (int i=n;i>=1;i--){
//			fact = fact*i;
//			}
		System.out.println("Oyee Factorial is "+ fact + " yeeeee correct !!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Factorial().fact(5);
	}

}
