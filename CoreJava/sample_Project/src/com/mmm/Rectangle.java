package com.mmm;

public class Rectangle {

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	int length;
	int width;
	
	void insert (int l, int w){
		length = l;
		width = w;
	}
	
	void calculateArea(){
		System.out.println("Area of racetangle is "+ length*width);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Rectangle r1 = new Rectangle();
//		Rectangle r2 = new Rectangle();
		Rectangle r1 = new Rectangle(), r2 = new Rectangle();
		
		r1.insert(11, 5);
		r2.insert(3, 15);
		
		r1.calculateArea();
		r2.calculateArea();
	}

}
