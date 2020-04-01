package myCollections;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kth_Maximum {
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Matrix size");
		int n = Integer.parseInt(br.readLine());	
		int [][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("you entered => \n");
		
		for(int i=0;i<n;i++) {								//
			for(int j=0;j<n;j++) {								//
				System.out.println(arr[i][j]+"  ");					//> printing the array.
			}													//
			System.out.println("\n");						//
		}
		
		int max=0;
		System.out.println("Enter 'K' to find Kth Biggest element");
		int k =0;
		
		while((k =  Integer.parseInt(br.readLine()))>(n*n))
		{
			System.out.println("Please enter K within range "+(n*n)+"\n");
			System.exit(0);
		}
		
		for(int i=0;i<k;i++) {
			max= findMax(arr);
		}
		
		System.out.println(max +" is the " + k + "th largest element in the array");
	}
	
	public static int findMax(int[][] arr) {
		int max=arr[0][0];
		int n= arr.length;
		int x=0,y=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
					x=i;y=j;
				}
			}
		}
		arr[x][y]=0;
		
		return max;
		
	}	
}
