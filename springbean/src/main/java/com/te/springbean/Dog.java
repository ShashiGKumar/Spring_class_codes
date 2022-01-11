package com.te.springbean;

public class Dog implements Animal{

	@Override
	public void makeSound() {
        System.out.println("bow bow bow");		
	}

	@Override
	public void eat() {
        System.out.println("it eats pedigree and rice");		
	}

	@Override
	public boolean isPet() {
		return true;
	}
	
	

}
