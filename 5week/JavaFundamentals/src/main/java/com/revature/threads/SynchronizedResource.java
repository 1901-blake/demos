package com.revature.threads;

public class SynchronizedResource {
	
	synchronized void blockingMethod() {
		try {
			System.out.println(Thread.currentThread().getName() + " entered block method");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " exited block method");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
