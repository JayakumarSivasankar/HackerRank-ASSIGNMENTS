package com.capg;

public class Numerology {	
	
	public static void main(String[] args) {
		
		String a="AIJQY";
		String b="BKR";
		String c="CGLS";
		String d="DMT";
		String e="EHNX";
		String f="UVW";
		String g="OZ";
		String h="FP";
		
	int sum=0;

		String input = "S. KANAPATHY";
		String modifiedInput = input.toUpperCase().replaceAll("[^A-Z]", "");
		System.out.println(modifiedInput);
		
		char[] ch =modifiedInput.toCharArray();		
		for(Character c1 : ch)
		{
			
			if(a.contains(Character.toString(c1))) { sum+=1; continue;}
			if(b.contains(Character.toString(c1))) { sum+=2; continue;}
			if(c.contains(Character.toString(c1))) { sum+=3; continue;}
			if(d.contains(Character.toString(c1))) { sum+=4; continue;}
			if(e.contains(Character.toString(c1))) { sum+=5; continue;}
			if(f.contains(Character.toString(c1))) { sum+=6; continue;}
			if(g.contains(Character.toString(c1))) { sum+=7; continue;}
			if(h.contains(Character.toString(c1))) { sum+=8; continue;}
		}
		System.out.println("sum"+sum);
		
	int finalSum=0;
	int n=0;
	
		while(sum>0)
		{
			n=sum%10;
			finalSum+=n;
			sum=sum/10;
			
		}
		
		System.out.println("finalSum--->"+finalSum);
		

	}

}
