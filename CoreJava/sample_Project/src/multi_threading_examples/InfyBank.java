package multi_threading_examples;

class TransactionThread extends Thread {
	public void run() {
		try {
			for(int index=0;index<5;index++) {
				System.out.println("Transaction"+Thread.currentThread().getId()+" is being processed");
	            Thread.sleep((int)(Math.random()*10000));
	        }
        }
		catch(InterruptedException interruptedException) {
			System.out.println("Transaction interrupted");
        }
	}
}
class InfyBank {
	public static void main(String a[]) {
		System.out.println("Welcome to InfyBank's main thread");
		TransactionThread [] transactionThread={new TransactionThread(),new TransactionThread(),new TransactionThread()};
		for(int index=0;index<transactionThread.length;index++){
			System.out.println("transactionThread.length is = "+transactionThread.length);
			transactionThread[index].start();
		}
	}
}
