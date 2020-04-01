package com.mmm;

class Vehicle2{
	int speed=50;
	void run(){
		System.out.println("Vehicle is running "+"with speed = "+speed);
	}
}

class Bikes extends Vehicle2{
	int speed=56;
	void run(){
		System.out.println("Bikes " + speed);
	}
}



public class Bike2 extends Bikes{

	public Bike2() {
		// TODO Auto-generated constructor stub
	}
	int speed=100;
	void run(){
		System.out.println("Bike is running "+"with speed = "+speed);
	}
	/**
	 * @param args
	 */
	void display(){
		run();
		super.run();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bike2 b_obj = new Bike2();
//		Bikes p_obj = new Bikes();
//		Vehicle2 v_obj = new Vehicle2();
		//Bike2 b_obj = new Bike2();
		//Bikes b_obj = new Bikes();
		Vehicle2 b_obj = new Vehicle2();
		b_obj.run();
		//v_obj.run();
//		b_obj.display();
	}

}
