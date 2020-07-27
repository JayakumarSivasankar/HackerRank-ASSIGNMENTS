/**
 * Approximate Matching
 */

package com.capg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MyComparator implements Comparator<String>
{
	public int compare(String s1 , String s2)
	{
		if(s1.length()>s2.length()) return -1;
		if(s1.length()<s2.length()) return 1;
		return 0;
	}
}

public class Solution3 {
static List<String> hash = new ArrayList<>();;

	public static void getPatterns(String s , int index) {
		
		for(int i=1;i<=s.length();i++)
		{
			if(i==index || index>i) continue;
			
			String sub = s.substring(index,i);
			hash.add(sub);
		}
		
		if(index<s.length()) 
			{			
			getPatterns(s ,  index+1);
			}
		
		
	}
	
	public static void main(String[] args) {
		String text = "nothing";
		String prefixString = "bruno";
		String suffixString = "ingenious";
		/*
		 * String text = "ab"; String prefixString = "b"; String suffixString = "a";
		 */
				
		List<String> prefixHash = new ArrayList<>();
		List<String> suffixHash = new ArrayList<>();
		getPatterns(text , 0);
		System.out.println(hash);
		
		hash = hash.stream().distinct().collect(Collectors.toList());
		
		for(int i=0;i<hash.size();i++)
		{
			if(prefixString.endsWith(hash.get(i)))
			{
				prefixHash.add(hash.get(i));
			}
			
			if(suffixString.startsWith(hash.get(i)))
			{
				suffixHash.add(hash.get(i));
			}
		}
		
		Collections.sort(prefixHash , new MyComparator());
		Collections.sort(suffixHash , new MyComparator());
		
		System.out.println(prefixHash);
		System.out.println(suffixHash);
		String output ="";
		System.out.println("##-->"+text.lastIndexOf(suffixHash.get(0)));
		System.out.println("##-->"+text.lastIndexOf(prefixHash.get(0)));
		
		if(text.lastIndexOf(suffixHash.get(0)) > text.lastIndexOf(prefixHash.get(0)))
		{
			output = text.substring(text.indexOf(prefixHash.get(0)) , 
				text.indexOf(suffixHash.get(0))+suffixHash.get(0).length() );
		}
		else
		{
			output = text.substring(text.indexOf(suffixHash.get(0)) , 
					text.indexOf(prefixHash.get(0)) );
		}
		
		System.out.println("output---->"+output);

	}		

}
