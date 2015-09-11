package com.island.timus.khundrend;

import java.util.Scanner;

public class T2025_Line_Fighting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {

			int n = in.nextInt();
			int k = in.nextInt();
			int[] arr = new int[k];
			int base = n / k;
			for (int j = 0; j < k; j++) {
				arr[j] = base;
			}
			int remain = n % k;
			for (int j = 0; j < remain; j++) {
				arr[j]++;
			}

			int sum = 0;
			for (int j = 0; j < k - 1; j++) {
				for (int m = j + 1; m < k; m++) {
					sum = sum + arr[j] * arr[m];
				}
			}
			System.out.println(sum);
		}

	}
}
