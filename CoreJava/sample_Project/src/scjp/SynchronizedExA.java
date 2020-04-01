package scjp;

public class SynchronizedExA {
	public static void main(String args[]) {
		SynchronizedExB seb = new SynchronizedExB();
//		SynchronizedExB se = new SynchronizedExB();
//		Thread seb = new Thread(se);
		seb.start();
		System.out.println("in main");
		synchronized(seb) {
		try {
				System.out.println("waiting for seb to complete...\n");
				//System.out.println(seb.getName());
//				System.out.println("\n");
				seb.wait();
				System.out.println("Wait is over!!");
			}
			catch(InterruptedException e) {}
//			System.out.print("Total is: " + se.total);
			System.out.println("Total is: " + seb.total);
		}
//		System.out.print("Total is: " + seb.total);
	}
}

class SynchronizedExB extends Thread {
	int total;
	public void run() {
		System.out.println("In run :: part 1");
		synchronized(this) {
			System.out.println("In run :: part 2");
			for(int i=0;i<10;i++) {
				System.out.println("In run :: part 3 :: total now is: " + total);
				if (total == 10){
					notify();
				}
				total+=i;
				
			}
			
			
//			notify();
		}
		System.out.println("Already notified!!");
	}
}
