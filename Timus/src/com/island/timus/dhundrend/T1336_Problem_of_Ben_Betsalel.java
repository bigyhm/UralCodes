package com.island.timus.dhundrend;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class T1336_Problem_of_Ben_Betsalel {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();

		long k = findK(n);
		long m = (long) (Math.sqrt(n * k) * k);
		System.out.println(n * n);
		System.out.println(n);
	}

	private static long findK(long n) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		long sqrted = (long) Math.sqrt(n);
		long result = 1L;
		for (int i = 2; i < sqrted; i++) {
			if (n % i == 0) {
				n = n / i;
				map.put(i, 1);
			}
			while (n % i == 0) {
				n = n / i;
				map.put(i, map.get(i) + 1);
			}
		}
		if (map.isEmpty()) {
			result = n;
		} else {
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() % 2 == 1) {
					result = result * entry.getKey();
				}
			}
		}
		return result;
	}

}
