package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1005_Stone_Pile_3 {

	public static void main(String[] args) {
		int sum = 0;
		int bagSize = 0;
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] weights = new int[count];

		for (int i = 0; i < count; i++) {
			weights[i] = in.nextInt();
		}
		for (int i = 0; i < count; i++) {
			sum = sum + weights[i];
		}
		bagSize = sum / 2 + 1;
		int[] package01 = new int[bagSize];

		package01[0] = sum;

		for (int i = 0; i < weights.length; i++) {
			package01 = setPackage01(weights, i, package01);
		}
		System.out.println(package01[bagSize - 1]);
	}

	private static int[] setPackage01(int[] weights, int cursor, int[] package01) {
		int bagSize = package01.length;
		int sum = 0;
		int[] packagecopy = new int[package01.length];
		System.arraycopy(package01, 0, packagecopy, 0, package01.length);
		for (int i = 0; i < weights.length; i++) {
			sum = sum + weights[i];
		}
		for (int i = 1; i < bagSize; i++) {
			if (cursor == 0) {
				if (i < weights[cursor]) {
					package01[i] = sum;
				} else {
					package01[i] = sum - 2 * weights[cursor];
				}
			} else if (i >= weights[cursor]) {
				package01[i] = Math.min(Math.abs(packagecopy[i - weights[cursor]] - 2 * weights[cursor]),
						packagecopy[i]);
			} else {
				package01[i] = packagecopy[i];
			}
		}
		return package01;
	}
}
