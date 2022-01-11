package com.te.springbean;

public class Fish implements Animal{

	@Override
	public void makeSound() {
		System.out.println("boooooobooooooo");
	}

	@Override
	public void eat() {
        System.out.println("fish");		
	}

	@Override
	public boolean isPet() {
		return true;
	}
	
	

}
