package com.mmm;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

public class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}
	public static void main(String args[]) {
		Dog a=new Dog();
		Animal b=new Animal();
//		Animal a=new Dog();
		a.eat();
		b.eat();
	}
}

