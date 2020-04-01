package stringExamples;

public class StringNoOfObjectsEx {

	public static void main(String[] args) {
		String s1 = "Robin";
		String s2 = new String("Robin");
		String s3 = s1;
		String s4 = "Rob"+"in";
		String s5 = "robin";
		String s6 = "robi";
		String s7 = s6+"n";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		System.out.println(s1==s4);
		System.out.println(s4==s2);
		System.out.println(s5==s7);
	}

}
