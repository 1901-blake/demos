package com.revature.threads;

public class BlockingThread implements Runnable{
	private SynchronizedResource sr;

	/**
	 * @param sr
	 */
	public BlockingThread(SynchronizedResource sr) {
		super();
		this.sr = sr;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " trying to enter block method");
		sr.blockingMethod();
		System.out.println(Thread.currentThread().getName() + " now complete");
	}

	
}
