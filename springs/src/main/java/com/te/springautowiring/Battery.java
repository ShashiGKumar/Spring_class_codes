package com.te.springautowiring;

public class Battery {
	
	String name;

	public Battery(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Battery [name=" + name + "]";
	}
	
}
