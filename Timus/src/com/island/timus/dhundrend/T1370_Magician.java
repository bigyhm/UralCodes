package com.island.timus.dhundrend;

import java.util.Scanner;

public class T1370_Magician {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = in.nextInt();
		int rotation = in.nextInt();
		int[] numbers = new int[sum];

		for (int i = 0; i < sum; i++) {
			numbers[i] = in.nextInt();
		}

		int start = rotation % sum;
		if (start + 10 > sum) {
			for (int i = 0; i + start < sum; i++) {
				System.out.print(numbers[i + start]);
			}
			for (int i = 0; i < 10 - (sum - start); i++) {
				System.out.print(numbers[i]);
			}
		} else {
			for (int i = 0; i < 10; i++) {
				System.out.print(numbers[i + start]);
			}
		}

	}

}
