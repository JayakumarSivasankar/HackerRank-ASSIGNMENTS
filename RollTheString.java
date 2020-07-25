package com.capg;

import java.util.ArrayList;
import java.util.List;

public class RollTheString {

	public static void main(String[] args) {
		String s = "abz";
		int[] roll = {3, 2, 1};
		
		List<Character> l = new ArrayList<>();
		
		  for (char ch : s.toCharArray()) 
		  	{ 		  
	            l.add(ch); 
	        } 
		 
		 for(int i=0;i<roll.length;i++)
		 {
			 for(int j=0;j<roll[i];j++)
			 {
			 if(l.get(i)=='z') l.set(i,(char)96);
			 
			 l.set(i, (char) (l.get(i)+1)) ;
			 
			 }
			 System.out.println(l);
		 }

		 	

	}

}
