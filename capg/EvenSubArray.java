package com.capg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class EvenSubArray {
	
	public static HashSet<List<Integer>> sh = new HashSet<>();
	
	public static void getPossibleCombn(List<Integer >a , int index )
	{
		//List<List<Integer>> list = new ArrayList<>();
		
		for( int j=1;j<=a.size();j++)
		{			
			if(index == j) continue;
			if(index>j) continue;
			sh.add(a.subList(index, j));
		}
		
		if(index<a.size())
		{
			System.out.println(sh);
			getPossibleCombn(a ,   index+1 );
		}
		
		
	}

	public static void main(String[] args) {
		int[] a = {2,1,2,1,3};
		int k = 2;
		List<Integer> list1 = new ArrayList<>();
		for(int i:a)
		{
			list1.add(i);
		}

		getPossibleCombn(list1 , 0 );
		
		Iterator<List<Integer>> iter = sh.iterator();
		
		while(iter.hasNext())
		{
			List<Integer> listInt = iter.next();
			int count =0;
			for(int j=0;j<listInt.size();j++)
			{
				if(listInt.get(j)%2 != 0) count++;
				
			}
			
			if(count>k) iter.remove();
			
		}
		
		System.out.println("final--->"+sh);
		
	}

}
