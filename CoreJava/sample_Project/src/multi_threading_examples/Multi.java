package multi_threading_examples;

/*Program to explain sleep(), start(), run() and join() methods */

class Multi extends Thread {
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println(i+1);
			System.out.println(i+2);
			
		}
	}
	
	public static void main(String args[]) {
		Multi t1=new Multi();
		Multi t2=new Multi();
		Multi t3=new Multi();
		
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2: "+t2.getName());
		System.out.println("Name of t3: "+t3.getName());
		t1.start();
		
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			t1.join(1500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		t2.start();
		t3.start();
		
//		t1.run();
//		t2.run();
		
	}
}  
