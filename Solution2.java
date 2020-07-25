
/*
 * Lottery coupons
 * 
 */
package com.capg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		
		int input=22;
		//int count = 0;

		List<Integer> countList = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		
		if(input<10)
		{
			System.out.println("No of ways to choose the winner--->"+input);
		}
		if(input>10)
		{
			for(int i=1;i<=input;i++)
			{
				int temp=i;
				int sum=0;
				while(temp>0)
				{
					int n=temp%10;
					temp=temp/10;
					sum+=n;
				}
				l.add(sum);
			}
			
			l.stream().forEach(a->countList.add(Collections.frequency(l,a)));
			
			/*
			 * for(int j=0;j<input;j++) { int element=l.get(j); if(l.get(j)!=0) {
			 * count=Collections.frequency(l, l.get(j));
			 * 
			 * countList.add(count);
			 * 
			 * }
			 * 
			 * for(int k=0;k<l.size();k++) { if(l.get(k)==element) l.set(k, 0); }
			 * 
			 * }
			 */
			Collections.sort(countList,Collections.reverseOrder());
			System.out.println("No of ways to choose the winner--->"+countList.get(0));
			
		}

	}

}
