package com.mmm;

class Vehicle{
	int speed=50;
	void run(){
		System.out.println("Vehicle is running "+"with speed = "+speed);
	}
}


public class Bike extends Vehicle{

	public Bike() {
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
		Bike b_obj = new Bike();
		//Vehicle v_obj = new Vehicle();
		//b_obj.run();
		//v_obj.run();
		b_obj.display();
	}

}
