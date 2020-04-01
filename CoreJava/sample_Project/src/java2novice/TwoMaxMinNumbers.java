package java2novice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* The logic is: 
 * compare every element with the highest (assume 'z') and the second highest (assume 'y') number in the array.
 * If the number is greater than z then replace y with z and then replace it with z.
 * If not then if the number is greater than y replace it with y.*/


public class TwoMaxMinNumbers {

//	Method to calculate second highest
	static int maximum=0;
	static int x = 0;
	public void printTwoMaxNumbers(int[] nums) {
		int maxOne = 0;
        int maxTwo = 0;
        for(int n=0;n<nums.length;n++) {
//        for(int n:nums) {
            if(maxOne < nums[n]) {
                maxTwo = maxOne;
                maxOne =nums[n];
            } else if(maxTwo < nums[n]){
                maxTwo = nums[n];
            }
        }
//        System.out.println("First Max Number: "+maxOne);
//        System.out.println("Second Max Number: "+maxTwo);
        
        maximum=maxOne;
        
        if (x!=0) {
            
        	System.out.println("Array is as: \n");
            for(int n=0;n<nums.length;n++) {
            	System.out.println(nums[n]+"  ");
            }
            
        	System.out.println("Highest Number: "+maxOne);
            System.out.println("Second Highest Number: "+maxTwo);
        }
        x++;
    }
	
	
//	Method to calculate second lowest
	public void printTwoMinNumbers(int[] nums) {
//		int minOne = nums[0];
//        int minTwo = nums[1];
		
		int minOne = maximum;
		int minTwo = maximum;
		
        for(int n=0;n<nums.length;n++) {
//        for(int n:nums) {
            if(minOne > nums[n]) {
            	minTwo = minOne;
                minOne =nums[n];
            } else if(minTwo > nums[n] && minOne != nums[n]){
            	minTwo = nums[n];
            }
        }
//        System.out.println("First Max Number: "+maxOne);
//        System.out.println("Second Max Number: "+maxTwo);
        System.out.println("Array is as: \n");
        for(int n=0;n<nums.length;n++) {
        	System.out.println(nums[n]+"  ");
        }
        System.out.println("Lowest Number: "+minOne);
        System.out.println("Second Lowest Number: "+minTwo);
    }
     
    public static void main(String args[]) {
//        if (args.length == 0) {
//            System.err.println("ArrrrrreYYY kuch to enter karo yaaaarrr !!");
//            System.exit(-1);
//        }
        int choice;      
                
        System.out.println("Enter your choice: ");
        System.out.println("\n");
        System.out.println("1: Second Highest and highest");
        System.out.println("\n");
        System.out.println("2: Second Lowest");
        
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
//			int num[] = {5,34,78,2,45,1,99,23,85,97,100};
//			int num[] = {6,8,77,55,10};
//			int num[] = {6,8,77,55,110,100};
			int num[] = {6,8,77,55,110,100,3};
        	int x=0;
			//////
			TwoMaxMinNumbers firstRun = new TwoMaxMinNumbers();
        	firstRun.printTwoMaxNumbers(num);
        	/////
        	
	        if (choice == 1) {
	        	TwoMaxMinNumbers tmn = new TwoMaxMinNumbers();
	        	tmn.printTwoMaxNumbers(num);
	        }
	        else if (choice == 2) {
	        	TwoMaxMinNumbers tmn2 = new TwoMaxMinNumbers();
	        	tmn2.printTwoMinNumbers(num);
	        }
	        else {
	        	System.out.println("Please enter 1 or 2");
	        }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("please enter a number");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("please enter a number");
		}	
        
    }
}