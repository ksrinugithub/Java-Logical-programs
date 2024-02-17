package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Student {
	private String name;
	private int roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;

	}

	public void show() {
		System.out.println("Student name is:" + name + "-------" + "Student roll is:" + roll);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Srinu", 386));
		al.add(new Student("balakrishna", 322));
		al.add(new Student("mouli", 312));
		al.add(new Student("basker", 313));
		System.out.println(al);
		Predicate<Student> p=s-> s.roll>312;
		for(Student s:al) {
			if(p.test(s)) {
				System.out.println(s.name+"-----"+s.roll);
				
			}
			
		}
	

	}

}
