package com.capg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MaximumRepeatingCharacters {
	
	static Map<Character,Integer> map1 = new LinkedHashMap<>();
	
	public static char getMaxCharacter(List<Character> list )
	{
		list.stream().forEach(a->map1.put(a, Collections.frequency(list,a)));
		
		Map.Entry<Character, Integer> mapEntry = null;
		
		for(Map.Entry<Character, Integer> entry :map1.entrySet())
		{
			if(mapEntry==null || entry.getValue().compareTo( mapEntry.getValue())>0)
			{
				mapEntry = entry;
			}
		}
		
		return mapEntry.getKey();
	}

	public static void main(String[] args) {
		
		//String s="HelloWorld";
		 String s="abbcabaa";

		char[] c1 = s.toCharArray();
		
		List<Character> list1 = new ArrayList<>();
		
		for(char c2 : c1)
		{
			list1.add(c2);
		}
		
		char output = getMaxCharacter(list1 );
		
		System.out.println("Most Repeating charcter in given String-->"+output);
		
	}

}
