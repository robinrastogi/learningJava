package com.mmm;

public class ArmStrong {

	public ArmStrong() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,c=0,a,d;
		d=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			}
		if(d==c)
			System.out.println("armstrong number");
		else
			System.out.println("it is not an armstrong number");
	}
}
