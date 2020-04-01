package com.mmm;

abstract class shape{
	abstract void draw();
}

class rect extends shape{
	void draw(){
		System.out.println("drawing rectangle");
	}
	void draw_r(){
		System.out.println("draw2 is called");
	}
}

class circle extends shape{
	void draw(){
		System.out.println("drawing circle");
	}
	void draw_c(){
		System.out.println("draw2 is called");
	}
}


public class Abs_test {

	public Abs_test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s = new circle();
		s.draw();
//		s.draw_c();
		circle c=new circle();
		c.draw_c();
		c.draw();
	}

}
