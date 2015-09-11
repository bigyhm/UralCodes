package com.island.timus.chundrend;

import java.util.Scanner;

public class T1225_Flags {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n == 1 || n == 2) {
			System.out.println(2);
			return;
		}

		int value = f(n);
		System.out.println(value);
	}

	private static int f(int n) {
		if (n == 3) {
			return 4;
		} else {
			return 2 * f(n - 1) - 2;
		}
	}
}
