package myCollections;

public class MinValueOfArr {

	public MinValueOfArr() {
		// TODO Auto-generated constructor stub
	}
	static void min(int arr[]){
		int min=arr[0];
		int min_index=0;
		for (int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
				min_index=i;
			}
		}
		System.out.println("Minimum Value is "+min+" at location "+(min_index+1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,20,7,4,50};
		min(a);

	}

}
