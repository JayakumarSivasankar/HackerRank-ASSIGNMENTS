package com.capg;

import java.util.ArrayList;
import java.util.List;

public class Sum {
	
	public static int getNumOfPossible(int max , List<Integer> l,int index)
	{
		if(l.size()==index) return 0;
		if(max<0) return 0;
		if(max==0) return 1;
		
		int current = l.get(index);
		int count=0;
		while(max>=0)
		{			
			
			count=count+getNumOfPossible(max, l, index+1);
			max=max-current;
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		int total=21;
		
		int max=(int) Math.ceil((float)total/2);
		List<Integer> l = new ArrayList<>();
		for(int i=1;i<=max;i++)
		{
		l.add(i);	
		}
		
		int output = getNumOfPossible(max,l,0);;
		
		System.out.println("Max ways-->"+output);

		

	}

}
