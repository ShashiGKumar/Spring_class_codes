package com.te.springdependency;

public class Car {
	String name;
	Garage e;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setE(Garage e) {
		this.e = e;
	}
	public Car() {
		
	}
	public Car(Garage e) {
		super();
		this.e=e;
	}
	public void move() {
		e.start();
		System.out.println("Lambo car is moving");
	}

}
