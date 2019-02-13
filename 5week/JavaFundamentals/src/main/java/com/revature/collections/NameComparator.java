package com.revature.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Candy> {

	@Override
	public int compare(Candy o1, Candy o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
