package com.mmm;

public class Overloading2 {

	public Overloading2() {
		// TODO Auto-generated constructor stub
	}
	void sum(int a,int b){System.out.println("int arg method invoked");}
	void sum(long a,long b){System.out.println("long arg method invoked");}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading2 obj=new Overloading2();
		obj.sum(200000000L,200000000L);//now int arg sum() method gets invoked
		obj.sum(20,20);//now int arg sum() method gets invoked
	}

}


//class Calculation{
//  void sum(int a,int b){System.out.println("int arg method invoked");}
//  void sum(long a,long b){System.out.println("long arg method invoked");}
//
//  public static void main(String args[]){
//  Calculation obj=new Calculation();
//  obj.sum(20,20);//now int arg sum() method gets invoked
//  }
//}