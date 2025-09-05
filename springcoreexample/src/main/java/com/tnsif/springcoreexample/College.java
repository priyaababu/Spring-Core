package com.tnsif.springcoreexample;

public class College {
	private student student;
	
	public College() {
		System.out.println("College object is created");
	}
	public void setStudent(student student) {
		this.student = student;
	}
	public void show() {
		System.out.println("Welcome to college");
		student.display();
	 
	}
	

}
