package com.LambdaAndCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(22);
		al.add(55);
		al.add(88);
		al.add(88);
		System.out.println(al);
		Collections.sort(al, new Mycomparator());
		System.out.println(al);
	}

}
