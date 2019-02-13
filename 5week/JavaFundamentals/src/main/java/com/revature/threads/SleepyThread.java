package com.revature.threads;

public class SleepyThread implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("sleepy thread started and will now sleep for 3 seconds");
			Thread.sleep(3000);
			System.out.println("sleepy thread done and will now terminate");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
