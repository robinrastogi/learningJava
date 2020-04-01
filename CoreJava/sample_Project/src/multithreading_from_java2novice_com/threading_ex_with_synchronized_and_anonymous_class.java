package multithreading_from_java2novice_com;

//Program of synchronized method  
class Table2 {
	synchronized void printTable(int n) {							//synchronized method
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
  
class MyThread5 extends Thread {
	Table2 t;
	MyThread5(Table2 t) {
		this.t=t;
	}
	public void run() {
		t.printTable(5);
		}
}  

class MyThread6 extends Thread {
	Table2 t;
	MyThread6(Table2 t) {
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}
  
public class threading_ex_with_synchronized_and_anonymous_class {
	public static void main(String args[]) {
		Table2 obj = new Table2();							//only one object
		MyThread5 t1=new MyThread5(obj);
		MyThread6 t2=new MyThread6(obj);
		t1.start();
		t2.start();
	}
}
