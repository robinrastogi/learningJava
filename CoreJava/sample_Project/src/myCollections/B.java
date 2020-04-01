package myCollections;

public class B {

	public B() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;
//		int a[]={10,20,70,40,50};
		
		for(int i=0;i<a.length;i++){
			System.out.println("element "+(i+1)+" is => "+a[i]);
		}

	}

}
