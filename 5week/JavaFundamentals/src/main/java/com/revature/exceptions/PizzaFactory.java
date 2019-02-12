package com.revature.exceptions;

public class PizzaFactory {
	private int numberPizzas = 5;
	private String name;
	
	/**
	 * @param name
	 */
	public PizzaFactory(String name) {
		super();
		this.name = name;
	}


	public String getPepperoniPizza() throws NoPizzaException {
		
		if (numberPizzas > 0) {
			numberPizzas--;
			return "Here is your pepperoni Pizza from " + this.name;
		} else {
			throw new NoPizzaException();
		}
	}
}
