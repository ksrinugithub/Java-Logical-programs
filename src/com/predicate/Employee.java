package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}

	public void show() {
		System.out.println("name of the employee:" + name + " ------" + "salary of the employee:" + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("srinu", 1000));
		al.add(new Employee("venu", 5000));
		al.add(new Employee("hari", 4000));
		al.add(new Employee("sri", 2500));
		al.add(new Employee("venkat", 9000));
		al.add(new Employee("battu", 8000));

	
		Predicate<Employee> p = e -> e.salary > 2000;
		for (Employee e : al) {
			if (p.test(e)) {	
				System.out.println(e.name + "------" + e.salary);

			}

		}

	}

}
