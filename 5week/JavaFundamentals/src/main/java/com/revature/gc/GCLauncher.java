package com.revature.gc;

import java.util.ArrayList;

public class GCLauncher {
	public static void main(String[] args) {
		Trash t = new Trash(1, "hello");
		
		ArrayList<Trash> trashArray = new ArrayList<Trash>();
		for(int i = 2; i < 100000000; i++) {
			new Trash(i, "hello");
//			trashArray.add(new Trash(i, new String("sdlkfjasdlkfjasdlkfjasdlkasdf")));
//			if(i %100000 == 0 ) {
//				System.out.println("created i: " + i);
//			}
		}
	}

}
