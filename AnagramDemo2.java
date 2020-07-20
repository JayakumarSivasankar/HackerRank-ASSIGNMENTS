package com.cap;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class AnagramDemo2 {

	public int findDiff(String s1, String s2)

	{
		int count = 0;

		char tempArray1[] = s1.toCharArray();
		char tempArray2[] = s2.toCharArray();
		Arrays.sort(tempArray1);
		Arrays.sort(tempArray2);

		//System.out.println(String.valueOf(tempArray1) + " " + String.valueOf(tempArray2));

		for (int k = 0; k < tempArray1.length; k++) {

			if (!(String.valueOf(tempArray1).contains(String.valueOf(String.valueOf(tempArray2).charAt(k))))) {
				count++;

			}

		}

		return count;
	}

	public String sortChar(String temp) {
		String op = null;
		for (int j = 0; j < temp.length(); j++) {
			char tempArray[] = temp.toCharArray();
			Arrays.sort(tempArray);
			op = String.valueOf(tempArray);
		}
		// System.out.println(temp +" "+op);
		return op;

	}

	public void noOfManipulation(String[] s1, String[] s2) {
		List<String> l1 = Arrays.asList(s1);
		List<String> l2 = Arrays.asList(s2);
		LinkedHashMap<Integer, Integer> lm = new LinkedHashMap<>();

		for (int i = 0; i < l1.size(); i++) {
			if (l1.get(i).length() != l2.get(i).length()) {
				lm.put(i, -1);
			}
			if (l1.get(i).equals(l2.get(i))) {
				lm.put(i, 0);
			} else if (l1.get(i).length() == l2.get(i).length() && sortChar(l1.get(i)).equals(sortChar(l2.get(i)))) {
				lm.put(i, 0);
			} else if (l1.get(i).length() == l2.get(i).length()) {
				int fincount = findDiff(l1.get(i), l2.get(i));
				lm.put(i, fincount);
			}
		}

		System.out.println(lm);

	}

	public static void main(String[] args) {

		// String[] s1 = { "tea", "tea", "act" };
		// String[] s2 = { "ate", "toe", "acts" };

		String[] s1 = { "a", "jk", "abb", "mn", "abc" };
		String[] s2 = { "bb", "kj", "bbc", "op", "def" };
		AnagramDemo2 adm = new AnagramDemo2();
		adm.noOfManipulation(s1, s2);

	}

}
