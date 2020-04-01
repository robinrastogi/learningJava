//Program to get cube of a given number by static method
package com.mmm;

public class CalculateCube{
	static int cube(int x){
//	int cube(int x) {
		return x*x*x;
		}

public static void main(String args[]) {
//	CalculateCube calc_obj = new CalculateCube();
//	int result = calc_obj.cube(7);
//	System.out.println(result);
	int result=CalculateCube.cube(5);
	System.out.println(result);
	}
}