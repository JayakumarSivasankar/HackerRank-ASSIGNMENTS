package com.capg;


import java.util.HashSet;
import java.util.Iterator;


public class StringPatterns {
	static HashSet<String> patterns=new HashSet<>();
	
	
	public static int calculateWays(int wordLen,int maxVowels) {
		
		char[] arr=new char[wordLen];
		generateAllPatterns(wordLen,arr,0);
		System.out.println(patterns);
		
		StringBuilder sb2= new StringBuilder();
		for(int k=1;k<=maxVowels+1;k++)
		{
			sb2.append("V");
		}
		
		//System.out.println(sb2.toString());
		
		//Check All patterns with maxVowels
		Iterator<String> iter = patterns.iterator();
		while(iter.hasNext())
		{
			if(iter.next().contains(String.valueOf(sb2)))
					{
				iter.remove();
					}
		}
		System.out.println(patterns);
		
		int total=1;
		int sum=1;
		int finalSum=0;
		for(String fin : patterns)
		{
			sum=1;
			char[] c = fin.toCharArray();
			for(int f=0;f<c.length;f++)
			{
				total=1;
				if(c[f]=='C') total =total*21;
				if(c[f]=='V') total =total*5;
				sum*=total;
				System.out.println("sum-->"+sum);
			}
			finalSum+=sum;
		}
		System.out.println("finalSum--->"+finalSum);
		
		return 0;
	}
	static void generateAllPatterns(int n, char arr[], int i) 
		{ 
			if (i == n)  
			{ 
				printPatterns(arr, n); 
			return; 
			} 

				// First assign "C" at ith position 
				// and try for all other permutations 
				// for remaining positions 
				arr[i] ='C'; 
					generateAllPatterns(n, arr, i + 1); 

				// And then assign "V" at ith position 
				// and try for all other permutations 
				// for remaining positions 
				arr[i] ='V'; 
				generateAllPatterns(n, arr, i + 1); 
		} 
	
	
	// Function to print the output 
		static void printPatterns(char arr[], int n) 
		{ 
			StringBuilder builder=new StringBuilder();
		    for (int i = 0; i < n; i++)  
		    { 
		    	builder.append(arr[i]);
		       // System.out.print(arr[i]+" "); 
		    } 
		    patterns.add(String.valueOf(builder));
		   // System.out.println(builder); 
		} 

	public static void main(String[] args) {
		calculateWays(4, 1);

	}

}