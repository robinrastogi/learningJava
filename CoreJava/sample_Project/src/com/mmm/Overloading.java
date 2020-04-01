package com.mmm;

public class Overloading {

	public Overloading() {
		// TODO Auto-generated constructor stub
	}
	public static void main(int a) {
		System.out.println(a);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("main() method invoked");
		  main(10);
	}

}

//code from javatpoint.com
//class Simple{
//  public static void main(int a){
//  System.out.println(a);
//  }
//  
//  public static void main(String args[]){
//  System.out.println("main() method invoked");
//  main(10);
//  }
//}