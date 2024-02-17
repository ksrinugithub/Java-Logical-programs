package com.Student;

public class Student {
	String name;
	int roll;

	Student(String name, int roll) {
		this.name = name;
		this.roll = roll;

	}

	public void show() {
		System.out.println("name of the student is:" + name + ":" + "roll number of the student is:" + roll);
	}

}
