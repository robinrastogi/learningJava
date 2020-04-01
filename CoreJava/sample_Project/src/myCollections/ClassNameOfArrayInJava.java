package myCollections;

public class ClassNameOfArrayInJava {

	public ClassNameOfArrayInJava() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,20,7,4,50};
		int b[]={60,25,74,45,70};
		Class<? extends int[]> ca=a.getClass();
		String name_a=ca.getName();
		Class<? extends int[]> cb=b.getClass();
		String name_b=cb.getName();
		System.out.println("class name of array a is "+name_a);
		System.out.println("class name of array a is "+name_b);

	}

}
