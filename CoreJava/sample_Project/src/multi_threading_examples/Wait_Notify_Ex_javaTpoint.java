package multi_threading_examples;

class Customer {
	int amount=10000;

	synchronized void withdraw(int amount) {								//withdraw method starts
		System.out.println("going to withdraw...");
		
		if(this.amount<amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			}
			catch(Exception e){}
		}
		
		this.amount-=amount;
		System.out.println("withdraw completed...");
		}																	//withdraw method ends
	
	synchronized void deposit(int amount) {								//deposit method starts
		System.out.println("going to deposit...");
		this.amount+=amount;
		System.out.println("deposit completed... ");
//		notify();
	}																	//deposit method ends
}//customer class ends

public class Wait_Notify_Ex_javaTpoint {
	public static void main(String args[]) {
		final Customer c=new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}
