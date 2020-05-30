package testInterface;

public class ProductOfAllSubArrays {

	public static void main(String[] args) {
		
		int arr[] = {2,4};
		int prod = 1;
		int output = 1;
		for(int i=0;i<arr.length;i++) {
			prod = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				prod = prod * arr[j];
				output = output * prod;
			}
			output = arr[i]*output;
		}
		System.out.println("output:: " + output);
	}

}
