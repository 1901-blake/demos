package com.revature.threads;

public class BlockingLauncher {
	public static void main(String[] args) throws InterruptedException {
		SynchronizedResource sr = new SynchronizedResource();
		Thread t1 = new Thread(new BlockingThread(sr));
		Thread t2 = new Thread(new BlockingThread(sr));
		t1.start();
		t2.start();
		Thread.sleep(1000);
		System.out.println(t1.getName() + " state: " + t1.getState());
		System.out.println(t2.getName() + " state: " + t2.getState());
	}
}
