package com.revature.strings;

public class StringsLauncher {
	public static void main(String[] args) {
		String s = "hello";
		String s2 = "hello";
		System.out.println(s == s2); // true

		String s3 = "he" + "llo";
		System.out.println(s == s3);
		
		String s4 = "h";
		String s5 = "ello";
		String s6 = s4 + s5;
		System.out.println(s == s6);
		System.out.println("s6 = " + s6);
		
		String s7 = "helloworld".substring(0, 5);
		System.out.println("s7 = " + s7);
		s7 = s7.intern(); // look for the string in the string pool
		System.out.println(s == s7);
		System.out.println(s.equals(s7));
		
		
		String s8 = new String("hello");
		System.out.println(s == s8);
		
		// if you need to manipulate strings use StringBuilder or StringBuffer
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" world");
		sb.reverse();
		System.out.println(sb);
	}
}
