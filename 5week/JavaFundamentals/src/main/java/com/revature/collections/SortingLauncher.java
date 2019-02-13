package com.revature.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortingLauncher {
	private static Logger log = LogManager.getRootLogger();
	
	public static void main(String[] args) {
		log.debug("creating list of candy");
		List<Candy> candy = new ArrayList<>();
		candy.add(new Candy(1, "Jolly Rancher", "Hard Candy", 3));
		candy.add(new Candy(2, "Sour Patch Kids", "Gummy", 8));
		candy.add(new Candy(3, "Candy Corn", "Chalk", 1));
		candy.add(new Candy(4, "Jaw Breaker", "Pain", 6));
		candy.add(new Candy(5, "Snickers", "Chocolate", 7));
		
		log.trace("original list of candy");
		candy.forEach(c -> log.trace("\t" + c));
		
		
		log.debug("sorting candy naturally");
		Collections.sort(candy); // uses comparable to determine order
		log.trace("candy after natural sorting");
		candy.forEach(c -> log.trace("\t" + c));
		
		
		log.debug("Sorting candy by name");
//		candy.sort(new NameComparator());
		candy.sort((one, two) -> {
			return one.getName().compareTo(two.getName());
		});
		log.trace("Candy after sort by name");
		candy.forEach(c -> log.trace("\t" + c));
	}

}
