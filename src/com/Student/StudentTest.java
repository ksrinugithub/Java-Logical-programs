package com.Student;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("srinu", 100));
		al.add(new Student("chinnii", 50000));
		al.add(new Student("venu", 1100));
		al.add(new Student("venkat", 2100));
		al.add(new Student("vasu", 3100));
		al.add(new Student("hari", 0100));
		System.out.println(al);
	}

}
