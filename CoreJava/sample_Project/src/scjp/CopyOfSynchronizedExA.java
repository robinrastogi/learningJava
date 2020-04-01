package scjp;

public class CopyOfSynchronizedExA {
	public static void main(String args[]) {
		CopyOfSynchronizedExB seb = new CopyOfSynchronizedExB();
		seb.start();
		
//		synchronized(seb) {
//			try {
//				System.out.print("waiting for seb to complete...\n");
//				seb.wait();
//			}
//			catch(InterruptedException e) {}
			System.out.print("Total is: " + seb.total);
//		}
	}
}

class CopyOfSynchronizedExB extends Thread {
	int total=0;
	public void run() {
//		synchronized(this) {
			for(int i=0;i<10;i++) {
				total+=i;
			}
//			notify();
//		}
	}
}
