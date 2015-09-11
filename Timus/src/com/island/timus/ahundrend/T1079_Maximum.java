package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1079_Maximum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int valueN = in.nextInt();

		while (valueN != 0) {
			int[] a = new int[valueN+1];
			buildUp(a);
			int max = Integer.MIN_VALUE;
			int cursor = -1;
			for (int i = 0; i < valueN+1; i++) {
				if (max < a[i]) {
					max = a[i];
					cursor = i;
				}
			}
			System.out.println(max);
			valueN = in.nextInt();
		}

	}

	private static void buildUp(int[] a) {
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			if (i % 2 == 0) {
				a[i] = a[i / 2];
			} else {
				a[i] = a[i / 2] + a[i / 2 + 1];
			}
		}

	}
}
