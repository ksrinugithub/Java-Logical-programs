package com.LambdaAndCollection;

import java.util.Comparator;

public class MyComparatorr implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return (o1 < o2) ? -1 : (o1 > o2) ? +1 : 0;
	}

}
