package com.revature.exceptions;

public class ExceptionLauncher {
	
	
	public static void main(String[] args) {
		PizzaFactory pf = new PizzaFactory("Full Circle Pizza");
		PizzaFactory notAsGoodPizza = new PizzaFactory("Little Ceasers");
		for(int i=0; i<15; i++) {
			try {
				System.out.println(pf.getPepperoniPizza());
			} catch (NoPizzaException e) {
				try {
					System.out.println(notAsGoodPizza.getPepperoniPizza());
				} catch (NoPizzaException e1) {
					System.out.println("The world is over Little Ceasers had no pizza");
				}
			}
		}
	}
}
