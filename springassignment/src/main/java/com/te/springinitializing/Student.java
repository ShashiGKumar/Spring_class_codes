package com.te.springinitializing;

public class Student {
	
	int id;
    String name;
    double marks;
    String subname;
    
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
//	public Student() {
//		
//	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}
    
    public void write() {
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(marks);
    	System.out.println(subname);
		System.out.println("Students are writing");
	}

}
