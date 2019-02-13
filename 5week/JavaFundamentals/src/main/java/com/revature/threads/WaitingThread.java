package com.revature.threads;

public class WaitingThread  implements Runnable{
	private Thread other;

	/**
	 * @param other
	 */
	public WaitingThread(Thread other) {
		super();
		this.other = other;
	}

	@Override
	public void run() {
		try {
			other.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
