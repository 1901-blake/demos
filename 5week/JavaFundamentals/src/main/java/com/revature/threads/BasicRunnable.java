package com.revature.threads;

public class BasicRunnable implements Runnable{

	@Override
	public void run() {
		while (true) {
			System.out.println("Hello From Basic Runnable");
		}
	}

}
