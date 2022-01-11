package com.te.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyClass {
	
	public static void main(String[] args) {
//		ConfigurableApplicationContext con=new AnnotationConfigApplicationContext(BeanConfig.class);
		AbstractApplicationContext con=new AnnotationConfigApplicationContext(BeanConfig.class);
		Demo bean = (Demo)con.getBean("demo");
		con.registerShutdownHook();
		bean.name();
//		con.close();
		System.out.println(bean.hashCode());
	}

}
