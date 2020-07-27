package com.capg;

public class PrimeString {
	static final int MOD =1000000007;
	public static int countPrimeStrings(String number,  int i) 
	{ 
		if (i == 0) 
	        return 1;
		
		int count=0;
			
			for(int j=1;j<=6;j++)
			{
				if(i-j>i) continue;
				int i1 = Integer.parseInt(number.substring(i - j, i));
				if(i-j>=0 && number.charAt(i-j)!='0'&&java.math.BigInteger.valueOf(i1).isProbablePrime(1))
				{
					
					count += countPrimeStrings(number,i-j); 
					count %= MOD; 
				}
			}
			return count;
	}
	public static void main(String[] args) {


		String s1 ="3175";
		int len = s1.length();
		
		int cc = countPrimeStrings(s1, len);
		
		System.out.println(cc);

	}

}
