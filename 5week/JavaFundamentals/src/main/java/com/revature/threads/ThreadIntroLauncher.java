package com.revature.threads;

public class ThreadIntroLauncher {
	public static void main(String[] args) {
		Thread t = new BasicThread();
		
		t.start();
		
		Thread runnableThread = new Thread(new BasicRunnable());
		runnableThread.start();
		
		while(true) {
			System.out.println("hello from main thread");
		}
		
		
	}
}
