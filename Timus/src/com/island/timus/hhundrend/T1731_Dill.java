package com.island.timus.hhundrend;

import java.util.Scanner;

public class T1731_Dill {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for (int i = 0; i < n - 1; i++) {
			System.out.print(i + 1);
			System.out.print(" ");
		}
		System.out.print(n);
		System.out.println("");
		for (int i = 2; i <= m; i++) {
			System.out.print(i * n);
			System.out.print(" ");
		}
		System.out.println(m * n + n);
	}
}
