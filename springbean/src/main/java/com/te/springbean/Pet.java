package com.te.springbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Pet {
	
	String name;
	@Autowired
	Animal animal;
	
	public void doThing() {
		if(animal.isPet()) {
			animal.eat();
			animal.makeSound();
		}else {
			System.out.println("this is not pet");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	

}
