package com.te.springbean;

public class Yashwanth implements Animal{

	@Override
	public void makeSound() {
        System.out.println("ahoooooooooooooo");		
	}

	@Override
	public void eat() {
        System.out.println("human pedigree");		
	}

	@Override
	public boolean isPet() {
		return false;
	}
	
	

}
