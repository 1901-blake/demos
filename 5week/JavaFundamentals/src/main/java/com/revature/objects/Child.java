package com.revature.objects;

public class Child extends Parent {
	@Override
	public void method(String s) {
		System.out.println("Child called with string: " + s);
	}
	
	// this method is overloaded
	public void method(int i) {
		System.out.println("child called with int: " + i);
	}
	
	public void method(String s, int i) {
		System.out.println("child called with string: " + s + " and int: " + i);
	}
}
