package com.te.springbean.beanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springbean.*;

@Configuration
@ComponentScan(basePackages = ("com.te.springbean","com.te.something"))
public class Configu {
//	@Bean("Dog")
//	public Dog getDog() {
//		return new Dog();
//	}
//	@Bean("Fish")
//	@Primary
//	public Fish getFish() {
//		return new Fish();
//	}
//	@Bean
//	public Yashwanth getYashwanth() {
//		return new Yashwanth();
//	}
//	@Bean
//	public Pet getPet() {
//		Pet pet=new Pet();
//		return pet;
////		return new Pet();
//	}

}
