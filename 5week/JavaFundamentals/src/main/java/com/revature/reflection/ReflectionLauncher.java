package com.revature.reflection;

import java.lang.reflect.Field;

import com.revature.collections.Candy;

public class ReflectionLauncher {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Candy c = new Candy(1, "Sour Gummy Worms", "Gummy", 9);
		System.out.println(c.getName());
		
		Class<Candy> candyClass = Candy.class;
		for (Field f: candyClass.getDeclaredFields()) {
			System.out.println(f);
		}
		Field nameField = candyClass.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(c, "Gummy Bears");
		System.out.println(c.getName());
	}
}
