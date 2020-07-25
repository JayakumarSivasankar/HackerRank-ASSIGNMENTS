package com.capg;

import java.util.ArrayList;
import java.util.List;

public class Penagram {

	public static void main(String[] args) {			
		
		String input="The quick brown fox jumps over the lazy dog";
		
		String modInput = input.toLowerCase().replaceAll("[^a-z]", "");
		
		int inputLength = input.replaceAll("[\\s]", "").length();		
		int modInputLength = modInput.length();
		
		//System.out.println(inputLength +"  "+ modInputLength);
		
		if(inputLength == modInputLength) {
		char[] c =modInput.toCharArray();
		List<Character> l = new ArrayList<>();
		for(Character c1 : c)
		{
			l.add(c1);
		}
		
		Long count =l.stream().distinct().count();
		//System.out.println(count);
		if(count==26) {
			System.out.println("Given String is pennagram");
		}
		else
		{
			System.out.println("Not a pennagram");
		}
		}
		else
		{
			System.out.println("Not a pennagram");
		}

	}

}
