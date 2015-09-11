package com.island.timus.chundrend;

import java.util.Scanner;

public class T1224_Spiral {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextInt();
		long M = in.nextInt();

		long value = 0;

		if (N <= M) {
			value = 2 * N - 2;
		} else {
			value = 2 * M - 1;
		}
		System.out.println(value);

	}
}
