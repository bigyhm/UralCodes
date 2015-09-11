package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1068_Sum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		if (n <= 1) {
			for (int i = n; i <= 1; i++) {
				sum = sum + i;
			}
		} else {
			for (int i = 1; i <= n; i++) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
