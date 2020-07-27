package com.capg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DistinctCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prefix="aa";
		AtomicInteger counter = new AtomicInteger(0);
		String[] sArr={"aaryanna", "aayanna", "airianna", "alassandra",
		             "allanna", "allannah", "allessandra", "allianna", "allyanna",
		             "anastaisa", "anastashia", "anastasia", "annabella", "annabelle",
		             "annebelle"};
		List<String> list1 = Arrays.asList(sArr);
		StringBuilder sb1 = new StringBuilder();
		
		/*
		 * list1.stream().filter(a->a.startsWith(prefix)).distinct().map(String::
		 * toCharArray).map(Arrays::asList).distinct()
		 */
		
		  for(String s:sArr) {
		  
		  if(s.startsWith(prefix)) { StringBuilder sb = new StringBuilder(); char[]
		  c=s.toCharArray(); List<Character> l1 = new ArrayList<>(); for(char c1:c) {
		  l1.add(c1); }
		  
		  l1.stream().distinct().forEach(a->sb.append(a));
		  
		  System.out.println(s+"----->"+String.valueOf(sb));
		  
		  
		  }else { System.out.println(s+" doesnt start with the prefix "+prefix); } }
		 

	}

}
