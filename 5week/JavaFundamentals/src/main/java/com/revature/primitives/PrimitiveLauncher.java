package com.revature.primitives;

public class PrimitiveLauncher {
	public static void main(String[] args) {
		byte b = 5; // byte is a single byte in size
		System.out.println("byte: " + b);
		
		short s = 5; // short is 2 bytes signed
		System.out.println("short: " + s);
		
		char c = 'c'; // or can assign a number, 2 bytes unsigned
		System.out.println("char: " + c);
		
		char ch = 95;
		System.out.println("charNum: " + ch);
		
		int i = 5; // int is 4 bytes
		System.out.println("int: " + i);
		
		long l = 5;// long is 8 bytes
		System.out.println("long: " + l);
		
		
		float f = 12.1f; // float is 4 bytes and can have decimals
		System.out.println("fload: " + f);
		
		double doub = 12.1; // double is 8 bytes
		System.out.println("double: " + doub);
		
		boolean bool = true;
		System.out.println("boolean: " + bool);
		
	}
}
