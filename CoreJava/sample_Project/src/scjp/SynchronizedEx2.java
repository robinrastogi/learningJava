package scjp;

public class SynchronizedEx2 extends Thread {
//	public static synchronized void main(String args[]) throws InterruptedException {
	public static void main(String args[]) throws InterruptedException {
		Thread t = new Thread();
		t.start();
		synchronized(t) {
			System.out.print("X \n");
			t.wait(100000);
			System.out.print("Y");
		}
	}
}
