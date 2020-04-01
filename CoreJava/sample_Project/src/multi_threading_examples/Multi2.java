package multi_threading_examples;

class Multi2 extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){
		  System.out.println("hey"+"\n");
	    try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);
	  }  
	 }  
	 public static void main(String args[]){  
	  Multi2 t1=new Multi2();  
	  Multi2 t2=new Multi2();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}  
