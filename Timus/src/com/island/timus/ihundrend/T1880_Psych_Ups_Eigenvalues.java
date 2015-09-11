package com.island.timus.ihundrend;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class T1880_Psych_Ups_Eigenvalues {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Integer, Integer> all = new HashMap<Integer, Integer>();
		int firstNum = in.nextInt();
		for (int i = 0; i < firstNum; i++) {
			int value = in.nextInt();
			all.put(value, 1);
		}
		int secondNum = in.nextInt();
		for (int i = 0; i < secondNum; i++) {
			int value = in.nextInt();
			if (all.containsKey(value) && all.get(value) == 1) {
				all.put(value, 2);
			}
		}
		int thirdNum = in.nextInt();
		for (int i = 0; i < thirdNum; i++) {
			int value = in.nextInt();
			if (all.containsKey(value) && all.get(value) == 2) {
				all.put(value, 3);
			}
		}
		int counter = 0;
		Iterator iter = all.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			int val = (int) entry.getValue();
			if (val == 3) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
