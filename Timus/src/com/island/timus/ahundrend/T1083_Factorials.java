package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1083_Factorials {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String exclamations = in.nextLine();
		int k = exclamations.length() - 1;
		int modValue = n % k;
		int value = 1;
		if (0==modValue) {
			for (int i = 0; i < n / k; i++) {
				value = value * (n - i * k);
			}
		} else {
			for (int i = 0; i < n / k; i++) {
				value = value * (n - i * k);
			}
			value = value * modValue;
		}
		System.out.println(value);
	}
}
