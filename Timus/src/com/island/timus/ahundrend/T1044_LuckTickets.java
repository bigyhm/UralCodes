package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1044_LuckTickets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int max = (int) Math.pow(10, number) - 1;
		int count = 0;
		for (int i = 0; i <= max; i++) {
			int[] values = new int[number];
			int value = i;
			for (int j = 0; j < number; j++) {
				values[j] = value / (int) Math.pow(10, number - j - 1);
				value = value % (int) Math.pow(10, number - j - 1);
			}
			int middle = 0;
			int firstVal = 0;
			int lastVal = 0;

			if (number % 2 == 1) {
				middle = number / 2 + 1;
				for (int k = 0; k < middle; k++) {
					firstVal = firstVal + values[k];
				}
				for (int k = middle - 1; k < number; k++) {
					lastVal = lastVal + values[k];
				}
			} else {
				middle = number / 2;
				for (int k = 0; k < middle; k++) {
					firstVal = firstVal + values[k];
				}
				for (int k = middle; k < number; k++) {
					lastVal = lastVal + values[k];
				}
			}
			if (firstVal == lastVal) {
				count++;
			} else {
				continue;
			}

		}
		System.out.println(count);
	}
}
