package com.mmm;

interface Printable{
//	void a();
//	void b();
}

class A implements Printable{
	public void a(){
		System.out.println("my a method");
	}
}

class B implements Printable{
	public void b(){
		System.out.println("my b method");
	}
}

class call{
	void invoke (Printable p){//upcasting
		if(p instanceof A){
			A a=(A)p;//downcasting
			a.a();
		}
		if(p instanceof B){//downcasting
			B b=(B)p;
			b.b();
		}
	}
}

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p = new B();
		call c = new call();
		c.invoke(p);
	}

}
