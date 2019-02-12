package com.revature.objects;

public class ObjectLauncher {
	public static void main(String[] args) {
		Child child = new Child();
		child.method("hello");
		child.method(1);
		child.method("hello", 5);
		
		Car c = new Car(1, "Ford", 1996, "Crown Vic", "black");
		System.out.println("car make: " + c.getMake());
		
		c.setYear(2000);
		System.out.println("car year: " + c.getYear());
		
		System.out.println(c);

		Car c2 = new Car(1, "Ford", 2000, "Crown Vic", "black");
		
		if(c.equals(c2)) {
			System.out.println("cars are equal");
		} else {
			System.out.println("cars are not equal");
		}
		
	}
}
