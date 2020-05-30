package testInterface;

public class AllRotationsOfGivenString {

	public static void main(String[] args) {

		//String str = "geeks";
		StringBuilder str = new StringBuilder("geeks");
		System.out.println(str);
		
		for(int i=0;i<str.length()-1;i++) {			
			System.out.println(str.substring(1)+str.substring(0,1));
			String str2 = str.substring(1)+str.substring(0,1);
			str = new StringBuilder(str2);
		}

	}

}
