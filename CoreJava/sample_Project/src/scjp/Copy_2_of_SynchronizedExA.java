package scjp;

public class Copy_2_of_SynchronizedExA {
	public static void main(String args[]) {
		Copy_2_of_SynchronizedExB seb = new Copy_2_of_SynchronizedExB();
		seb.start();
		System.out.print("Total is: " + seb.total);
	}
}

class Copy_2_of_SynchronizedExB extends Thread {
	int total=0;
	public void run() {
		for(int i=0;i<2;i++) {
			total+=i;
		}
	}
}
