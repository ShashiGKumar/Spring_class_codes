package com.te.springdependency;

public class Engine implements Garage{
	
	String name;
	double capacity;
	
//	public Engine() {
//		
//	}
	
	public void setName(String name) {
		this.name = name;
	}



	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}


//
//	public Engine(String name, double capacity) {
//		super();
//		this.name = name;
//		this.capacity = capacity;
//	}



	public void start() {
		System.out.println(name+" Engine has started of capacity "+capacity);
	}

}
