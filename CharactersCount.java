package com.capg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Mapper{
	Function<String,Integer> getDistinctCharactersCount()
	{
		return a->{			
			List<Character> l = new ArrayList<>();
			
			  for (char ch : a.toCharArray()) 
			  	{ 		  
		            l.add(ch); 
		        } 
		  			
			return (int) l.stream().distinct().count();
		          };		
	}
}


class Filter {

	Predicate<String> nameStartingWithPrefix(String prefix) 
	{		
		return a->a.toLowerCase().startsWith(prefix.toLowerCase());
	}	

}


public class CharactersCount{
	
	public static void main(String[] args) {
		
		String input ="AAshsish";
		String prefix="aa";
		
		Filter filter = new Filter();
		boolean boolValue =(filter.nameStartingWithPrefix(prefix)).test(input);
		System.out.println("boolValue-->"+boolValue);
		
		if(boolValue==true)
		{
			Mapper mapper = new Mapper();
			int characterCount = mapper.getDistinctCharactersCount().apply(input);
			System.out.println("characterCount--->"+characterCount);
		}
		
	}

}

