package Threads;

 

 

  class A extends Thread {
	 public void run() {
		 for(int i=0;i<10;i++) {
			 System.out.println("hii thread in class 1");
			 
		 }
	 }
  }
	class B extends Thread{
		public void run() {
			for(int i=0;i<10;i++) {
				 System.out.println("hii thread in class 2");
			 }
			
		}
	}

 public class Thread_implimentation{
	 
	public static void main(String args[]) {
		 
		A t=new A();
		t.run();
		B b = new B();
		b.run();
		
		
		 t.start();
		 b.start();
		
		
	}

}
