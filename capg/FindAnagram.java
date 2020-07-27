package com.capg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagram {
	
	public static int findNumOfOperationsReq(String s1Sorted, String s2Sorted) {
		int counter=0;
		

		for (int k = 0; k < s1Sorted.length(); k++) {

			if (!(s1Sorted.contains(String.valueOf(s2Sorted.charAt(k))))) {
				counter++;

			}

		}
		
		return counter;
	}
	
	public static List<Integer> findAnag(String[] a , String[] b)
	{
		List<Integer> l1 = new ArrayList<>();
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			String s1 = a[i];
			String s2 = b[i];
						
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);	
			
			String s1Sorted =String.valueOf(c1);
			String s2Sorted =String.valueOf(c2);
			
			if(s1.length()!=s2.length()) l1.add(-1);
			
			if((s1.length()==s2.length()) && s1Sorted.equalsIgnoreCase(s2Sorted)) l1.add(0);
			
			if((s1.length()==s2.length()) && !(s1Sorted.equalsIgnoreCase(s2Sorted)))
			{
				count =findNumOfOperationsReq(s1Sorted,s2Sorted);
				l1.add(count);
			}
			
		}
		
		return l1;
	}
	


	public static void main(String[] args) {
		
		  String[] a = {"a","jk","abb","mn","abc"};
		  String[] b = {"bb","kj","abd","op","def"};
		 
		
		/*
		 * String[] a = {"tea","tea","act"}; String[] b = {"ate","toe","acts"};
		 */

		System.out.println("output--->"+findAnag(a ,b));
		

	}

}
