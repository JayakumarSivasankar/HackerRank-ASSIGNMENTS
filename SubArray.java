package com.capg;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SubArray {
	
	int count =0;
	Set<List<Integer>>  s = new HashSet<>();
	
	public boolean findOdd(int a)
	{
		if(a%2 !=0)
		{
			return true;
		}
		return false;
	}
	
	public int maxSubArray(Integer[] a , int b,int index)
	{
		
		List<Integer> l = Arrays.asList(a);
		
		
		for(int i=1;i<=l.size();i++)
		{
			if(i==index || index>i) continue;		
			
			s.add(l.subList(index,i));
			//System.out.println("temp-->"+temp);
		}
		index++;
		if(index<l.size())
		{
			 maxSubArray( a ,  b, index);
		}
		
		
		Iterator<List<Integer>> iter = s.iterator();
		while(iter.hasNext())
		{
			count=0;
			
			List<Integer> lin =(List<Integer>) iter.next();
			for(int j=0;j<lin.size();j++)
			{
				boolean b1 = findOdd(lin.get(j));
				if(b1==true) count++;
				if(count>b)
				{
					iter.remove();
					break;
				}
			}
		}
		
		//System.out.println(s);
		
		return s.size();
		
	}

	public static void main(String[] args) {

	Integer[] inputArr= {2,1,2,1,3};
	int k=2;
	SubArray subArray = new SubArray();
	int maxPossible = subArray.maxSubArray(inputArr , k,0);
	
	System.out.println("maxPossible "+maxPossible);

	}

}
