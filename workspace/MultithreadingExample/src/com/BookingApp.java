package com;

class Book implements Runnable{
	int avl=2;
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl >0) {
			System.out.println(name +" got the ticket");
			avl = avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
}
public class BookingApp {

	public static void main(String[] args) {
		Book bb1 = new Book();						// avl = 1
		//Book bb2 = new Book();						// avl = 1
		//Book bb3 = new Book();						// avl = 1
		Thread t1 = new Thread(bb1);
		Thread t2 = new Thread(bb1);
		Thread t3 = new Thread(bb1);
		t1.setName("Ravi");
		t2.setName("Ajay");
		t3.setName("Vijay");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
