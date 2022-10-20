package com;
class Task implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		//System.out.println("user defined thread "+t);
		String name = t.getName();
		System.out.println(name);
		for(int i=1;i<=10;i++) {
			System.out.println(name +" "+i);
			try {
			Thread.sleep(1000);
			}catch (Exception e) {}
		}
	}
}
public class MoreThanOneThreadInSameTask {
	public static void main(String[] args) throws Exception{
		Task tt = new Task();
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);
		Thread t3 = new Thread(tt);
		Thread.sleep(2000);
		Thread t = Thread.currentThread();
		System.out.println("Main thread "+t);
		System.out.println("first thread "+t1.isAlive());
		System.out.println("second thread "+t2.isAlive());
		System.out.println("third thread "+t3.isAlive());
			t1.setName("My 1st Thread");
			t2.setName("My 2nd Thread");
			t3.setName("My 3rd Thread");
			t1.start();
			Thread.sleep(10000);
			t2.start();
			Thread.sleep(10000);
			t3.start();
		System.out.println("first thread "+t1.isAlive());
		System.out.println("second thread "+t2.isAlive());
		System.out.println("third thread "+t3.isAlive());
	}

}
