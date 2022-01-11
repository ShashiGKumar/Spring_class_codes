package com.te.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springbean.beanconfig.Configu;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container=new AnnotationConfigApplicationContext(Configu.class);
        Pet pet = container.getBean(Pet.class);
        pet.doThing();
    }
}
