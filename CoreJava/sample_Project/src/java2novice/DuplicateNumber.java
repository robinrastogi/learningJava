/*You have got a range of numbers between 1 to N, where one of the number is
repeated. You need to write a program to find out the duplicate number.*/

package java2novice;

//package com.java2novice.algos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateNumber {

	public int findDuplicateNumber(List<Integer> numbers) {
		Iterator<Integer> itr=numbers.iterator();
		int duplicate = 0;
		while(itr.hasNext()) {
			//			  System.out.println(itr.next());
			//		  }
			int temp=itr.next();
			if (itr.equals(temp));
			duplicate = itr.next();
		}
		//         
		//        int highestNumber = numbers.size() - 1;
		//        int total = getSum(numbers);
		//        int duplicate = total - (highestNumber*(highestNumber+1)/2);
		return duplicate;
		//    }
		//     
		//    public int getSum(List<Integer> numbers){
		//         
		//        int sum = 0;
		//        for(int num:numbers){
		//            sum += num;
		//        }
		//        return sum;
	}

	public static void main(String a[]){
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<100;i++){
			numbers.add(i);
		}
		//add duplicate number into the list
		numbers.add(58);
		DuplicateNumber dn = new DuplicateNumber();
		System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
	}
}
