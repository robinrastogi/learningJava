package techgig;
public class FibbonacciSeries 
{ 
	public static void main(String args[]){
		int b[] = new int[10];
//		FibbonacciSeries cc = new FibbonacciSeries();
//		b=cc.fibonacci_series(1,2);
		b=FibbonacciSeries.fibonacci_series(1,2);
		for (int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
	public static int[] fibonacci_series(int input1,int input2){
		int b[] = new int[10];
		b[0]=input1; b[1]=input2;
		for (int j=2;j<10;j++){
			b[j]=input1+input2;
			input1=input2;
			input2=b[j];
		}
		return b;
	}	
}