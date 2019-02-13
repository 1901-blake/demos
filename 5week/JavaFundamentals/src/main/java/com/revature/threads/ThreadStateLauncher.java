package com.revature.threads;

public class ThreadStateLauncher {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t2 = new Thread(new SleepyThread());
		Thread t1 = new Thread(new WaitingThread(t2));
		
		System.out.println(t2.getState()); // should be new
		t2.start();
		System.out.println(t2.getState()); // should be runnable
		
		Thread.sleep(1000);
		t1.start();
		System.out.println(t2.getState()); // should be timed waiting
		
		Thread.sleep(1000);
		System.out.println(t1.getState()); // waiting for t2 to finish sleeping
		
		Thread.sleep(4000);
		System.out.println(t2.getState()); // should be terminated
	}
}
