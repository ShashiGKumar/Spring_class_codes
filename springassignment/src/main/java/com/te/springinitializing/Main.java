package com.te.springinitializing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("configuration.xml");
		Student bean = container.getBean(Student.class);
		bean.write();
	}

}
