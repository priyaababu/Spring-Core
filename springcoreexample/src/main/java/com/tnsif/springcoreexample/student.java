package com.tnsif.springcoreexample;

public class student {
	private String name;

	
	public void setName(String name) {
		this.name = name;
	}
	public student() {
		System.out.println("Student object created");
	}
	public void display() {
		System.out.println("Student name: " +name);
	}
}
