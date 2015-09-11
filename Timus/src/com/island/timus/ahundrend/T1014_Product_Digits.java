package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1014_Product_Digits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int numberCopy = number;
		if (number == 1) {
			System.out.println(1);
			return;
		}
		if (number == 0) {
			System.out.println(10);
			return;
		}
		int[] values = { 9, 8, 7, 6, 5, 4, 3, 2 };
		int[] result = new int[20];

		for (int i = 0, j = 0; i < 8; i++) {
			if (number % values[i] == 0) {
				number = number / values[i];
				if (number % values[i] == 0) {
					result[j] = values[i];
					j++;
					i--;
					continue;
				} else {
					result[j] = values[i];
					j++;
				}
			} else {
				continue;
			}
		}
		if (number != 1) {
			System.out.println(-1);
		} else {
			for (int i = 19; i >= 0; i--) {
				if (result[i] != 0) {
					System.out.print(result[i]);
				}
			}
		}
		System.out.println();

	}

}
