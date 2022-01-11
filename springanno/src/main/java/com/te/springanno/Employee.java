package com.te.springanno;

public class Employee {
	
	String rating="average";
	int infrastructure=9;
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	public void setInfrastructure(int infrastructure) {
		this.infrastructure = infrastructure;
	}
	@Override
	public String toString() {
		return "Employee [rating=" + rating + ", infrastructure=" + infrastructure + "]";
	}

	

}

