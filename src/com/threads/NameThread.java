package com.threads;

public class NameThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		one.start();
		two.start();
		two.join();
		three.start();
	}

}
