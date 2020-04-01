package scjp;

public class SynchronizedEx1 extends Thread{
	public static synchronized void main (String args[]) throws InterruptedException {
		SynchronizedEx1 se1 = new SynchronizedEx1();
		Thread t = new Thread(se1);
		t.start();
		System.out.print("hi !! \n");
		synchronized(t) {								//
			try {											//
				t.wait();									//
			}														//
			catch(InterruptedException e) {								//=> Synchronized block
																	//
			}													//
			System.out.print("bye !!");						//
		}												//
		
	}
}
