package com;
class Demo implements Runnable {
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int i=0;i<10;i++) {
		System.out.println(name +" "+i);
		try {
			Thread.sleep(500);
			
			if(name.equals("A") && i==5) {
				wait();
			}
			if(name.equals("B") && i==7) {
				notify();
				wait();
			}
		} catch (Exception e) {
			
		}
	}
	}
}
public class WaitNotifyAndNotifyAll {

	public static void main(String[] args) {
	Demo obj = new Demo();
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj);
	Thread t3 = new Thread(obj);
	t1.setName("A");
	t2.setName("B");
	t3.setName("C");
	t1.start();
	t2.start();
	t3.start();
	}

}
