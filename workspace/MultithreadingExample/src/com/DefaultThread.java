package com;

public class DefaultThread {

	public static void main(String[] args) {
	
		Thread t = Thread.currentThread();
		System.out.println(t);
		String name = t.getName();
		int priority = t.getPriority();
		ThreadGroup tg = t.getThreadGroup();
		System.out.println(name);
		System.out.println(priority);
		System.out.println(tg.getName());
		t.setName("My Thread");
		t.setPriority(2);
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
	}

}
