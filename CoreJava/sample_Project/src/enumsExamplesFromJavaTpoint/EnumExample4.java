package enumsExamplesFromJavaTpoint;

class EnumExample4{
	enum Season{
//		WINTER(5), SPRING(10), SUMMER(15), FALL(20);
		WINTER(5,1), SPRING(10,2), SUMMER(15,3), FALL(20,4);
//		private int hahu=777;
		private int hahu;
		private int i;
//		private Season(int haha){
//			this.hahu=haha;
//		}
		private Season(int haha){
			this.i=haha;
		}
		
		private Season(int haha1, int haha2){
			this.hahu=haha1;
			this.i=haha2;
		}
	}

public static void main(String args[]){
		for (Season s : Season.values())
//			System.out.println(s+" "+s.hahu);
			System.out.println(s+" "+s.i+ " "+s.hahu);
	}
}