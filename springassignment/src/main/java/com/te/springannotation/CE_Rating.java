package com.te.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CE_Rating {
	
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("annotation.xml");
		Company bean = container.getBean(Company.class);
		System.out.println(bean);
	}

}
