/*
 * DevelopmentTeamThreshold
 * 
 */


package com.capg;

import java.util.*;

class Result {
	public static int count =0;

	public static void getnewHireCount(int currentTL ,int currentTeam,int threshold )
	{
		
		double currentPercent = ((float)currentTL/currentTeam)*100;
		currentPercent = Math.round(currentPercent);
		//System.out.println("currentPercent--->"+currentPercent);
		
		
		if(currentPercent<threshold)
		{
			count++;
			currentTL++;
			currentTeam++;
			currentPercent = ((float)currentTL/currentTeam)*100;
			currentPercent = Math.round(currentPercent);
			getnewHireCount( currentTL , currentTeam, threshold );
			
		}
		
		//System.out.println("count---->"+count);
		
		
	}

	public static int devTeam(List<List<Integer>> teams, int r) {

		for(int i=0;i<teams.size();i++)
		{
			List<Integer> tempList = teams.get(i);
			 int currentTL = tempList.get(0);
			 int currentTeam = tempList.get(1);
			 
			 
			 getnewHireCount(currentTL ,currentTeam,r );
			 
		}

		return count;
	}
}

public class Solution1 {
	public static void main(String[] args) {

		List<Integer> l1=Arrays.asList(1,2);
		List<Integer> l2=Arrays.asList(1,3);
		int threshold =50;
		List<List<Integer>> teams = new ArrayList<>();
		teams.add(l1);
		teams.add(l2);
		
		int newHireCount = Result.devTeam( teams,threshold);
		
		System.out.println("newHireCount-------->"+newHireCount);

	}

}
