package com.te.springdependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("configuration.xml");
		Car car = container.getBean(Car.class);
		car.move();
//		Engine engine = container.getBean(Engine.class);
//		engine.start();
		new Engine();
	}

}
