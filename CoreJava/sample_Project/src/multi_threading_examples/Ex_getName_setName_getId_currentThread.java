package multi_threading_examples;

class Ex_getName_setName_getId_currentThread extends Thread {
	public void run() {
		System.out.println("reference to the currently executing thread object => "+Thread.currentThread().getName()+ "\n ...and its priority is =>"+ Thread.currentThread().getPriority());
//		System.out.println("running...");
//		System.out.println("running thread:"+Thread.currentThread().getName()+" priority is:"+Thread.currentThread().getPriority()); 
    }
	
	public static void main(String args[]) {
		
		Ex_getName_setName_getId_currentThread t1=new Ex_getName_setName_getId_currentThread();
		Ex_getName_setName_getId_currentThread t2=new Ex_getName_setName_getId_currentThread();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Name of t1: "+t1.getName()+" assigned as Minimum priority");
		System.out.println("Name of t2: "+t2.getName()+" assigned as Maximum priority");
		System.out.println("id of t1: "+t1.getId());
		
		t1.start();
		t2.start();
//		t1.start();
		
		/* Maximum priority will start first then minimum priority*/
		
//		t1.setName("Robin Rastogi");
//		System.out.println("After changing name of t1:"+t1.getName());
	}
}
