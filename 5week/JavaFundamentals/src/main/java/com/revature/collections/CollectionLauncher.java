package com.revature.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionLauncher {
	public static void main(String[] args) {
		List<String> strings = new LinkedList<String>();
		strings.add("hello");
		System.out.println(strings.get(0));
		System.out.println(strings.size());
		System.out.println(strings);
		strings.add("world");
		strings.add("dynamic");
		strings.add("world");
		strings.add("Mississippi");
		strings.add("Arkansas");
		strings.add("Alaska");
		strings.add("Kansas");
		strings.add("Florida");
		strings.add("California");
		strings.add("Washington");
		System.out.println(strings);
		strings.forEach(str -> {
			System.out.println("lambda: " + str);
		});

		// streams
		strings = strings.stream().filter(ele -> {
			return ele.length() < 7;
		}).collect(Collectors.toList());

		System.out.println("filtered list");
		System.out.println(strings);

		Set<String> setOfStrings = new HashSet<>();
		setOfStrings.add("hello");
		setOfStrings.add("two");
		setOfStrings.add("all");
		for (String ele : setOfStrings) {
			System.out.println(ele);
		}
		System.out.println(setOfStrings);

		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Potato");
		myMap.put(2, "Mango");
		myMap.put(25, "Mango");
		Set<Integer> keys = myMap.keySet();
		for (int key : keys) {
			System.out.println("key = " + key + " and value = " + myMap.get(key));
		}

		System.out.println(myMap.get(2) == myMap.get(25));

	}
}
