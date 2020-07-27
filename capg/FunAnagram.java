package com.capg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunAnagram {

	public static void main(String[] args) {


		List<String> list1 = Arrays.asList("code", "doce", "ecod", "framer", "frame");
		List<String> list2 = new ArrayList<>();
		list2.addAll(list1);
		for(int i=0;i<list1.size();i++)
		{
			if(list2.get(i)!="###") {
			for(int j=i+1;j<list1.size();j++)
			{
			String a=list1.get(i);
			String b = list1.get(j);
			char[] c1=a.toCharArray();
			char[] c2=b.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			String a1=String.valueOf(c1);
			String b1=String.valueOf(c2);
			
			if(a1.equalsIgnoreCase(b1)) list2.set(j, "###");
			}
			System.out.println(list2);
			}
		}
		
		String[] sa= new String[list2.size()];
		int i=0;
		for(String ss:list2)
		{


			sa[i]=ss;
			i++;
			
		}


		Arrays.sort(sa);
		
		System.out.println("hgfg    "+Arrays.asList(sa));
		
		for(String ss:sa)
		{
			if(ss!="###")
			System.out.println(ss);
			
		}

	}

}
