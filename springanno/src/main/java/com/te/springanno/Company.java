package com.te.springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
    @Value("good")
	String review;
    @Value("8")
	int personality;
	@Autowired
	Employee e;
	
	
//	
//	public void setReview(String review) {
//		this.review = review;
//	}
//
//
//
//	public void setPersonality(int personality) {
//		this.personality = personality;
//	}
//
//
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}



	@Override
	public String toString() {
		return "Company [review=" + review + ", personality=" + personality + ", e=" + e + "]";
	}
	
}

