package com.revature.gc;

public class Trash {
	private int id;
	private String s;

	/**
	 * @param id
	 */
	public Trash(int id, String s) {
		super();
		this.id = id;
		this.s = s;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Removing Trash with Id: " + id + " from memory");
	}
	
}
