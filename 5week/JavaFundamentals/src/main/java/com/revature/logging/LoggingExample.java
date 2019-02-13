package com.revature.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * 
 * @author USER
 *
 */
public class LoggingExample {
	private static Logger log = LogManager.getRootLogger();
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		log.trace("This is a trace log it is very granular");
		log.debug("This is a debug log it is still code level but not as granular as trace");
		log.info("This is an info log, the application started");
		log.warn("This is a warn log, something odd occured but UX not suffering");
		log.error("This is something that should not have happend and UX is suffering but app still likely running");
		log.fatal("This is a fatal log, the program should probably crash");
		
	}
}
