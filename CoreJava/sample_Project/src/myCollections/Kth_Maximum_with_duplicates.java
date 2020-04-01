package myCollections;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kth_Maximum_with_duplicates {
	
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
		
		int max=0;
		System.out.println("Enter K to find Kth Biggest element");
		int k =0;
		
		while((k =  Integer.parseInt(br.readLine()))>(n*n))
		{
			System.out.println("Please enter K within range "+(n*n));
		}
		
		for(int i=0;i<k;i++) {
			max= findMax(arr);
		}
		
		System.out.println(max +" is the " + k + "th largest element in the array");
	}
	
	public static int findMax(int[][] arr) {
		int max=arr[0][0];
		int n= arr.length;
		int k=0,l=0;
		int []xarr= new int [n*n]; 
		int []yarr= new int [n*n];
		int x=0,y=0;
		int p=0,q=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]>=max)
				{
					max=arr[i][j];
					xarr[k++]=i;yarr[l++]=j;
					x=i;y=j;
				}
			}
		}
		for (k=0;k<n*n;k++) {
			for (l=0;l<n*n;l++) {
				xarr[k]=p;yarr[l]=q;
				arr[p][q]=0;
			}
		}
		arr[x][y]=0;
		
//		Printing the array for testing...
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
		return max;
		
	}	
}
