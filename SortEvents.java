package com.capg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEvents {

	public String comp1;
	public String comp2;

	public SortEvents() {
	};

	public SortEvents(String s1, String s2) {
		this.comp1 = s1;
		this.comp2 = s2;
	}

	class MyComparator implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {

			String tempS1 = "";
			String tempS2 = "";

			if (s1.contains("+")) {
				tempS1 = s1.replace(s1.substring(s1.indexOf("+"), s1.indexOf("+") + 2), "");
			} else {
				tempS1 = s1;
			}
			if (s2.contains("+")) {
				tempS2 = s2.replace(s2.substring(s2.indexOf("+"), s2.indexOf("+") + 2), "");
			} else {
				tempS2 = s2;
			}
			// System.out.println("--->"+tempS1+" "+tempS2);
			int i1 = Integer.parseInt(tempS1.replaceAll("[A-Za-z\\s+]+", ""));
			int i2 = Integer.parseInt(tempS2.replaceAll("[A-Za-z\\s+]+", ""));
			// System.out.println(i1+" "+i2);

			if (i1 < i2)
				return -1;
			if (i1 > i2)
				return 1;
			if (i1 == i2) {
				// sorting according to company name
				comp1.compareTo(comp2);
			}

			return 0;
		}

	}

	public String[] getEventsOrder(String c1, String c2, String[] c1eve, String[] c2eve) {

		List<String> l = new ArrayList<>();
		for (int i = 0; i < c1eve.length; i++) {
			l.add(c1 + " " + c1eve[i]);
			l.add(c2 + " " + c2eve[i]);
		}
		Collections.sort(l, new MyComparator());
		// System.out.println(l);

		String[] finalArray = l.toArray(new String[l.size()]);

		return finalArray;
	}

	public static void main(String[] args) {
		String cName1 = "abc";
		String cName2 = "cba";
		String[] c1eve = { "mo sa 45+2 Y", "a 13 G" };
		String[] c2eve = { "d 23 S f", "z 35 G" };

		SortEvents sortEvents = new SortEvents(cName1, cName2);
		String[] output = sortEvents.getEventsOrder(cName1, cName2, c1eve, c2eve);
		System.out.println(Arrays.toString(output));

	}

}
