package com.capg;

public class Numerology {
	
	

	public static void main(String[] args) {
		
		String input ="S. KANAPATHY";
		String modInput = input.toUpperCase().replaceAll("[^A-Z]", "");
		char[] c1 = modInput.toCharArray();
		
		String a = "A,I,J,Q,Y";
		String b = "B,K,R";
		String c = "C,G,L,S";
		String d = "D,M,T";
		String e = "E,H,N,X";
		String f = "U,V,W";
		String g = "O,Z";
		String h = "F,P";
		
		int sum=0;
		int finalSum=0;
		
		for(int i=0;i<c1.length;i++)
		{
			if(a.contains(String.valueOf(modInput.charAt(i)))) sum = sum+1;
			if(b.contains(String.valueOf(modInput.charAt(i)))) sum = sum+2;
			if(c.contains(String.valueOf(modInput.charAt(i)))) sum = sum+3;
			if(d.contains(String.valueOf(modInput.charAt(i)))) sum = sum+4;
			if(e.contains(String.valueOf(modInput.charAt(i)))) sum = sum+5;
			if(f.contains(String.valueOf(modInput.charAt(i)))) sum = sum+6;
			if(g.contains(String.valueOf(modInput.charAt(i)))) sum = sum+7;
			if(h.contains(String.valueOf(modInput.charAt(i)))) sum = sum+8;
		}
		
		while(sum>0)
		{
			int k=sum%10;
			finalSum=finalSum+k;
			sum=sum/10;
		}
		
		System.out.println("finalSum--->"+finalSum);

	}

}
