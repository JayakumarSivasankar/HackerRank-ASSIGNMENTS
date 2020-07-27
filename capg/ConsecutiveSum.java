package com.capg;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveSum {	

	public static List<String> slist = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int input=21;
		List<Integer> list1 = new ArrayList<>();
		
		for(int i=1;i<=input;i++)
		{
			list1.add(i);
		}
		
		getCombn(input , list1,0);
		
		
		
	}

	public static void getCombn(int input, List<Integer> list1, int i) {
		int sum=0;
		StringBuilder sb = new StringBuilder();
		//System.out.println("List--->"+list1.get(i) +"i--->"+i);
		if(i==10) {
			System.out.println(slist);
			System.exit(0);}
		for(int j=i;j<11;j++)
		{
			sum = sum+list1.get(j);
			sb.append(list1.get(j)).append(" ");
			
			if(sum==input) {
				slist.add(String.valueOf(sb));
				
				getCombn( input, list1,  i+1) ;					
			}
			
			if(sum>input) {				
				getCombn( input, list1,  i+1) ;					
			}
			
			
					
		}
		
		System.out.println("sum--->"+sum);
		
	}

}
