package com.LambdaAndCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		al.add(55);
		al.add(88);
		al.add(99);
		al.add(10);
		al.add(05);
		System.out.println(al);
		Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? +1 : 0;
		Collections.sort(al, c);
		System.out.println(al);

	}

}
