package Threads;
//1. Write a Java program to create a basic Java thread that prints "Hello, Java!" when executed.
public class Thread_Task1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			//System.out.println(isAlive());
			System.out.println("hello Java!  ");
		 
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) throws InterruptedException {
		Thread_Task1 t=new Thread_Task1();
		t.run();
		 
		 
	}

}
