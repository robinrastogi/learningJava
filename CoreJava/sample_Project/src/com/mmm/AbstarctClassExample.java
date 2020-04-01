package com.mmm;

interface AExample {
	void a();
	void b();
	void c();
	void d();
}

abstract class BExample implements AExample {
	public void c() {
		System.out.println("I am C");
	}
}

class MExample extends BExample {
	public void a() {
		System.out.println("I am a");
	}
	public void b() {
		System.out.println("I am b");
	}
	public void d() {
		System.out.println("I am d");
	}
}

public class AbstarctClassExample {
	public static void main(String args[]){
		AExample a=new MExample();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
