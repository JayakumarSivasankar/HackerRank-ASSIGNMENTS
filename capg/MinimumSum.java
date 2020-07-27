package com.capg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumSum {

	public static void main(String[] args) {

		int[] input = {2,3};
		int k=1;
		List<Integer> l1 = new ArrayList<>();
		for(int a :input)
		{
			l1.add(a);
		}
		
		double sum =0;
		while(k>0)
		{
			Collections.sort(l1,Collections.reverseOrder());
			double d = Math.ceil((float) l1.get(0)/2);
			l1.set(0, (int) d);			
			k = k-1;
		}
		
		for(int s :l1)
		{
			sum = sum+s;
		}
		System.out.println("sum--->"+sum);

	}

}
