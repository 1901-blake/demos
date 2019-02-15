package com.revature.math;

public class MathApplication {
	
	private Calculator calc = new Calculator();
	
	/**
	 * This method calculates the average of all arguments provided to it
	 * @param args is an array containing all individual params provided
	 * @return the average of all params
	 */
	public double complexComputation(double ...args) {
		double sum = 0;
		for (int i = 0; i < args.length ; i++) {
			sum = calc.add(sum, args[i]);
		}
		
		return calc.divide(sum, args.length);
	}

}
